/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors.simulator;

import gui.SimulatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        gui.getTouchPanelSelect1().addItemListener(new ItemListener()
        {
            boolean continueTouch = false;
            
            @Override
            public void itemStateChanged(ItemEvent event)
            {
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
                                    sentMsg(out, "Btn1");
                                    try {Thread.sleep(100);} catch (InterruptedException ex) {}
                                }
                            }
                        }.start();
                    }
                    else if(item.equals("One tch"))
                    {
                        sentMsg(out, "Btn1");
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
