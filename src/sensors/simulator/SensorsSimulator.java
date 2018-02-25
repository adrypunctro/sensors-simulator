/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors.simulator;

import System.TCPManager;
import System.VA_DEBUG;
import gui.SimulatorFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author ASimionescu
 */
public class SensorsSimulator {

    static boolean appConnected = false;
    static BufferedWriter outBuff = null;
    static SimulatorFrame gui = new SimulatorFrame();
    static TCPManager serv = null;
    static TCPManager cli = null;
    
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
                            //ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            //ImageIO.write( imagebuff, "jpg", baos );
                            //baos.flush();
                            //byte[] imageInByte = baos.toByteArray();
                            //baos.close();
                            //String strBuff = new String(imageInByte, StandardCharsets.UTF_8);
                            
                            String strBuff = TCPManager.encodeToString(imagebuff, "jpg");
                            
                            // Send to app
                            JSONObject jsonObj = new JSONObject();
                            jsonObj.put("appId", 829);
                                JSONObject dataObj = new JSONObject();
                                dataObj.put("rawData", strBuff);
                            jsonObj.put("data", dataObj);
                            sentMsg(jsonObj.toJSONString());
                            jsonObj.clear();
                            
                            // Update GUI
                            gui.getCameraPanelRealCapture().changePic(imagebuff);
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
                                    sentMsg(touchPayload);
                                    try {Thread.sleep(100);} catch (InterruptedException ex) {}
                                }
                            }
                        }.start();
                    }
                    else if(item.equals("One tch"))
                    {
                        sentMsg(touchPayload);
                    }
                    else
                    {
                        continueTouch=false;
                    }

                    System.out.println(item);
                }
            }
        });
        
        serv = new TCPManager(TCPManager.SERVER);
        serv.setConfig("localhost", 60010);
        serv.setName("SensorsSimulator-SIG");
        serv.asyncConnect();
        
        appConnected=false;
        gui.setSystemPanelApplicationValue("OFFLINE");
        cli = new TCPManager(TCPManager.CLIENT);
        cli.setCallback((boolean connected) -> {
            appConnected=connected;
            if (connected) {
                gui.setSystemPanelApplicationValue("ONLINE");
            }
            else {
                gui.setSystemPanelApplicationValue("OFFLINE");
            }
        });
        cli.setConfig("localhost", 60020);
        cli.setName("SensorsSimulator-LOGs");
        cli.asyncConnect();
        new Thread()
        {
            @Override
            public void run()
            {
                while(true)
                {
                    String msg = cli.readMessage();
                    //System.out.println("readed: "+readBuff);
                    VA_DEBUG.INFO("[Debug Programm]Received="+msg, true, 1);
                    //String[] list = readBuff.split("##");
                    //for (String msg : list)
                    {
                        if (msg != null && !msg.isEmpty())
                        {
                            TCPManager.Packet packet = TCPManager.unpack(msg);
                            VA_DEBUG.INFO("[Debug Programm] ("+packet.appId+","+packet.name+")", true, 1);
                            switch(packet.appId)
                            {
                                case 1:
                                {
                                    String dbgprint = (String)packet.data.get("value");
                                    if (dbgprint.length()>300)
                                    {
                                        dbgprint = dbgprint.substring(0, 300)+"...("+dbgprint.length()+")";
                                    }
                                    gui.addLog(dbgprint);
                                    break;
                                }
                                case 20:
                                {
                                    String imageStr = (String)packet.data.get("value");
                                    BufferedImage imagebuff = TCPManager.decodeToImage(imageStr);
                                    gui.getRobotStatusWiewCamera().changePic(imagebuff);
                                    break;
                                }
                                case 30:
                                {
                                    String imageStr = (String)packet.data.get("image");
                                    BufferedImage imagebuff = TCPManager.decodeToImage(imageStr);
                                    String firstname = (String)packet.data.get("firstname");
                                    String lastname = (String)packet.data.get("lastname");
                                    gui.getRobotStatusWiewPersonIdentityImage().changePic(imagebuff);
                                    gui.setRobotStatusWiewPersonIdentityFirstnameValue(firstname);
                                    gui.setRobotStatusWiewPersonIdentityNameValue(lastname);
                                    break;
                                }
                            }
                        }   
                    }
                }
            }
        }.start();
    }
    
    
    
    
    
    private static void sentMsg(String msg)
    {
        System.out.println("sentMsg("+msg+")");
        boolean sent = serv.writeMessage(msg);
    }
    
}
