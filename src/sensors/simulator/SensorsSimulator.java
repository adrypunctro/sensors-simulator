/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors.simulator;

import System.TCPClient;
import System.TCPServer;
import gui.SimulatorFrame;
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
import java.nio.charset.StandardCharsets;
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
    static BufferedWriter outBuff = null;
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
                            sentMsg(outBuff, jsonObj.toJSONString());
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
                                    sentMsg(outBuff, touchPayload);
                                    try {Thread.sleep(100);} catch (InterruptedException ex) {}
                                }
                            }
                        }.start();
                    }
                    else if(item.equals("One tch"))
                    {
                        sentMsg(outBuff, touchPayload);
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
        TCPServer serv = new TCPServer();
        serv.setCallback((BufferedWriter out) -> {
            outBuff = out;
            System.out.println("Connected to signals stream.");
        });
        serv.setConfig("localhost", 60010);
        serv.setName("SensorsSimulator-SIG");
        serv.connect();
        
        // Connect to log source
        TCPClient cli = new TCPClient();
        cli.setCallback((BufferedReader in) -> {
            appConnected=true;
            gui.setSystemPanelApplicationValue("ONLINE");
            String line = null;
            while ((line = in.readLine()) != null)
            {
                gui.addLog(line);
            }
        });
        cli.setConfig("localhost", 60011);
        cli.setName("SensorsSimulator-LOG");
        cli.connect();
    }
    
    private static void sentMsg(BufferedWriter out, String msg)
    {
        System.out.println("sentMsg("+msg+")");
        if (!appConnected) {
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
        }
    }
    
}
