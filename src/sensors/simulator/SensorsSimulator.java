/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors.simulator;

import gui.SimulatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SimulatorFrame gui = new SimulatorFrame();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               gui.setVisible(true);
            }
        });
        
        new Thread(){
            @Override
            public void run() {

                while(true) {
                    System.out.println("Try to start signals stream...");
                    
                    try {
                        Socket s = new Socket("localhost", 60010);
                        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                        System.out.println("Connected to signals stream.");
                        gui.getBtn1().addActionListener(new ActionListener()
                        {
                            @Override
                            public void actionPerformed(ActionEvent e)
                            {
                                sentMsg(out, "Btn1");
                            }
                        });
                        break;

                    } catch (UnknownHostException e) {

                    } catch (IOException e) {
 
                    }
                    
                    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
                }
            }
        }.start();
        
        // Connect to log source
        javax.swing.JTextArea logField = gui.getLogPannel();
        while(true)
        {
            System.out.println("Try to connect to LOG stream...");
            ServerSocket ss;
            try {
                ss = new ServerSocket(60011);

                Socket s = ss.accept();

                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String line = null;
                System.out.println("Connected to LOG stream.");
                while ((line = in.readLine()) != null) {
                    String currentText = logField.getText();
                    String newTextToAppend = currentText + "\n" + line;
                    logField.setText(newTextToAppend);
                }
            } catch (IOException e) {
                
            }
 
            try {Thread.sleep(1000);} catch (InterruptedException ex) {}
        }
    }
    
    private static void sentMsg(BufferedWriter out, String msg)
    {
        try {
            out.write(msg);
            out.newLine();
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(SensorsSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
