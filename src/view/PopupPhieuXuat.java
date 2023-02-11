/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.Delete;
import dao.Insert;
import dao.ListItem;
import dao.Update;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.ComboItems;
import model.PhieuXuat;
import model.item;
import service.getCodeRealTime;

/**
 *
 * @author Admin
 */
public class PopupPhieuXuat extends javax.swing.JFrame {

    /**
     * Creates new form PopupPhieuXuat
     */
    
    public PopupPhieuXuat() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        loadDataToComboBox();
    }
    public void setHideAdd(){
        try {
            btnAdd.setVisible(false);
            txtTitle.setText("Chỉnh sửa phiếu xuất");
            txtidcode.setText("{Id: "+XuatKho.phieuXuat.getId()+"} ; {Mã phiếu xuất: "+XuatKho.phieuXuat.getCode()+"}");
            jdcNgayXuat.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(XuatKho.phieuXuat.getOrderDepartureDate()));
            txtDescript.setText(XuatKho.phieuXuat.getDescription());
        } catch (ParseException ex) {
            Logger.getLogger(PopupPhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setHideEditDelete(){
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
        txtTitle.setText("Thêm phiếu xuất");
        txtidcode.setText("");
        jdcNgayXuat.setDate(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jdcNgayXuat = new com.toedter.calendar.JDateChooser();
        cbxKhachHang = new javax.swing.JComboBox<>();
        cbxNhanVien = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescript = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtidcode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 0, 0));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("Phieu xuat");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ngày xuất:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Khách hàng:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nhân viên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ghi chú:");

        jdcNgayXuat.setDateFormatString("yyyy-MM-dd");

        cbxKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNhanVienItemStateChanged(evt);
            }
        });

        txtDescript.setColumns(20);
        txtDescript.setRows(5);
        jScrollPane1.setViewportView(txtDescript);

        btnExit.setBackground(new java.awt.Color(255, 51, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit);

        btnAdd.setBackground(new java.awt.Color(51, 255, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnEdit.setBackground(new java.awt.Color(51, 102, 255));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Chỉnh sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit);

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        txtidcode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtidcode.setText("id-code:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcNgayXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addComponent(txtidcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jdcNgayXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbxNhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNhanVienItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNhanVienItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Object itemNhanVien = cbxNhanVien.getSelectedItem();
        int idNhanVien = ((ComboItems)itemNhanVien).getKey();
        Object itemKhachHang = cbxKhachHang.getSelectedItem();
        int idKhachHang = ((ComboItems)itemKhachHang).getKey();
        String code = new getCodeRealTime().DateTime("PX");
        try {
            PhieuXuat phieuXuat = new PhieuXuat();
            phieuXuat.setCode(code);
            phieuXuat.setOrderDepartureDate(new SimpleDateFormat("yyyy-MM-dd").format(jdcNgayXuat.getDate()));
            phieuXuat.setCustomerID(idKhachHang);
            phieuXuat.setEmployeeID(idNhanVien);
            phieuXuat.setDescription(txtDescript.getText());
            if(new Insert().phieuxuat(phieuXuat)){
                new XuatKho().loadDataToTable("");
                dispose();
                JOptionPane.showMessageDialog(this,"Add success!!!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Error: Add faile");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Object itemNhanVien = cbxNhanVien.getSelectedItem();
        int idNhanVien = ((ComboItems)itemNhanVien).getKey();
        Object itemKhachHang = cbxKhachHang.getSelectedItem();
        int idKhachHang = ((ComboItems)itemKhachHang).getKey();
        String code = new getCodeRealTime().DateTime("PN");
        int idPhieuXuat = XuatKho.phieuXuat.getId();
        try {
            PhieuXuat phieuXuat = new PhieuXuat();
            phieuXuat.setId(idPhieuXuat);
            phieuXuat.setCode(code);
            phieuXuat.setOrderDepartureDate(new SimpleDateFormat("yyyy-MM-dd").format(jdcNgayXuat.getDate()));
            phieuXuat.setCustomerID(idKhachHang);
            phieuXuat.setEmployeeID(idNhanVien);
            phieuXuat.setDescription(txtDescript.getText());
            if(new Update().phieuxuat(phieuXuat)){
                new XuatKho().loadDataToTable("");
                dispose();
                JOptionPane.showMessageDialog(this,"Edit success!!!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Error: Edit faile");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            if (new Delete().phieuxuat(XuatKho.phieuXuat.getId())) {
                new XuatKho().loadDataToTable("");
                JOptionPane.showMessageDialog(this,"Delete Success!!!");
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: "+e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PopupPhieuXuat().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(PopupPhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cbxKhachHang;
    private javax.swing.JComboBox<String> cbxNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcNgayXuat;
    private javax.swing.JTextArea txtDescript;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtidcode;
    // End of variables declaration//GEN-END:variables

    private void loadDataToComboBox() throws Exception {
        //cbx nhan vien
        DefaultComboBoxModel modelnhanvien = new DefaultComboBoxModel();
        List<model.NhanVien> listnhanvien = new ListItem().nhanViens("");
        int sizenhanvien = listnhanvien.size();
        for(int i=0; i<sizenhanvien; i++){
            int id = listnhanvien.get(i).getId();
            String hoten = listnhanvien.get(i).getLastName()+ " " + listnhanvien.get(i).getFirstName();
            modelnhanvien.addElement(new ComboItems(id, hoten));
        }
        cbxNhanVien.setModel(modelnhanvien);
        for(int i = 0; i <sizenhanvien; i++ ){
            Object itemNhanVien = cbxNhanVien.getItemAt(i);
            int idNhanVien = ((ComboItems)itemNhanVien).getKey();
            if (XuatKho.phieuXuat!=null && XuatKho.phieuXuat.getEmployeeID()==idNhanVien) {
                cbxNhanVien.setSelectedIndex(i);
            }
        }
             
        //cbx khach hang
        DefaultComboBoxModel modelkhachhang = new DefaultComboBoxModel();
        List<model.KhachHang> listkhachhang = new ListItem().khachHang("");
        int sizekhachhang = listkhachhang.size();
        for(int i=0; i<sizekhachhang; i++){
            int id = listkhachhang.get(i).getId();
            String name = listkhachhang.get(i).getCustomerName();
            modelkhachhang.addElement(new ComboItems(id, name));
        }
        cbxKhachHang.setModel(modelkhachhang);
        for(int i = 0; i <sizekhachhang; i++ ){
            Object itemKhachHang = cbxKhachHang.getItemAt(i);
            int idKhachHang = ((ComboItems)itemKhachHang).getKey();
            if (XuatKho.phieuXuat!=null && XuatKho.phieuXuat.getCustomerID()==idKhachHang) {
                cbxKhachHang.setSelectedIndex(i);
            }
        }
    }
}
