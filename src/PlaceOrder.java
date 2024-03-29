
/**
 *
 * @author AK
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import DAO.BillDao;
import DAO.CategoryDao;
import DAO.ProductDao;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Category;
import model.Product;

public class PlaceOrder extends javax.swing.JFrame {

    public int billId = 1;
    public int grandTotal = 0;
    public int productPrice = 0;
    public int productTotal = 0;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    public String userEmail;

    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        initComponents();

    }

    public PlaceOrder(String email) {
        initComponents();
        txtProName.setEditable(false);
        txtPrice.setEditable(false);
        txtTotal.setEditable(false);
        btnaddToCart.setEnabled(false);
        btnGenerateBill.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf.setEditable(false);
        userEmail = email;
    }

    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.getAllRecordsByCategory(category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[] { productObj.getName() });
        }
    }

    public void filterProductByname(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list = ProductDao.filterProductByName(name, category);
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
            Product productObj = itr.next();
            dtm.addRow(new Object[] { productObj.getName() });
        }
    }

    public void clearProductFields() {
        txtProName.setText("");
        txtPrice.setText("");
        jSpinner1.setValue(1);
        txtTotal.setText("");
        btnaddToCart.setEnabled(false);
    }

    public void validateField() {
        String customerName = txtName.getText();
        String customerMobileNumber = txtMobileNumber.getText();
        String customerEmail = txtEmail.getText();
        if (!customerEmail.equals("") && customerMobileNumber.matches(mobileNumberPattern)
                && customerMobileNumber.length() == 10 && customerEmail.matches(emailPattern) && grandTotal > 0) {
            btnGenerateBill.setEnabled(true);
        } else {
            btnGenerateBill.setEnabled(false);
        }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnaddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnGenerateBill = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCategory = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        txtProName = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        txtPrice = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 75));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jLabel1.setText("Place Order");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setText("Bill ID:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 61, 34));

        lbl1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("1");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel4.setText("Customer Details:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setText("Mobile Number");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setText("Category");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 80, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel9.setText("Search");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 60, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setText("Name");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 60, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel11.setText("Quantity");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 80, -1));

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 100, 28));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel12.setText("Price");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 50, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel13.setText("Total");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 52, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name"
                }));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 220, 310));

        btnaddToCart.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnaddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnaddToCart.setText("Add to Cart");
        btnaddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 160, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Name", "Price", "Quality", "Total"
                }));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 580, 287));

        btnGenerateBill.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerateBill.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        btnGenerateBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        btnGenerateBill.setText("Generate Bill & Print");
        btnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerateBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 240, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 246, 27));

        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 246, 27));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 246, 27));

        txtCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 246, 30));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 246, 27));
        getContentPane().add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 246, 30));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 246, 27));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 247, 30));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 246, 27));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setText("00.");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 30, 20));

        lbl2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lbl2.setText("000.");
        lbl2.setOpaque(true);
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, -1, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Bill Number");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Grand Total");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/images/WhatsApp Image 2023-11-13 at 4.38.53 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-470, -310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed

        // TODO add your handling code here:
        clearProductFields();
    }// GEN-LAST:event_btnClearActionPerformed

    private void btnaddToCartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnaddToCartActionPerformed
        // TODO add your handling code here:
        String name = txtProName.getText();
        String price = txtPrice.getText();
        String quantity = String.valueOf(jSpinner1.getValue());
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.addRow(new Object[] { name, price, quantity, productTotal });
        grandTotal = grandTotal + productTotal;
        lbl2.setText(String.valueOf(grandTotal));

        clearProductFields();
        validateField();
    }// GEN-LAST:event_btnaddToCartActionPerformed

    private void btnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGenerateBillActionPerformed
        // TODO add your handling code here:
        String customerName = txtName.getText();
        String customerMobileNumber = txtMobileNumber.getText();
        String customerEmail = txtEmail.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String todaydate = dFormat.format(date);
        String total = String.valueOf(grandTotal);
        String createBy = userEmail;
        Bill bill = new Bill();
        bill.setId(billId);
        bill.setName(customerName);
        bill.setMobileNumber(customerMobileNumber);
        bill.setEmail(customerEmail);
        bill.setDate(todaydate);
        bill.setTotal(total);
        bill.setCreatedBy(createBy);
        BillDao.save(bill);

        String path = "D:\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + billId + ".pdf"));
            doc.open();
            Paragraph cafeName;
            cafeName = new Paragraph(
                    "                                                              One More Coffee \n");
            doc.add(cafeName);
            Paragraph startLine = new Paragraph(
                    "*****************************************************************************************************");
            doc.add(startLine);
            Paragraph paragraph3 = new Paragraph(
                    "\tBill ID:" + billId + "\nCustomer Name: " + customerName + "\nTotal Paid: " + grandTotal);
            doc.add(paragraph3);
            doc.add(startLine);
            PdfPTable tb1 = new PdfPTable(4);
            tb1.addCell("Name");
            tb1.addCell("Price");
            tb1.addCell("Quantity");
            tb1.addCell("Total");
            for (int i = 0; i < jTable2.getRowCount(); i++) {
                String n = jTable2.getValueAt(i, 0).toString();
                String d = jTable2.getValueAt(i, 1).toString();
                String r = jTable2.getValueAt(i, 2).toString();
                String q = jTable2.getValueAt(i, 3).toString();
                tb1.addCell(n);
                tb1.addCell(d);
                tb1.addCell(r);
                tb1.addCell(q);
            }
            doc.add(tb1);
            doc.add(startLine);
            Paragraph thanksMsg = new Paragraph("Thank you, Please visit Again.");
            doc.add(thanksMsg);
            OpenPdf.openById(String.valueOf(billId));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        setVisible(false);
        new PlaceOrder(createBy).setVisible(true);

    }// GEN-LAST:event_btnGenerateBillActionPerformed

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtMobileNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtEmailActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtSearchActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtTotalActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {// GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        billId = Integer.parseInt(BillDao.getId());
        jLabel3.setText(BillDao.getId());
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            txtCategory.addItem(categoryObj.getName());
        }
        String category = (String) txtCategory.getSelectedItem();
        productNameByCategory(category);
    }// GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String name = txtSearch.getText();
        String category = (String) txtCategory.getSelectedItem();
        filterProductByname(name, category);

    }// GEN-LAST:event_txtSearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String productName = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getProductByName(productName);
        txtProName.setText(product.getName());
        txtPrice.setText(product.getPrice());
        jSpinner1.setValue(1);
        txtTotal.setText(product.getPrice());
        productPrice = Integer.parseInt(product.getPrice());
        productTotal = Integer.parseInt(product.getPrice());
        btnaddToCart.setEnabled(true);
    }// GEN-LAST:event_jTable1MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int quantity = (Integer) jSpinner1.getValue();
        if (quantity <= 1) {
            jSpinner1.setValue(1);
            quantity = 1;
        }
        productTotal = productPrice * quantity;
        txtTotal.setText(String.valueOf(productTotal));
    }// GEN-LAST:event_jSpinner1StateChanged

    private void txtCategoryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCategoryActionPerformed
        // TODO add your handling code here:
        String category = (String) txtCategory.getSelectedItem();
        productNameByCategory(category);
    }// GEN-LAST:event_txtCategoryActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateField();
    }// GEN-LAST:event_txtNameKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateField();
    }// GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateField();
    }// GEN-LAST:event_txtEmailKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to remove this product", "select",
                JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            TableModel model = jTable2.getModel();
            String total = model.getValueAt(index, 3).toString();
            grandTotal = grandTotal - Integer.parseInt(total);
            ((DefaultTableModel) jTable2.getModel()).removeRow(index);
        }
    }// GEN-LAST:event_jTable2MouseClicked

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPriceActionPerformed

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerateBill;
    private javax.swing.JButton btnaddToCart;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JComboBox<String> txtCategory;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
