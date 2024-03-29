
/**
 *
 * @author AK
 */
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public String email;

    /**
     * Creates new form home
     */
    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@gmail.com")) {
            btnManagecategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnVerifyUser.setVisible(false);
            btnDeletecat.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnPlaceorder = new javax.swing.JButton();
        btnViewbill = new javax.swing.JButton();
        btnChangepass = new javax.swing.JButton();
        btnChangeque = new javax.swing.JButton();
        btnManagecategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnDeletecat = new javax.swing.JButton();
        btnVerifyUser = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(51, 0, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 350, 80));

        btnPlaceorder.setBackground(new java.awt.Color(51, 0, 51));
        btnPlaceorder.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnPlaceorder.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaceorder.setText("Place Order");
        btnPlaceorder.setBorder(null);
        btnPlaceorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        btnViewbill.setBackground(new java.awt.Color(51, 0, 51));
        btnViewbill.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnViewbill.setForeground(new java.awt.Color(255, 255, 255));
        btnViewbill.setText("View Bill & Order Placed Details");
        btnViewbill.setBorder(null);
        btnViewbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewbillActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 350, 70));

        btnChangepass.setBackground(new java.awt.Color(51, 0, 51));
        btnChangepass.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnChangepass.setForeground(new java.awt.Color(255, 255, 255));
        btnChangepass.setText("Change Password");
        btnChangepass.setBorder(null);
        btnChangepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangepassActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 350, 70));

        btnChangeque.setBackground(new java.awt.Color(51, 0, 51));
        btnChangeque.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnChangeque.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeque.setText("Change Security Question");
        btnChangeque.setBorder(null);
        btnChangeque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangequeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 350, 80));

        btnManagecategory.setBackground(new java.awt.Color(51, 0, 51));
        btnManagecategory.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnManagecategory.setForeground(new java.awt.Color(255, 255, 255));
        btnManagecategory.setText("Manage category");
        btnManagecategory.setBorder(null);
        btnManagecategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagecategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnManagecategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 350, 80));

        btnNewProduct.setBackground(new java.awt.Color(51, 0, 51));
        btnNewProduct.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnNewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnNewProduct.setText("New Product");
        btnNewProduct.setBorder(null);
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 350, 80));

        btnDeletecat.setBackground(new java.awt.Color(51, 0, 51));
        btnDeletecat.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnDeletecat.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletecat.setText("View Edit Or Delete Product");
        btnDeletecat.setBorder(null);
        btnDeletecat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletecatActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletecat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 350, 80));

        btnVerifyUser.setBackground(new java.awt.Color(51, 0, 51));
        btnVerifyUser.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnVerifyUser.setForeground(new java.awt.Color(255, 255, 255));
        btnVerifyUser.setText("Verify User");
        btnVerifyUser.setBorder(null);
        btnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 350, 80));

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 255, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 350, 70));

        jLabel1.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/images/3cb509f1852554397d14371c9554ee58.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new home.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1460, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You really want to Exit Application", "Select",
                JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }// GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You really want to Logout", "Select",
                JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);

        }
    }// GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewbillActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnViewbillActionPerformed
        // TODO add your handling code here:
        new ViewBillAndOrderPlaced().setVisible(true);

    }// GEN-LAST:event_btnViewbillActionPerformed

    private void btnManagecategoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnManagecategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }// GEN-LAST:event_btnManagecategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new NewProduct().setVisible(true);
    }// GEN-LAST:event_btnNewProductActionPerformed

    private void btnDeletecatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeletecatActionPerformed
        // TODO add your handling code here:
        new ViewEditOrDeleteProduct().setVisible(true);
    }// GEN-LAST:event_btnDeletecatActionPerformed

    private void btnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnVerifyUserActionPerformed
        // TODO add your handling code here:
        new VerifyUser().setVisible(true);
    }// GEN-LAST:event_btnVerifyUserActionPerformed

    private void btnPlaceorderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPlaceorderActionPerformed
        // TODO add your handling code here:
        new PlaceOrder().setVisible(true);
    }// GEN-LAST:event_btnPlaceorderActionPerformed

    private void btnChangepassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangepassActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }// GEN-LAST:event_btnChangepassActionPerformed

    private void btnChangequeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChangequeActionPerformed
        // TODO add your handling code here:
        new changeSecurityQue(email).setVisible(true);
    }// GEN-LAST:event_btnChangequeActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangepass;
    private javax.swing.JButton btnChangeque;
    private javax.swing.JButton btnDeletecat;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManagecategory;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceorder;
    private javax.swing.JButton btnVerifyUser;
    private javax.swing.JButton btnViewbill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
