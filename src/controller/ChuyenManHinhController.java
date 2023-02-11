/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.KhachHang;
import view.KhoBai;
import view.NhaCungCap;
import view.NhanVien;
import view.NhapKho;
import view.ThongKe;
import view.TraVatTu;
import view.TrangChu;
import view.VatTu;
import view.NhapKho;
import view.XuatKho;

/**
 *
 * @author Admin
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem = null;
    
    public ChuyenManHinhController(JPanel root) {
        this.root = root;
    }
    
    public void setView(JLabel jlbItem) throws Exception{
        kindSelected = "TrangChu";
        //jlbItem.setBackground(new Color(250,250,250));
        jlbItem.setForeground(Color.red);
        jlbItem.setFont(new Font("Dialog", Font.BOLD, 16));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{
        
        private JPanel node;
        
        private String kind;
        private JLabel jlbItem;

        public LabelEvent(String kind, JLabel jlbItem) {
            this.kind = kind;
            this.jlbItem = jlbItem;
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                switch(kind){
                    case "TrangChu":
                        node = new TrangChu();
                        break;
                    case "NhapKho":
                        node = new NhapKho(); //nhap kho
                        break;
                    case "XuatKho":
                        node = new XuatKho(); //xuat kho
                        break;
                    case "HoanTra":
                        node = new TraVatTu(); //tra hang
                        break;
                    case "KhoBai":
                        node = new KhoBai(); //kho bai
                        break;
                    case "NhaCungCap":
                        node = new NhaCungCap(); //nha cung cap
                        break;
                    case "NhanVien":
                        node = new NhanVien(); //nhan vien
                        break;
                    case "KhachHang":
                        node = new KhachHang(); //khach hang
                        break;
                    case "VatTu":
                        node = new VatTu();  // vat tu
                        break;
                    case "ThongKe":
                        node = new ThongKe();  // thong ke
                        break;
                           
                }
                root.removeAll();
                root.setLayout(new BorderLayout());
                root.add(node);
                root.validate();
                root.repaint();
                setChangeBackground(kind);
            } catch (Exception ex) {
                Logger.getLogger(ChuyenManHinhController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            //jlbItem.setBackground(new Color(250,250,250));
            jlbItem.setForeground(Color.red);
            jlbItem.setFont(new Font("Dialog", Font.BOLD, 16));
        }
        
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
            //jlbItem.setBackground(new Color(250,250,250));
            jlbItem.setForeground(Color.red);
            jlbItem.setFont(new Font("Dialog", Font.BOLD, 16));
        }
        
        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                //jlbItem.setBackground(new Color(220, 220, 220));
                jlbItem.setForeground(new Color(0,0,0));
                jlbItem.setFont(new Font("Dialog", Font.PLAIN, 14));
            }
        }
    }
    
    private void setChangeBackground(String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                //item.getJlb().setBackground(new Color(250,250,250));
                item.getJlb().setForeground(Color.red);
                item.getJlb().setFont(new Font("Dialog", Font.BOLD, 16));
            } else{
                //item.getJlb().setBackground(new Color(220, 220, 220));
                item.getJlb().setForeground(new Color(0,0,0));
                item.getJlb().setFont(new Font("Dialog", Font.PLAIN, 14));
            }
        }
    }
}
