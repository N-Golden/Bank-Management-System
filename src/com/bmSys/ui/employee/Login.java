package com.bmSys.ui.employee;

import com.bmSys.dao.EmployeeDAO;
import com.bmSys.model.EmployeeModel;
import com.bmSys.ui.Loading;
import com.bmSys.utils.PasswordUtil;
import com.bmSys.utils.Validator;
import java.util.List;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {

        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnForgotPass = new javax.swing.JLabel();
        txtPW = new javax.swing.JPasswordField();
        btnAdmin = new javax.swing.JLabel();
        lblShowPass = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bmSys/icon/Person-Male-Light-icon-16.png"))); // NOI18N
        jLabel2.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");

        txtUN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bmSys/icon/password.png"))); // NOI18N
        jLabel5.setText("Password:");

        btnLog.setBackground(new java.awt.Color(0, 153, 255));
        btnLog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("LOGIN");
        btnLog.setBorder(null);
        btnLog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnForgotPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnForgotPass.setForeground(new java.awt.Color(255, 0, 0));
        btnForgotPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnForgotPass.setText("Fogot Password");
        btnForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnForgotPassMouseClicked(evt);
            }
        });

        txtPW.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPWActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 0, 0));
        btnAdmin.setText("Login as Administrator");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });

        lblShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bmSys/icon/hidepass24.png"))); // NOI18N
        lblShowPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowPassMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblShowPass))
                            .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblShowPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))))
                .addGap(30, 30, 30)
                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 490, 500));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banking Management System");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bmSys/icon/manager.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        authentication();

    }//GEN-LAST:event_btnLogActionPerformed

    private void txtPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPWActionPerformed

    private void txtUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUNActionPerformed

    private void lblShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPassMouseClicked
        // TODO add your handling code here:
        PasswordUtil.showPass(txtPW, lblShowPass);
    }//GEN-LAST:event_lblShowPassMouseClicked

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForgotPassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnForgotPassMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Login().setVisible(true);

            }
        }
        );
    }

    private boolean validation() {
        String error = "";
        if (Validator.checkEmpty(txtUN)) {
            error += "Username cannot be null!\n";
        }
        if (Validator.checkEmpty(txtPW)) {
            error += "Password cannot be null!\n";
        }
        if (!error.equals("")) {
            JOptionPane.showMessageDialog(null, error);
            return false;
        } else {
            return true;
        }
    }

    public void authentication() {
        if (validation()) {
            String username = txtUN.getText();
            String password = txtPW.getText();
            EmployeeDAO results = new EmployeeDAO();
            List<EmployeeModel> listEmpl = results.findAll();

            boolean isLogin = false;
            EmployeeModel model = new EmployeeModel();
            for (EmployeeModel x : listEmpl) {
                if (x.getUsername().equals(username) && x.getPassword().equals(password)) {
                    isLogin = true;
                    model = x;
                    break;
                }
            }

            if (isLogin) {
                JOptionPane.showMessageDialog(this, "Login sucessful");
                this.dispose();
                Loading load = new Loading(new javax.swing.JFrame(), true);
                load.setVisible(true);
                new Home(model).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Login fails");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnForgotPass;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblShowPass;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
