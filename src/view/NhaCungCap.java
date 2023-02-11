/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import Dao.NhaCCDao;
//import Model.NHACC;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class NhaCungCap extends javax.swing.JPanel {

    /**
     * Creates new form NhaCungCap
     */
    private DefaultTableModel tblModel;
    public NhaCungCap() {
        initComponents();
        initTable();
//        loadDataToTable();
    }
    
    
    
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID nha cung cap","Ten nha cung cap","Dia chi","So dien thoai"});
        tblNhaCC.setModel(tblModel);
    }
    
//    private void loadDataToTable(){
//        try {
//            NhaCCDao dao = new NhaCCDao();
//            List<NHACC> list = dao.findAll();
//            tblModel.setRowCount(0);
//            for(NHACC nhacc : list){
//                tblModel.addRow(new Object[]{
//                    nhacc.getId_nhacc(),
//                    nhacc.getTen_nhacc(),
//                    nhacc.getDia_chi(),
//                    nhacc.getSdt()
//                });
//            }
//            tblModel.fireTableDataChanged();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        btnMoi = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        input = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidnhacc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttennhacc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhaCC = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(112, 159, 157));

        nav.setBackground(new java.awt.Color(86, 125, 137));
        nav.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nav.setLayout(new java.awt.GridBagLayout());

        btnMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMoi.setText("Moi");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        nav.add(btnMoi, new java.awt.GridBagConstraints());

        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setText("them");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        nav.add(btnLuu, new java.awt.GridBagConstraints());

        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCapNhat.setText("Cap nhat");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        nav.add(btnCapNhat, new java.awt.GridBagConstraints());

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        nav.add(btnXoa, new java.awt.GridBagConstraints());

        input.setBackground(new java.awt.Color(255, 255, 204));
        input.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thong tin nha cung cap", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jLabel1.setText("ID nha cung cap (*)");

        txtidnhacc.setEditable(false);
        txtidnhacc.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Ten nha cung cap (*)");

        jLabel3.setText("Dia chi (*)");

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        jLabel4.setText("Sdt (*)");

        javax.swing.GroupLayout inputLayout = new javax.swing.GroupLayout(input);
        input.setLayout(inputLayout);
        inputLayout.setHorizontalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidnhacc)
                    .addComponent(txttennhacc)
                    .addComponent(txtdiachi)
                    .addComponent(txtsdt))
                .addContainerGap())
        );
        inputLayout.setVerticalGroup(
            inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidnhacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttennhacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, 288, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblNhaCC.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhaCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhaCC);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
//        try {
//            // TODO add your handling code here:
//            txtidnhacc.setText(CreateID());
//        } catch (Exception ex) {
//            Logger.getLogger(NhaCungCap.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        txttennhacc.setText("");
//        txtdiachi.setText("");
//        txtsdt.setText("");
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
//        StringBuilder sb = new StringBuilder();
//        if(txtidnhacc.getText().equals("")) sb.append("Ban chua nhap ID nha cung cap");
//        else if(txttennhacc.getText().equals("")) sb.append("Ban chua nhap ten nha cung cap");
//        else if(txtdiachi.getText().equals("")) sb.append("Ban chua nhap dia chi nha cung cap");
//        else if(txtsdt.getText().equals("")) sb.append("Ban chua nhap so dien thoai nha cung cap");
//        if(sb.length()>0){
//           JOptionPane.showMessageDialog(this, sb);
//           return;
//        }
//        try {
//            NHACC nhacc = new NHACC();
//            nhacc.setId_nhacc(txtidnhacc.getText());
//            nhacc.setTen_nhacc(txttennhacc.getText());
//            nhacc.setDia_chi(txtdiachi.getText());
//            nhacc.setSdt(txtsdt.getText());
//            
//            if (new NhaCCDao().insert(nhacc)) {
//                JOptionPane.showMessageDialog(this,"Nha cung cap da duoc them vao CSDL");
//                loadDataToTable();
//            }
//            else{
//                JOptionPane.showMessageDialog(this,"Them khong thanh cong");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "ERROR: "+e.getMessage());
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
//        if(JOptionPane.showConfirmDialog(this,"Ban co muon cap nhat nha cung cap khong?") == JOptionPane.NO_OPTION){
//            return;
//        }
//        try {
//            NHACC nhacc = new NHACC();
//            nhacc.setId_nhacc(txtidnhacc.getText());
//            nhacc.setTen_nhacc(txttennhacc.getText());
//            nhacc.setDia_chi(txtdiachi.getText());
//            nhacc.setSdt(txtsdt.getText());
//            
//            if (new NhaCCDao().update(nhacc)) {
//                JOptionPane.showMessageDialog(this,"Nha cung cap da duoc cap nhat vao CSDL");
//                loadDataToTable();
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "ERROR: "+e.getMessage());
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
//        if(JOptionPane.showConfirmDialog(this,"Ban co muon xoa nha cung cap khong?") == JOptionPane.NO_OPTION){
//            return;
//        }
//        try {
//            if (new NhaCCDao().delete(txtidnhacc.getText())) {
//                JOptionPane.showMessageDialog(this,"Nha cung cap da duoc xoa khoi CSDL");
//                btnMoiActionPerformed(evt);
//                loadDataToTable();
//            }
//            else{
//                JOptionPane.showMessageDialog(this,"Xoa khong thanh cong");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblNhaCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaCCMouseClicked
//        // TODO add your handling code here:
//        try {
//            int row = tblNhaCC.getSelectedRow();
//            if(row >= 0){
//                String id = (String) tblNhaCC.getValueAt(row,0);
//                NhaCCDao dao = new NhaCCDao();
//                NHACC nhacc = dao.findByID(id);
//                System.out.println("id nhacc: "+id);
//
//                if(nhacc != null){
//                    txtidnhacc.setText(nhacc.getId_nhacc());
//                    txttennhacc.setText(nhacc.getTen_nhacc());
//                    txtdiachi.setText(nhacc.getDia_chi());
//                    txtsdt.setText(nhacc.getSdt());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_tblNhaCCMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nav;
    private javax.swing.JTable tblNhaCC;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtidnhacc;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttennhacc;
    // End of variables declaration//GEN-END:variables
}