/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dlu.edu.lab05;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author myloc
 */
public class Bai3 extends javax.swing.JFrame {

    List<String> dsDonGia = new ArrayList<String>();

    /**
     * Creates new form ManagerProduct
     */
    public Bai3() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfMaSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDonGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTenSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNhaCungCap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbDonViTinh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSSP = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ma san pham");

        jLabel2.setText("Don gia");

        jLabel3.setText("Ten san pham");

        jLabel4.setText("Nha cung cap");

        jLabel5.setText("Don vi tinh");

        cbDonViTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbDSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSSP);

        btnThem.setText("Them san pham");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa san pham");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnEdit.setText("Dieu chinh thong tin san pham");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel6.setText("QUAN LY VAT PHAM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfTenSP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMaSP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDonViTinh, 0, 195, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoa)
                                    .addComponent(jLabel6))
                                .addGap(75, 75, 75)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNhaCungCap, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(tfDonGia)))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadDataForm() {
        try {
            tbDSSP.removeAll();
            String[] arr = {"Ma SP", "Ten SP", "DVT", "Don gia", "Nha cung cap"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection con = ConnectDB.getConnection();
            String query = "select * from dbo.[Product]";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaSP"));
                vector.add(rs.getString("TenSP"));
                vector.add(rs.getString("DVT"));
                vector.add(rs.getInt("DonGiaTinh"));
                vector.add(rs.getString("NhaCungCap"));
                model.addRow(vector);
            }
            tbDSSP.setModel(model);
            ConnectDB.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void LoadComboBox() {
        try {
            Connection con = ConnectDB.getConnection();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String query = "select DVT from dbo.[Product]";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getString("DVT"));
                dsDonGia.add(rs.getString("DVT"));
            }
            cbDonViTinh.setModel(model);
            ConnectDB.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        LoadDataForm();
        LoadComboBox();
    }//GEN-LAST:event_formComponentShown

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = ConnectDB.getConnection();
            ResultSet resultSet;

            System.out.println("Ket noi thanh cong");
            if (!tfMaSP.getText().isEmpty() && !tfTenSP.getText().isEmpty() && !tfNhaCungCap.getText().isEmpty()) {

                String s = "insert into Product values ('" + tfMaSP.getText() + "',"
                        + " '" + tfTenSP.getText() + "',"
                        + "'" + cbDonViTinh.getSelectedIndex() + 1 + "',"
                        + " " + Integer.valueOf(tfDonGia.getText()) + ", '" + tfNhaCungCap.getText() + "');";

                java.sql.Statement statement = con.createStatement();
                statement.executeUpdate(s);
                LoadDataForm();
                LoadComboBox();
            } else {
                return;
            }
            ConnectDB.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbDSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSSPMouseClicked
        // TODO add your handling code here:
        int row = tbDSSP.getSelectedRow();
        TableModel model = tbDSSP.getModel();
        tfMaSP.setText((String) model.getValueAt(row, 0));
        tfTenSP.setText((String) model.getValueAt(row, 1));
        tfDonGia.setText((String) model.getValueAt(row, 3).toString());
        tfNhaCungCap.setText((String) model.getValueAt(row, 4));
        for (int i = 0; i < dsDonGia.size(); i++) {
            if (cbDonViTinh.getItemAt(i).equals((String) model.getValueAt(row, 2))) {
                cbDonViTinh.setSelectedIndex(i);
                break;
            }
        }

    }//GEN-LAST:event_tbDSSPMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = ConnectDB.getConnection();
            ResultSet resultSet;

            System.out.println("Ket noi thanh cong");
            if (!tfMaSP.getText().isEmpty() && !tfTenSP.getText().isEmpty() && !tfNhaCungCap.getText().isEmpty()) {

                String s = "DELETE FROM Product WHERE MaSP='" + tfMaSP.getText() + "'";

                java.sql.Statement statement = con.createStatement();
                statement.executeUpdate(s);
                LoadDataForm();
                LoadComboBox();
            } else {
                return;
            }
            ConnectDB.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = ConnectDB.getConnection();
            ResultSet resultSet;

            System.out.println("Ket noi thanh cong");
            if (!tfMaSP.getText().isEmpty() && !tfTenSP.getText().isEmpty() && !tfNhaCungCap.getText().isEmpty()) {

                String s = "update Product SET  TenSP='"+tfTenSP.getText()+"',DVT='"+cbDonViTinh.getSelectedIndex() + "',"
                        + "DonGiaTinh= "+Integer.valueOf(tfDonGia.getText())+", NhaCungCap = '"+tfNhaCungCap.getText()+"' where MaSp ='"+tfMaSP.getText()+"'";


                java.sql.Statement statement = con.createStatement();
                statement.executeUpdate(s);
                LoadDataForm();
                LoadComboBox();
            } else {
                return;
            }
            ConnectDB.closeConnection(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbDonViTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDSSP;
    private javax.swing.JTextField tfDonGia;
    private javax.swing.JTextField tfMaSP;
    private javax.swing.JTextField tfNhaCungCap;
    private javax.swing.JTextField tfTenSP;
    // End of variables declaration//GEN-END:variables
}