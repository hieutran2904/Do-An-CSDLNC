/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.Delete;
import dao.FindById;
import dao.Insert;
import dao.ListItem;
import dao.Update;
import dao.getNewItem;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.ComboItems;
import model.PhieuXuatChiTiet;
import static view.XuatKho.phieuXuat;

/**
 *
 * @author Admin
 */
public class PopupPhieuXuatChiTiet extends javax.swing.JFrame {

    /**
     * Creates new form PopupPhieuXuatChiTiet
     */
    public PopupPhieuXuatChiTiet() throws SQLException, Exception {
        initComponents();
        setLocationRelativeTo(null);
        txtid.setText("ID: "+Integer.toString(new XuatKho().idState));
        txtcode.setText("Mã phiếu xuất: "+new XuatKho().code);
        loadDataToComboBoxVatTu();
        loadDataToComboBoxKhoHang();
        
        Object itemkhohang = cbxKhoHang.getSelectedItem();
        int idkhohang = ((ComboItems)itemkhohang).getKey();
        loadDataToComboBoxViTri(idkhohang);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxVatTu = new javax.swing.JComboBox<>();
        txtDonGia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        cbxKhoHang = new javax.swing.JComboBox<>();
        cbxViTri = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtid = new javax.swing.JLabel();
        txtcode = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtTitle = new javax.swing.JLabel();
        btnAddPhieuXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpnRoot.setBackground(new java.awt.Color(204, 204, 204));
        jpnRoot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên vật tư:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Đơn giá:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Số lượng:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Kho hàng:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Vị Trí Vật Tư:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Ghi Chú:");

        cbxVatTu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxVatTu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVatTuItemStateChanged(evt);
            }
        });

        cbxKhoHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxKhoHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxKhoHangItemStateChanged(evt);
            }
        });

        cbxViTri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        txtid.setBackground(new java.awt.Color(153, 153, 153));
        txtid.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        txtid.setText("ID:");

        txtcode.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        txtcode.setText("Mã Phieu: ");

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

        txtTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 0, 51));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("Title");

        btnAddPhieuXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-15.png"))); // NOI18N
        btnAddPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhieuXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxViTri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong)
                            .addComponent(cbxKhoHang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxVatTu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPhieuXuat)))
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid)
                    .addComponent(btnAddPhieuXuat))
                .addGap(8, 8, 8)
                .addComponent(txtcode)
                .addGap(30, 30, 30)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxVatTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxKhoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhieuXuatActionPerformed
        // TODO add your handling code here:
        PopupPhieuXuat popupPhieuXuat = null;
        try {
            popupPhieuXuat = new PopupPhieuXuat();
        } catch (Exception ex) {
            Logger.getLogger(PopupPhieuXuatChiTiet.class.getName()).log(Level.SEVERE, null, ex);
        }
        popupPhieuXuat.setVisible(true);
        popupPhieuXuat.setHideEditDelete();
        dispose();
    }//GEN-LAST:event_btnAddPhieuXuatActionPerformed

    private void cbxKhoHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxKhoHangItemStateChanged
        // TODO add your handling code here:
        Object itemkhohang = cbxKhoHang.getSelectedItem();
        int idkhohang = ((ComboItems)itemkhohang).getKey();
        System.out.println("id: "+idkhohang);
        try {
            loadDataToComboBoxViTri(idkhohang);
        } catch (Exception ex) {
            Logger.getLogger(PopupPhieuXuatChiTiet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxKhoHangItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Object itemVatTu = cbxVatTu.getSelectedItem();
        int idVatTu = ((ComboItems)itemVatTu).getKey();
        Object itemKhoHang = cbxKhoHang.getSelectedItem();
        int idKhoHang = ((ComboItems)itemKhoHang).getKey();
        Object itemViTri = cbxViTri.getSelectedItem();
        int idViTri = ((ComboItems)itemViTri).getKey();
        
        StringBuilder sb = new StringBuilder();
        if(txtDonGia.getText().equals("")){
            sb.append("Bạn chưa nhập đơn giá");
        }
        else if(txtSoLuong.getText().equals("")){
            sb.append("Bạn chưa nhập số lượng");
        }
        if(sb.length()>0){
           JOptionPane.showMessageDialog(this, sb);
           return;
        }
        try {
            PhieuXuatChiTiet phieuXuatChiTiet = new PhieuXuatChiTiet();
            phieuXuatChiTiet.setDelieveryDocketID(XuatKho.phieuXuat.getId());
            phieuXuatChiTiet.setSupplyID(idVatTu);
            phieuXuatChiTiet.setSupplyAmount(Integer.parseInt(txtDonGia.getText()));
            phieuXuatChiTiet.setQuantity(Integer.parseInt(txtSoLuong.getText()));
            phieuXuatChiTiet.setDescription(txtDescription.getText());
            phieuXuatChiTiet.setLocationID(idViTri);
            if(new Insert().phieuxuatchitiet(phieuXuatChiTiet)){
                new XuatKho().loadDataToTable("");
                dispose();
                //new Insert().hangtonkhoXuat(XuatKho.phieuXuat.getId()); //xu ly du lieu ton kho out
                new Insert().hangtonkhoXuat(new getNewItem().phieuXuatChiTiet().getId());
                JOptionPane.showMessageDialog(this,"Add success!!!");
                //System.out.println("id: ");
            }
            else{
                JOptionPane.showMessageDialog(this,"Error: Add faile");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            if (new Delete().phieuxuatchitiet(XuatKho.phieuXuatChiTiet.getId())) {
                new Insert().hangtonkhoXuat(XuatKho.phieuXuat.getId()); //xu ly du lieu ton kho out
                new XuatKho().loadDataToTable("");
                JOptionPane.showMessageDialog(this,"Delete Success!!!");
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: "+e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Object itemVatTu = cbxVatTu.getSelectedItem();
        int idVatTu = ((ComboItems)itemVatTu).getKey();
        Object itemKhoHang = cbxKhoHang.getSelectedItem();
        int idKhoHang = ((ComboItems)itemKhoHang).getKey();
        Object itemViTri = cbxViTri.getSelectedItem();
        int idViTri = ((ComboItems)itemViTri).getKey();
        int idPhieuXuatChiTiet = XuatKho.phieuXuatChiTiet.getId();
        StringBuilder sb = new StringBuilder();
        if(txtDonGia.getText().equals("")){
            sb.append("Bạn chưa nhập đơn giá");
        }
        else if(txtSoLuong.getText().equals("")){
            sb.append("Bạn chưa nhập số lượng");
        }
        if(sb.length()>0){
           JOptionPane.showMessageDialog(this, sb);
           return;
        }
        try {
            PhieuXuatChiTiet phieuXuatChiTiet = new PhieuXuatChiTiet();
            phieuXuatChiTiet.setId(idPhieuXuatChiTiet);
            phieuXuatChiTiet.setDelieveryDocketID(XuatKho.phieuXuat.getId());
            phieuXuatChiTiet.setSupplyID(idVatTu);
            phieuXuatChiTiet.setSupplyAmount(Integer.parseInt(txtDonGia.getText()));
            phieuXuatChiTiet.setQuantity(Integer.parseInt(txtSoLuong.getText()));
            phieuXuatChiTiet.setDescription(txtDescription.getText());
            phieuXuatChiTiet.setLocationID(idViTri);
            if(new Update().phieuxuatchitiet(phieuXuatChiTiet)){
                new XuatKho().loadDataToTable("");
                dispose();
                new Insert().hangtonkhoXuat(idPhieuXuatChiTiet); //xu ly du lieu trong bang ton kho
                JOptionPane.showMessageDialog(this,"Edit success!!!");
                //System.out.println("id: ");
            }
            else{
                JOptionPane.showMessageDialog(this,"Error: Edit faile");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cbxVatTuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVatTuItemStateChanged
        // TODO add your handling code here:
        Object itemVatTu = cbxVatTu.getSelectedItem();
        int idVatTuTonKho = ((ComboItems)itemVatTu).getKey();
        int idVatTu;
        try {
            idVatTu = new FindById().vatTuXuat(idVatTuTonKho).getSupplierId();
            txtDonGia.setText(Integer.toString(new FindById().vatTu(idVatTu).getSuppliesAmount()));
        } catch (SQLException ex) {
            Logger.getLogger(PopupPhieuXuatChiTiet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //int soluong = ((ComboItems)itemVatTu).getKey();
    }//GEN-LAST:event_cbxVatTuItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PopupPhieuXuatChiTiet().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PopupPhieuXuatChiTiet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(PopupPhieuXuatChiTiet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void setHideAdd(){
        btnAdd.setVisible(false);
        txtTitle.setText("Chỉnh sửa phiếu xuất chi tiết");
        txtid.setText("ID phiếu xuất"+Integer.toString(XuatKho.phieuXuat.getId()));
        txtcode.setText("Mã phiếu xuất"+XuatKho.phieuXuat.getCode());
        txtSoLuong.setText(Integer.toString(XuatKho.phieuXuatChiTiet.getQuantity()));
        txtDonGia.setText(Integer.toString(XuatKho.phieuXuatChiTiet.getSupplyAmount()));
        txtDescription.setText(XuatKho.phieuXuatChiTiet.getDescription());
    }
    public void setHideEditDelete(){
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
        txtTitle.setText("Thêm phiếu xuất chi tiết");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddPhieuXuat;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cbxKhoHang;
    private javax.swing.JComboBox<String> cbxVatTu;
    private javax.swing.JComboBox<String> cbxViTri;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtcode;
    private javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables

    private void loadDataToComboBoxVatTu() throws SQLException {
        DefaultComboBoxModel modelvattu = new DefaultComboBoxModel();
        List<model.VatTuXuat> listvatu = new ListItem().vatTuXuat(XuatKho.phieuXuat.getId());
        int sizevattu = listvatu.size();
        for(int i=0; i<sizevattu; i++){
            int idvt = listvatu.get(i).getId();
            String ten = listvatu.get(i).getSuppliesName()+" - "+listvatu.get(i).getSupplier();
            modelvattu.addElement(new ComboItems(idvt, ten));
        }
        cbxVatTu.setModel(modelvattu);
        for(int i=0; i<sizevattu; i++){
            Object itemVatTu = cbxVatTu.getItemAt(i);
            int idVatTu = ((ComboItems)itemVatTu).getKey();
            if (XuatKho.phieuXuatChiTiet != null && XuatKho.phieuXuatChiTiet.getSupplyID()==idVatTu) {
                cbxVatTu.setSelectedIndex(i);
            }
        }
    }

    private void loadDataToComboBoxKhoHang() throws SQLException, Exception {
        DefaultComboBoxModel modelkhohang = new DefaultComboBoxModel();
        List<model.KhoHang> listkhohang = new ListItem().khoHang("");
        int sizekhohang = listkhohang.size();
        for(int i=0; i<sizekhohang; i++){
            int id = listkhohang.get(i).getId();
            String ten = listkhohang.get(i).getName();
            modelkhohang.addElement(new ComboItems(id, ten));
        }
        cbxKhoHang.setModel(modelkhohang);
//        for(int i=0; i<sizekhohang; i++){
//            Object itemKhoHang = cbxKhoHang.getItemAt(i);
//            int idKhoHang = ((ComboItems)itemKhoHang).getKey();
//            if (XuatKho.phieuXuatChiTiet.getSupplyID()==idKhoHang) {
//                cbxVatTu.setSelectedIndex(i);
//            }
//        }
    }
    private void loadDataToComboBoxViTri(int idSelected) throws SQLException, Exception {
        DefaultComboBoxModel modelvitri = new DefaultComboBoxModel();
        List<model.ViTriKhoHang> listvitri = new ListItem().viTriKhoHang(idSelected);
        int sizevattu = listvitri.size();
        for(int i=0; i<sizevattu; i++){
            int id = listvitri.get(i).getId();
            String ten = listvitri.get(i).getName();
            modelvitri.addElement(new ComboItems(id, ten));
        }
        cbxViTri.setModel(modelvitri);
    }
}
