/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors.simulator;

import gui.SimulatorFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import org.json.simple.JSONObject;

/**
 *
 * @author ASimionescu
 */
public class SensorsSimulator {

    static boolean appConnected = false;
    static BufferedWriter out = null;
    static SimulatorFrame gui = new SimulatorFrame();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               gui.setVisible(true);
            }
        });
        
        
        gui.getCameraPanelUploadImageBtn().addActionListener(new ActionListener()
        {
            private final JFileChooser fc = new JFileChooser();
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int x = fc.showOpenDialog(null);
                    if (x == JFileChooser.APPROVE_OPTION)
                    {
                        File fileToBeSent = fc.getSelectedFile();
                        String filepath = fileToBeSent.getAbsoluteFile().getPath();
                        int ellipsis = 30;
                        if (filepath.length()>ellipsis) {
                            filepath = "..."+filepath.substring(filepath.length()-ellipsis, filepath.length());
                        }
                        gui.setCameraPanelFilenameText(filepath);
                        
                        String mimetype= new MimetypesFileTypeMap().getContentType(fileToBeSent);
                        String type = mimetype.split("/")[0];
                        if(type.equals("image"))
                        {
                            BufferedImage imagebuff = ImageIO.read(fileToBeSent);
                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            ImageIO.write( imagebuff, "jpg", baos );
                            baos.flush();
                            byte[] imageInByte = baos.toByteArray();
                            baos.close();
                            String strBuff = new String(imageInByte, StandardCharsets.UTF_8);
                            
                            // Send to app
                            JSONObject jsonObj = new JSONObject();
                            jsonObj.put("appId", 829);
                                JSONObject dataObj = new JSONObject();
                                dataObj.put("rawData", strBuff);
                            jsonObj.put("data", dataObj);
                            sentMsg(out, jsonObj.toJSONString());
                            jsonObj.clear();
                            
                            // Update GUI
                            JLabel label = new JLabel(new ImageIcon(imagebuff));
                            gui.getCameraPanelRealCapture().add(label);
                            gui.getCameraPanelRealCapture().repaint();
                        }
                        else 
                        {
                            System.out.println("It's NOT an image");
                        }
                    }
                }
                catch (Exception ex) {
                    
                }
            }
        });
        
        gui.getTouchPanelSelect1().addItemListener(new ItemListener()
        {
            boolean continueTouch = false;
            String touchPayload = null;
            
            @Override
            public void itemStateChanged(ItemEvent event)
            {
                JSONObject jsonObj = new JSONObject();
                jsonObj.put("appId", 1029);
                    JSONObject dataObj = new JSONObject();
                    dataObj.put("value", true);
                jsonObj.put("data", dataObj);
                touchPayload = jsonObj.toJSONString();

                if (event.getStateChange() == ItemEvent.SELECTED)
                {
                    String item = event.getItem().toString();

                    if (item.equals("Continue") && !continueTouch)
                    {
                        System.out.println("Start continous touch.");
                        continueTouch = true;
                        new Thread(){
                            @Override
                            public void run() {
                                while(continueTouch)
                                {
                                    sentMsg(out, touchPayload);
                                    try {Thread.sleep(100);} catch (InterruptedException ex) {}
                                }
                            }
                        }.start();
                    }
                    else if(item.equals("One tch"))
                    {
                        sentMsg(out, touchPayload);
                    }
                    else
                    {
                        continueTouch=false;
                    }

                    System.out.println(item);
                }
            }
        });
        
        appConnected=false;
        gui.setSystemPanelApplicationValue("OFFLINE");
        new Thread()
        {
            @Override
            public void run()
            {
                while(true)
                {
                    System.out.println("Try to start signals stream...");
                    try
                    {
                        Socket s = new Socket("localhost", 60010);
                        out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                        System.out.println("Connected to signals stream.");
                        break;
                    }
                    catch (UnknownHostException e) {

                    } catch (IOException e) {
 
                    }
                    
                    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
                }
            }
        }.start();
        
        // Connect to log source
        reconnect();
    }
    
    private static void sentMsg(BufferedWriter out, String msg)
    {
        System.out.println("sentMsg("+msg+")");
        if (!appConnected)
        {
            return;
        }
        
        try
        {
            out.write(msg);
            out.newLine();
            out.flush();
        }
        catch (IOException ex)
        {
            // Conection lost
            appConnected=false;
            gui.setSystemPanelApplicationValue("OFFLINE");
            System.out.println("Conection lost!");
            reconnect();
        }
    }
    
    private static void reconnect()
    {
        while(!appConnected)
        {
            System.out.println("Try to connect to LOG stream...");
            ServerSocket ss;
            try
            {
                ss = new ServerSocket(60011);
                Socket s = ss.accept();
                appConnected=true;
                gui.setSystemPanelApplicationValue("ONLINE");
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                System.out.println("Connected to LOG stream.");
                
                new Thread()
                {
                    @Override
                    public void run()
                    {
                        String line = null;
                        try
                        {
                            while ((line = in.readLine()) != null)
                            {
                                gui.addLog(line);
                            }
                        }
                        catch (IOException ex)
                        {
                            appConnected=false;
                            gui.setSystemPanelApplicationValue("OFFLINE");
                            System.out.println("Conection lost!");
                            reconnect();
                        }
                
                    }
                }.start();
                
            }
            catch (IOException e) {
                
            }
 
            try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        }
    }
}
