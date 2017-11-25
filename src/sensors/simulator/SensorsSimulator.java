/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors.simulator;

import gui.SimulatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
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
        
        
        try {
            Socket s = new Socket("localhost", 60010);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

            gui.getBtn1().addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    sentMsg(out, "Btn1");
                }
            });
            
            gui.getBtn2().addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    sentMsg(out, "Btn2");
                }
            });
            
            gui.getBtn3().addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    sentMsg(out, "Btn3");
                }
            });

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
