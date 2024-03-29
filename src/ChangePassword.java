
/**
 *
 * @author AK
 */
import DAO.UserDao;

public class ChangePassword extends javax.swing.JFrame {
    public String userEmail;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(String email) {
        initComponents();
        userEmail = email;
        btnUpdate.setEnabled(false);
    }

    public void validateField() {
        String oldPassword = txtOldPassword.getText();
        String newPassword = txtNewPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        if (!oldPassword.equals("") && !newPassword.equals("") && !confirmPassword.equals("")
                && newPassword.equals(confirmPassword)) {
            btnUpdate.setEnabled(true);
        } else
            btnUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 75));
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1150, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setBackground(new java.awt.Color(0, 0, 0));
        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        lbl1.setText("Change Password");
        lbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        lbl1.setOpaque(true);
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        lbl3.setBackground(new java.awt.Color(51, 51, 51));
        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setText("New Password");
        lbl3.setOpaque(true);
        getContentPane().add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        lbl4.setBackground(new java.awt.Color(51, 51, 51));
        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("Confirm password");
        lbl4.setOpaque(true);
        getContentPane().add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        lbl2.setBackground(new java.awt.Color(51, 51, 51));
        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("Old Password");
        lbl2.setOpaque(true);
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        txtOldPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 306, -1));

        txtNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 306, -1));

        txtConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/images/WhatsApp Image 2023-11-13 at 4.38.53 PM (3).jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-490, -140, 1740, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }// GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }// GEN-LAST:event_btnCloseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String oldPassword = txtOldPassword.getText();
        String newPassword = txtNewPassword.getText();
        UserDao.changePassword(userEmail, oldPassword, newPassword);
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }// GEN-LAST:event_btnUpdateActionPerformed

    private void txtOldPasswordKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtOldPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }// GEN-LAST:event_txtOldPasswordKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }// GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtConfirmPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }// GEN-LAST:event_txtConfirmPasswordKeyReleased

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
