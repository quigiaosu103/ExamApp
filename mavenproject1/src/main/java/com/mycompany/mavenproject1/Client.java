/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kButton1 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        userNameInput = new javax.swing.JTextField();
        userPasswordInput = new javax.swing.JPasswordField();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        kButton3 = new com.k33ptoo.components.KButton();

        kButton1.setText("kButton1");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(87, 163, 253));
        kGradientPanel1.setkGradientFocus(270);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkBorderRadius(30);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setOpaque(false);

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkBorderRadius(30);
        kGradientPanel4.setkEndColor(new java.awt.Color(86, 167, 254));
        kGradientPanel4.setkFillBackground(false);
        kGradientPanel4.setkStartColor(new java.awt.Color(86, 167, 254));
        kGradientPanel4.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SIGN IN");

        userNameInput.setBackground(new java.awt.Color(255, 255, 255));
        userNameInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userNameInput.setForeground(new java.awt.Color(204, 204, 204));
        userNameInput.setText("username");
        userNameInput.setToolTipText("");
        userNameInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(86, 152, 254)));
        userNameInput.setCaretColor(new java.awt.Color(102, 255, 0));
        userNameInput.setDisabledTextColor(new java.awt.Color(80, 80, 80));
        userNameInput.setOpaque(false);
        userNameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameInputFocusLost(evt);
            }
        });

        userPasswordInput.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userPasswordInput.setForeground(new java.awt.Color(86, 153, 255));
        userPasswordInput.setText("password    ");
        userPasswordInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(86, 152, 254)));
        userPasswordInput.setOpaque(false);
        userPasswordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPasswordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPasswordInputFocusLost(evt);
            }
        });
        userPasswordInput.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                userPasswordInputComponentShown(evt);
            }
        });
        userPasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordInputActionPerformed(evt);
            }
        });

        kButton2.setBorder(null);
        kButton2.setText("Sign in");
        kButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(86, 153, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(98, 170, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(98, 170, 255));
        kButton2.setkSelectedColor(new java.awt.Color(86, 153, 255));
        kButton2.setkStartColor(new java.awt.Color(86, 153, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Don't have an account?");

        kButton3.setBorder(null);
        kButton3.setForeground(new java.awt.Color(221, 178, 25));
        kButton3.setText("Sign up");
        kButton3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButton3.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkForeGround(new java.awt.Color(221, 178, 25));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverForeGround(new java.awt.Color(220, 176, 17));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton3.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton3.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userPasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(userNameInput))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(userPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userPasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordInputActionPerformed

    private void userNameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameInputFocusGained
        // TODO add your handling code here:
        if(userNameInput.getText().equals("username")) {
            userNameInput.setText("");
            userNameInput.setForeground(new Color(87, 152, 254));
        }
        String pw = new String(userPasswordInput.getPassword());
        if(pw.equals("password    ")) {
            userPasswordInput.setEchoChar((char)0);
            userPasswordInput.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_userNameInputFocusGained

    private void userNameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameInputFocusLost
        // TODO add your handling code here:
        if(userNameInput.getText().equals("")) {
            userNameInput.setText("username");
            userNameInput.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_userNameInputFocusLost

    private void userPasswordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordInputFocusGained
        // TODO add your handling code here:
        String pw = new String(userPasswordInput.getPassword());
        if(pw.equals("password    ")) {
            userPasswordInput.setEchoChar('*');
            userPasswordInput.setForeground(new Color(87, 152, 254));
            userPasswordInput.setText("");
        }
    }//GEN-LAST:event_userPasswordInputFocusGained

    private void userPasswordInputComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_userPasswordInputComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userPasswordInputComponentShown

    private void userPasswordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordInputFocusLost
        // TODO add your handling code here:
        String pw = new String(userPasswordInput.getPassword());
        if(pw.equals("")) {
            userPasswordInput.setEchoChar((char)0);
            userPasswordInput.setForeground(new Color(204,204,204));
            userPasswordInput.setText("password    ");
        }
    }//GEN-LAST:event_userPasswordInputFocusLost

    /**
     * @param args the command line arguments
     */

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private javax.swing.JTextField userNameInput;
    private javax.swing.JPasswordField userPasswordInput;
    // End of variables declaration//GEN-END:variables
}
