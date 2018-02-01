/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author adryp
 */
public class SimulatorFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    public SimulatorFrame() {
        initComponents();
    }

    public void writeLog()
    {
        
    }
    
    public JComboBox<String> getTouchPanelSelect1()
    {
        return touchPanelSelect1;
    }
    
    public JLabel getSystemPanelApplicationValue()
    {
        return systemPanelApplicationValue;
    }
    
    public void setSystemPanelApplicationValue(String text)
    {
        systemPanelApplicationValue.setText(text);
        if (text.equals("ONLINE"))
        {
            systemPanelApplicationValue.setForeground(Color.GREEN);
        }
        else
        {
            systemPanelApplicationValue.setForeground(Color.RED);
        }
    }
    
    public JButton getCameraPanelUploadImageBtn()
    {
        return cameraPanelUploadImageBtn;
    }
    
    public void setCameraPanelFilenameText(String text)
    {
        cameraPanelFilenameText.setText(text);
    }
    
    public JPanel getCameraPanelRealCapture()
    {
        return cameraPanelRealCapture;
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }
    
    public void addLog(String msg)
    {
        String currentText = errorLog.getText();
        String newTextToAppend = currentText + "\n" + msg;
        errorLog.setText(newTextToAppend);
    }
    
    public javax.swing.JTextArea getLogPannel()
    {
        return errorLog;
    }
    
    public javax.swing.JButton getBtn1()
    {
        return jButton11;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        logsPanel = new javax.swing.JPanel();
        logsScrollPane = new javax.swing.JScrollPane(errorLog);
        logsFilterLabel = new javax.swing.JLabel();
        logsFilterInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        sensorSimulatorPanel = new javax.swing.JPanel();
        touchPanel = new javax.swing.JPanel();
        touchPanelTitle = new javax.swing.JLabel();
        touchPanelSelect1 = new javax.swing.JComboBox<>();
        jCheckBox3 = new javax.swing.JCheckBox();
        touchPanelLabel1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        cameraPanel = new javax.swing.JPanel();
        cameraPanelTitle = new javax.swing.JLabel();
        cameraPanelRealCheckbox = new javax.swing.JCheckBox();
        cameraPanelUploadImageBtn = new javax.swing.JButton();
        cameraPanelFilenamePanel = new javax.swing.JPanel();
        cameraPanelFilenameText = new javax.swing.JLabel();
        cameraPanelRealCapture = new javax.swing.JPanel();
        cameraPanelUploadVideoBtn = new javax.swing.JButton();
        micPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        micPanel1Title = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        micPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        micPanel3Title = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        micPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        micPanel2Title = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        micPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        micPanel4Title = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        batteryPanel = new javax.swing.JPanel();
        batteryPanelTitle = new javax.swing.JLabel();
        batteryPanelSlider = new javax.swing.JSlider();
        jCheckBox10 = new javax.swing.JCheckBox();
        batteryPanelOnChargingCheckbox = new javax.swing.JCheckBox();
        jLabel36 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        robotStatusWiew1 = new javax.swing.JPanel();
        robotStatusWiewCamera = new javax.swing.JPanel();
        robotStatusPanel = new javax.swing.JLabel();
        robotStatusWiew5 = new javax.swing.JPanel();
        usagePanel = new javax.swing.JPanel();
        usagePanelCPULabel = new javax.swing.JLabel();
        usagePanelCPUValue = new javax.swing.JLabel();
        usagePanelTitle = new javax.swing.JLabel();
        usagePanelGPULabel = new javax.swing.JLabel();
        usagePanelGPUValue = new javax.swing.JLabel();
        usagePanelRAMLabel = new javax.swing.JLabel();
        usagePanelRAMValue = new javax.swing.JLabel();
        batteryLevelPanel = new javax.swing.JPanel();
        batteryLevelPanelTitle = new javax.swing.JLabel();
        batteryLevelPanelChargingLabel = new javax.swing.JLabel();
        batteryLevelPanelChargingValue = new javax.swing.JLabel();
        batteryLevelPanelLevelLabel = new javax.swing.JLabel();
        batteryLevelPanelLevelValue = new javax.swing.JLabel();
        systemPanel = new javax.swing.JPanel();
        systemPanelTitle = new javax.swing.JLabel();
        systemPanelApplicationLabel = new javax.swing.JLabel();
        systemPanelApplicationValue = new javax.swing.JLabel();
        systemPanelStateLabel = new javax.swing.JLabel();
        systemPanelStateValue = new javax.swing.JLabel();
        robotStatusWiewSelect5 = new javax.swing.JComboBox<>();
        robotStatusWiew2 = new javax.swing.JPanel();
        robotStatusWiewPersonIdentity = new javax.swing.JPanel();
        robotStatusWiewPersonIdentityImage = new javax.swing.JPanel();
        robotStatusWiewPersonIdentityNameLabel = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityNameValue = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityFirstnameLabel = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityFirstnameValue = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityBornLabel = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityBornValue = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityAgeLabel = new javax.swing.JLabel();
        robotStatusWiewPersonIdentityAgeValue = new javax.swing.JLabel();
        robotStatusWiewSelect2 = new javax.swing.JComboBox<>();
        robotStatusWiewSelect1 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        RunBtn = new javax.swing.JButton();
        SimulatedSensorsBtn = new javax.swing.JButton();
        RealSensorsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        logsPanel.setBackground(new java.awt.Color(51, 51, 51));
        logsPanel.setForeground(new java.awt.Color(204, 204, 204));

        logsScrollPane.setBackground(new java.awt.Color(51, 51, 51));

        logsFilterLabel.setForeground(new java.awt.Color(204, 204, 204));
        logsFilterLabel.setText("Filter:");

        logsFilterInput.setText("jTextField1");

        javax.swing.GroupLayout logsPanelLayout = new javax.swing.GroupLayout(logsPanel);
        logsPanel.setLayout(logsPanelLayout);
        logsPanelLayout.setHorizontalGroup(
            logsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logsScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logsFilterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logsFilterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        logsPanelLayout.setVerticalGroup(
            logsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logsFilterLabel)
                    .addComponent(logsFilterInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        touchPanel.setBackground(new java.awt.Color(153, 153, 153));

        touchPanelTitle.setText("Touch");

        touchPanelSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "One tch", "Two tch", "Continue" }));

        touchPanelLabel1.setText("Head");

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout touchPanelLayout = new javax.swing.GroupLayout(touchPanel);
        touchPanel.setLayout(touchPanelLayout);
        touchPanelLayout.setHorizontalGroup(
            touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(touchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(touchPanelTitle)
                    .addGroup(touchPanelLayout.createSequentialGroup()
                        .addComponent(touchPanelLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(touchPanelSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        touchPanelLayout.setVerticalGroup(
            touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(touchPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(touchPanelTitle)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, touchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(touchPanelLabel1)
                        .addComponent(touchPanelSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cameraPanel.setBackground(new java.awt.Color(153, 204, 255));

        cameraPanelTitle.setText("Camera");

        cameraPanelUploadImageBtn.setText("Upload Image");
        cameraPanelUploadImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraPanelUploadImageBtnActionPerformed(evt);
            }
        });

        cameraPanelFilenamePanel.setBackground(new java.awt.Color(255, 204, 204));

        cameraPanelFilenameText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cameraPanelFilenameText.setText("/dir/filename.avi");

        javax.swing.GroupLayout cameraPanelFilenamePanelLayout = new javax.swing.GroupLayout(cameraPanelFilenamePanel);
        cameraPanelFilenamePanel.setLayout(cameraPanelFilenamePanelLayout);
        cameraPanelFilenamePanelLayout.setHorizontalGroup(
            cameraPanelFilenamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cameraPanelFilenamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cameraPanelFilenameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cameraPanelFilenamePanelLayout.setVerticalGroup(
            cameraPanelFilenamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cameraPanelFilenameText, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        cameraPanelRealCapture.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout cameraPanelRealCaptureLayout = new javax.swing.GroupLayout(cameraPanelRealCapture);
        cameraPanelRealCapture.setLayout(cameraPanelRealCaptureLayout);
        cameraPanelRealCaptureLayout.setHorizontalGroup(
            cameraPanelRealCaptureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        cameraPanelRealCaptureLayout.setVerticalGroup(
            cameraPanelRealCaptureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cameraPanelUploadVideoBtn.setText("Upload Video");
        cameraPanelUploadVideoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraPanelUploadVideoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cameraPanelLayout = new javax.swing.GroupLayout(cameraPanel);
        cameraPanel.setLayout(cameraPanelLayout);
        cameraPanelLayout.setHorizontalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cameraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cameraPanelLayout.createSequentialGroup()
                        .addComponent(cameraPanelUploadImageBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cameraPanelUploadVideoBtn))
                    .addGroup(cameraPanelLayout.createSequentialGroup()
                        .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cameraPanelLayout.createSequentialGroup()
                                .addComponent(cameraPanelTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cameraPanelLayout.createSequentialGroup()
                                .addComponent(cameraPanelFilenamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(212, 212, 212)))
                        .addComponent(cameraPanelRealCapture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cameraPanelRealCheckbox)
                .addContainerGap())
        );
        cameraPanelLayout.setVerticalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cameraPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cameraPanelRealCapture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cameraPanelLayout.createSequentialGroup()
                        .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cameraPanelRealCheckbox)
                            .addComponent(cameraPanelTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cameraPanelFilenamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cameraPanelUploadImageBtn)
                            .addComponent(cameraPanelUploadVideoBtn))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        micPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton4.setText("Upload");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        micPanel1Title.setText("Microphone (Right)");

        javax.swing.GroupLayout micPanel1Layout = new javax.swing.GroupLayout(micPanel1);
        micPanel1.setLayout(micPanel1Layout);
        micPanel1Layout.setHorizontalGroup(
            micPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(micPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(micPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(micPanel1Layout.createSequentialGroup()
                        .addComponent(micPanel1Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jCheckBox4)))
                .addContainerGap())
        );
        micPanel1Layout.setVerticalGroup(
            micPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, micPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(micPanel1Title)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );

        micPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jButton6.setText("Upload");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        micPanel3Title.setText("Microphone (Front)");

        javax.swing.GroupLayout micPanel3Layout = new javax.swing.GroupLayout(micPanel3);
        micPanel3.setLayout(micPanel3Layout);
        micPanel3Layout.setHorizontalGroup(
            micPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(micPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(micPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(micPanel3Layout.createSequentialGroup()
                        .addComponent(micPanel3Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox6)))
                .addContainerGap())
        );
        micPanel3Layout.setVerticalGroup(
            micPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, micPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(micPanel3Title)
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );

        micPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jButton8.setText("Upload");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        micPanel2Title.setText("Microphone (Left)");

        javax.swing.GroupLayout micPanel2Layout = new javax.swing.GroupLayout(micPanel2);
        micPanel2.setLayout(micPanel2Layout);
        micPanel2Layout.setHorizontalGroup(
            micPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(micPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(micPanel2Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(micPanel2Layout.createSequentialGroup()
                        .addComponent(micPanel2Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jCheckBox5)))
                .addContainerGap())
        );
        micPanel2Layout.setVerticalGroup(
            micPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, micPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(micPanel2Title)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap())
        );

        micPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jButton10.setText("Upload");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        micPanel4Title.setText("Microphone (Back)");

        javax.swing.GroupLayout micPanel4Layout = new javax.swing.GroupLayout(micPanel4);
        micPanel4.setLayout(micPanel4Layout);
        micPanel4Layout.setHorizontalGroup(
            micPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(micPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(micPanel4Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(micPanel4Layout.createSequentialGroup()
                        .addComponent(micPanel4Title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox7)))
                .addContainerGap())
        );
        micPanel4Layout.setVerticalGroup(
            micPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, micPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(micPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(micPanel4Title)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap())
        );

        batteryPanel.setBackground(new java.awt.Color(255, 204, 204));

        batteryPanelTitle.setText("Battery");

        batteryPanelOnChargingCheckbox.setText("On charging");
        batteryPanelOnChargingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryPanelOnChargingCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout batteryPanelLayout = new javax.swing.GroupLayout(batteryPanel);
        batteryPanel.setLayout(batteryPanelLayout);
        batteryPanelLayout.setHorizontalGroup(
            batteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batteryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(batteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(batteryPanelLayout.createSequentialGroup()
                        .addComponent(batteryPanelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox10))
                    .addGroup(batteryPanelLayout.createSequentialGroup()
                        .addComponent(batteryPanelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteryPanelOnChargingCheckbox)))
                .addContainerGap())
        );
        batteryPanelLayout.setVerticalGroup(
            batteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batteryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(batteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(batteryPanelTitle)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(batteryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batteryPanelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batteryPanelOnChargingCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Sensor Simulator");

        jButton11.setText("Hide");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sensorSimulatorPanelLayout = new javax.swing.GroupLayout(sensorSimulatorPanel);
        sensorSimulatorPanel.setLayout(sensorSimulatorPanelLayout);
        sensorSimulatorPanelLayout.setHorizontalGroup(
            sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensorSimulatorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(265, 265, 265))
            .addGroup(sensorSimulatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cameraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sensorSimulatorPanelLayout.createSequentialGroup()
                        .addGroup(sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(batteryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sensorSimulatorPanelLayout.createSequentialGroup()
                                .addComponent(micPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(micPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sensorSimulatorPanelLayout.createSequentialGroup()
                                .addComponent(micPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(micPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(touchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sensorSimulatorPanelLayout.setVerticalGroup(
            sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sensorSimulatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addGap(31, 31, 31)
                .addComponent(cameraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(batteryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(touchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(sensorSimulatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(micPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(micPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(micPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(micPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        robotStatusWiew1.setBackground(new java.awt.Color(255, 255, 255));

        robotStatusWiewCamera.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout robotStatusWiewCameraLayout = new javax.swing.GroupLayout(robotStatusWiewCamera);
        robotStatusWiewCamera.setLayout(robotStatusWiewCameraLayout);
        robotStatusWiewCameraLayout.setHorizontalGroup(
            robotStatusWiewCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        robotStatusWiewCameraLayout.setVerticalGroup(
            robotStatusWiewCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout robotStatusWiew1Layout = new javax.swing.GroupLayout(robotStatusWiew1);
        robotStatusWiew1.setLayout(robotStatusWiew1Layout);
        robotStatusWiew1Layout.setHorizontalGroup(
            robotStatusWiew1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiew1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robotStatusWiewCamera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        robotStatusWiew1Layout.setVerticalGroup(
            robotStatusWiew1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiew1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robotStatusWiewCamera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        robotStatusPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        robotStatusPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        robotStatusPanel.setText("Robot Status");

        robotStatusWiew5.setBackground(new java.awt.Color(0, 0, 0));

        usagePanel.setBackground(new java.awt.Color(255, 255, 255));

        usagePanelCPULabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usagePanelCPULabel.setText("CPU:");

        usagePanelCPUValue.setText("50%");

        usagePanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usagePanelTitle.setText("RaspPI");

        usagePanelGPULabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usagePanelGPULabel.setText("GPU:");

        usagePanelGPUValue.setText("50%");

        usagePanelRAMLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usagePanelRAMLabel.setText("RAM:");

        usagePanelRAMValue.setText("50%");

        javax.swing.GroupLayout usagePanelLayout = new javax.swing.GroupLayout(usagePanel);
        usagePanel.setLayout(usagePanelLayout);
        usagePanelLayout.setHorizontalGroup(
            usagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usagePanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(usagePanelLayout.createSequentialGroup()
                        .addComponent(usagePanelCPULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usagePanelCPUValue, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addGroup(usagePanelLayout.createSequentialGroup()
                        .addComponent(usagePanelGPULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usagePanelGPUValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usagePanelLayout.createSequentialGroup()
                        .addComponent(usagePanelRAMLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usagePanelRAMValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        usagePanelLayout.setVerticalGroup(
            usagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usagePanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usagePanelCPULabel)
                    .addComponent(usagePanelCPUValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usagePanelGPULabel)
                    .addComponent(usagePanelGPUValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usagePanelRAMLabel)
                    .addComponent(usagePanelRAMValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        batteryLevelPanel.setBackground(new java.awt.Color(255, 255, 255));

        batteryLevelPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batteryLevelPanelTitle.setText("Battery");

        batteryLevelPanelChargingLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        batteryLevelPanelChargingLabel.setText("CHARGING:");

        batteryLevelPanelChargingValue.setText("NONE");

        batteryLevelPanelLevelLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        batteryLevelPanelLevelLabel.setText("LEVEL:");

        batteryLevelPanelLevelValue.setText("50%");

        javax.swing.GroupLayout batteryLevelPanelLayout = new javax.swing.GroupLayout(batteryLevelPanel);
        batteryLevelPanel.setLayout(batteryLevelPanelLayout);
        batteryLevelPanelLayout.setHorizontalGroup(
            batteryLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batteryLevelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(batteryLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batteryLevelPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, batteryLevelPanelLayout.createSequentialGroup()
                        .addComponent(batteryLevelPanelChargingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(batteryLevelPanelChargingValue, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addGroup(batteryLevelPanelLayout.createSequentialGroup()
                        .addComponent(batteryLevelPanelLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(batteryLevelPanelLevelValue, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        batteryLevelPanelLayout.setVerticalGroup(
            batteryLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batteryLevelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(batteryLevelPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(batteryLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batteryLevelPanelLevelLabel)
                    .addComponent(batteryLevelPanelLevelValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(batteryLevelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batteryLevelPanelChargingLabel)
                    .addComponent(batteryLevelPanelChargingValue))
                .addGap(12, 12, 12))
        );

        systemPanel.setBackground(new java.awt.Color(255, 255, 255));

        systemPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemPanelTitle.setText("System");

        systemPanelApplicationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        systemPanelApplicationLabel.setText("APPLICATION:");

        systemPanelApplicationValue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        systemPanelApplicationValue.setForeground(Color.RED);
        systemPanelApplicationValue.setText("OFFLINE");

        systemPanelStateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        systemPanelStateLabel.setText("STATE:");

        systemPanelStateValue.setText("NORMAL");

        javax.swing.GroupLayout systemPanelLayout = new javax.swing.GroupLayout(systemPanel);
        systemPanel.setLayout(systemPanelLayout);
        systemPanelLayout.setHorizontalGroup(
            systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(systemPanelLayout.createSequentialGroup()
                        .addComponent(systemPanelApplicationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(systemPanelApplicationValue, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(systemPanelLayout.createSequentialGroup()
                        .addComponent(systemPanelStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(systemPanelStateValue, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                .addContainerGap())
        );
        systemPanelLayout.setVerticalGroup(
            systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(systemPanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemPanelApplicationLabel)
                    .addComponent(systemPanelApplicationValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemPanelStateLabel)
                    .addComponent(systemPanelStateValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout robotStatusWiew5Layout = new javax.swing.GroupLayout(robotStatusWiew5);
        robotStatusWiew5.setLayout(robotStatusWiew5Layout);
        robotStatusWiew5Layout.setHorizontalGroup(
            robotStatusWiew5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiew5Layout.createSequentialGroup()
                .addGroup(robotStatusWiew5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(batteryLevelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(systemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        robotStatusWiew5Layout.setVerticalGroup(
            robotStatusWiew5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(systemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, robotStatusWiew5Layout.createSequentialGroup()
                .addComponent(usagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(batteryLevelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        robotStatusWiewSelect5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resources Usage" }));

        robotStatusWiew2.setBackground(new java.awt.Color(255, 255, 255));

        robotStatusWiewPersonIdentityImage.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout robotStatusWiewPersonIdentityImageLayout = new javax.swing.GroupLayout(robotStatusWiewPersonIdentityImage);
        robotStatusWiewPersonIdentityImage.setLayout(robotStatusWiewPersonIdentityImageLayout);
        robotStatusWiewPersonIdentityImageLayout.setHorizontalGroup(
            robotStatusWiewPersonIdentityImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        robotStatusWiewPersonIdentityImageLayout.setVerticalGroup(
            robotStatusWiewPersonIdentityImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        robotStatusWiewPersonIdentityNameLabel.setText("Nume:");

        robotStatusWiewPersonIdentityNameValue.setText("-");

        robotStatusWiewPersonIdentityFirstnameLabel.setText("Prenume:");

        robotStatusWiewPersonIdentityFirstnameValue.setText("-");

        robotStatusWiewPersonIdentityBornLabel.setText("Data nasterii:");

        robotStatusWiewPersonIdentityBornValue.setText("00-00-0000");

        robotStatusWiewPersonIdentityAgeLabel.setText("Varsta:");

        robotStatusWiewPersonIdentityAgeValue.setText("00");

        javax.swing.GroupLayout robotStatusWiewPersonIdentityLayout = new javax.swing.GroupLayout(robotStatusWiewPersonIdentity);
        robotStatusWiewPersonIdentity.setLayout(robotStatusWiewPersonIdentityLayout);
        robotStatusWiewPersonIdentityLayout.setHorizontalGroup(
            robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robotStatusWiewPersonIdentityImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                        .addComponent(robotStatusWiewPersonIdentityNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotStatusWiewPersonIdentityNameValue))
                    .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                        .addComponent(robotStatusWiewPersonIdentityFirstnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotStatusWiewPersonIdentityFirstnameValue))
                    .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                        .addComponent(robotStatusWiewPersonIdentityBornLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(robotStatusWiewPersonIdentityBornValue))
                    .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                        .addComponent(robotStatusWiewPersonIdentityAgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotStatusWiewPersonIdentityAgeValue)))
                .addContainerGap())
        );
        robotStatusWiewPersonIdentityLayout.setVerticalGroup(
            robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(robotStatusWiewPersonIdentityLayout.createSequentialGroup()
                        .addGroup(robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(robotStatusWiewPersonIdentityNameLabel)
                            .addComponent(robotStatusWiewPersonIdentityNameValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(robotStatusWiewPersonIdentityFirstnameLabel)
                            .addComponent(robotStatusWiewPersonIdentityFirstnameValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(robotStatusWiewPersonIdentityBornLabel)
                            .addComponent(robotStatusWiewPersonIdentityBornValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(robotStatusWiewPersonIdentityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(robotStatusWiewPersonIdentityAgeLabel)
                            .addComponent(robotStatusWiewPersonIdentityAgeValue)))
                    .addComponent(robotStatusWiewPersonIdentityImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout robotStatusWiew2Layout = new javax.swing.GroupLayout(robotStatusWiew2);
        robotStatusWiew2.setLayout(robotStatusWiew2Layout);
        robotStatusWiew2Layout.setHorizontalGroup(
            robotStatusWiew2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiew2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robotStatusWiewPersonIdentity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        robotStatusWiew2Layout.setVerticalGroup(
            robotStatusWiew2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotStatusWiew2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robotStatusWiewPersonIdentity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        robotStatusWiewSelect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3D Map", "Camera (Left)" }));

        robotStatusWiewSelect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sensors", "Camera (Right)" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(robotStatusWiew5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(robotStatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(robotStatusWiewSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(robotStatusWiewSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 401, Short.MAX_VALUE)
                        .addComponent(robotStatusWiewSelect5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(robotStatusWiew1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(robotStatusWiew2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(robotStatusPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(robotStatusWiewSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(robotStatusWiewSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(robotStatusWiew1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(robotStatusWiew2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotStatusWiewSelect5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(robotStatusWiew5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sensorSimulatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sensorSimulatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RunBtn.setText("Run");

        SimulatedSensorsBtn.setText("Simulated sensors");

        RealSensorsBtn.setText("Real sensors");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RealSensorsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SimulatedSensorsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RunBtn)
                .addGap(408, 408, 408))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RunBtn)
                    .addComponent(SimulatedSensorsBtn)
                    .addComponent(RealSensorsBtn))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>      
    
    private void batteryPanelOnChargingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        // TODO add your handling code here:
    }                                                              

    private void cameraPanelUploadImageBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                                                               

    private void cameraPanelUploadVideoBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    // Variables declaration - do not modify     
    private final javax.swing.JTextArea errorLog = new javax.swing.JTextArea(30,30);
    private javax.swing.JButton RealSensorsBtn;
    private javax.swing.JButton RunBtn;
    private javax.swing.JButton SimulatedSensorsBtn;
    private javax.swing.JPanel batteryLevelPanel;
    private javax.swing.JLabel batteryLevelPanelChargingLabel;
    private javax.swing.JLabel batteryLevelPanelChargingValue;
    private javax.swing.JLabel batteryLevelPanelLevelLabel;
    private javax.swing.JLabel batteryLevelPanelLevelValue;
    private javax.swing.JLabel batteryLevelPanelTitle;
    private javax.swing.JPanel batteryPanel;
    private javax.swing.JCheckBox batteryPanelOnChargingCheckbox;
    private javax.swing.JSlider batteryPanelSlider;
    private javax.swing.JLabel batteryPanelTitle;
    private javax.swing.JPanel cameraPanel;
    private javax.swing.JPanel cameraPanelFilenamePanel;
    private javax.swing.JLabel cameraPanelFilenameText;
    private javax.swing.JPanel cameraPanelRealCapture;
    private javax.swing.JCheckBox cameraPanelRealCheckbox;
    private javax.swing.JLabel cameraPanelTitle;
    private javax.swing.JButton cameraPanelUploadImageBtn;
    private javax.swing.JButton cameraPanelUploadVideoBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField logsFilterInput;
    private javax.swing.JLabel logsFilterLabel;
    private javax.swing.JPanel logsPanel;
    private javax.swing.JScrollPane logsScrollPane;
    private javax.swing.JPanel micPanel1;
    private javax.swing.JLabel micPanel1Title;
    private javax.swing.JPanel micPanel2;
    private javax.swing.JLabel micPanel2Title;
    private javax.swing.JPanel micPanel3;
    private javax.swing.JLabel micPanel3Title;
    private javax.swing.JPanel micPanel4;
    private javax.swing.JLabel micPanel4Title;
    private javax.swing.JLabel robotStatusPanel;
    private javax.swing.JPanel robotStatusWiew1;
    private javax.swing.JPanel robotStatusWiew2;
    private javax.swing.JPanel robotStatusWiew5;
    private javax.swing.JPanel robotStatusWiewCamera;
    private javax.swing.JPanel robotStatusWiewPersonIdentity;
    private javax.swing.JLabel robotStatusWiewPersonIdentityAgeLabel;
    private javax.swing.JLabel robotStatusWiewPersonIdentityAgeValue;
    private javax.swing.JLabel robotStatusWiewPersonIdentityBornLabel;
    private javax.swing.JLabel robotStatusWiewPersonIdentityBornValue;
    private javax.swing.JLabel robotStatusWiewPersonIdentityFirstnameLabel;
    private javax.swing.JLabel robotStatusWiewPersonIdentityFirstnameValue;
    private javax.swing.JPanel robotStatusWiewPersonIdentityImage;
    private javax.swing.JLabel robotStatusWiewPersonIdentityNameLabel;
    private javax.swing.JLabel robotStatusWiewPersonIdentityNameValue;
    private javax.swing.JComboBox<String> robotStatusWiewSelect1;
    private javax.swing.JComboBox<String> robotStatusWiewSelect2;
    private javax.swing.JComboBox<String> robotStatusWiewSelect5;
    private javax.swing.JPanel sensorSimulatorPanel;
    private javax.swing.JPanel systemPanel;
    private javax.swing.JLabel systemPanelApplicationLabel;
    private javax.swing.JLabel systemPanelApplicationValue;
    private javax.swing.JLabel systemPanelStateLabel;
    private javax.swing.JLabel systemPanelStateValue;
    private javax.swing.JLabel systemPanelTitle;
    private javax.swing.JPanel touchPanel;
    private javax.swing.JLabel touchPanelLabel1;
    private javax.swing.JComboBox<String> touchPanelSelect1;
    private javax.swing.JLabel touchPanelTitle;
    private javax.swing.JPanel usagePanel;
    private javax.swing.JLabel usagePanelCPULabel;
    private javax.swing.JLabel usagePanelCPUValue;
    private javax.swing.JLabel usagePanelGPULabel;
    private javax.swing.JLabel usagePanelGPUValue;
    private javax.swing.JLabel usagePanelRAMLabel;
    private javax.swing.JLabel usagePanelRAMValue;
    private javax.swing.JLabel usagePanelTitle;
    // End of variables declaration      
    
}
