/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.HangTonKho;
import model.KhachHang;
import model.KhoHang;
import model.NhaCungCap;
import model.NhanVien;
import model.PhieuNhap;
import model.PhieuTraHang;
import model.PhieuXuat;
import model.VatTu;
import model.VatTuXuat;
import model.ViTriKhoHang;
import service.ConnectDB;

/**
 *
 * @author Admin
 */
public class ListItem {
    Connection conn = null;
    //nhan vien
    public List<NhanVien> nhanViens(String key) throws Exception{
        String sql = "SELECT * FROM dbo.NHANVIEN WHERE IsDeleted = 0  AND (EmployeeFirstName LIKE N'%"+key+"%' OR EmployeeLastName LIKE N'%"+key+"%')";
        List<NhanVien> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                NhanVien nhanvien = new NhanVien();
                nhanvien.setId(rs.getInt("Id"));
                nhanvien.setLastName(rs.getString("EmployeeLastName"));
                nhanvien.setFirstName(rs.getString("EmployeeFirstName"));
                nhanvien.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("DateOfBirth")));
                nhanvien.setGenderID(rs.getInt("GenderId"));
                nhanvien.setPhone(rs.getString("Phone"));
                nhanvien.setUserNameAccount(rs.getString("UserAccount"));
                nhanvien.setUserPasswordAccount(rs.getString("UserPassword"));
                
                list.add(nhanvien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //nha cung cap
    public List<NhaCungCap> nhaCungCaps(String key) throws Exception{
        String sql = "SELECT * FROM dbo.NHACUNGCAP WHERE IsDeleted = 0 AND Supplier LIKE N'%"+key+"%'";
        List<NhaCungCap> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setId(rs.getInt("Id"));
                nhaCungCap.setSupplier(rs.getString("Supplier"));
                nhaCungCap.setAddress(rs.getString("Address"));
                nhaCungCap.setPhone(rs.getString("Phone"));
                list.add(nhaCungCap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //kho hang
    public List<KhoHang> khoHang(String key) throws Exception{
        String sql = "SELECT * FROM dbo.KHOHANG WHERE IsDeleted = 0 AND Name LIKE N'%"+key+"%'";
        List<KhoHang> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                KhoHang khoHang = new KhoHang();
                khoHang.setId(rs.getInt("Id"));
                khoHang.setCode(rs.getString("Code"));
                khoHang.setName(rs.getString("Name"));
                khoHang.setDescription(rs.getString("Description"));
                list.add(khoHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //vi tri hang trong kho
    public List<ViTriKhoHang> viTriKhoHang(int id) throws SQLException{
        String sql = "SELECT VITRIKHOHANG.Id, VITRIKHOHANG.Code, VITRIKHOHANG.Name\n" +
                    "FROM dbo.VITRIKHOHANG LEFT JOIN dbo.KHOHANG \n" +
                    "ON KHOHANG.Id = VITRIKHOHANG.WarehouseId\n" +
                    "WHERE VITRIKHOHANG.IsDeleted = 0 AND KHOHANG.Id = "+id;
                
        conn = ConnectDB.getConnection();
        List<ViTriKhoHang> list = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {                
                ViTriKhoHang viTriKhoHang = new ViTriKhoHang();
                viTriKhoHang.setId(rs.getInt("Id"));
                viTriKhoHang.setName(rs.getString("Name"));
                list.add(viTriKhoHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //vat tu
    public List<VatTu> vatTu(int StockReceivedDocketId) throws SQLException{
        String sql = "SELECT Id, SuppliesName FROM dbo.VATTU \n" +
                    "WHERE IsDeleted = 0 AND Id NOT IN(\n" +
                    "	SELECT SupplyId FROM dbo.PHIEUNHAPCHITIET\n" +
                    "	WHERE IsDeleted = 0 AND Quantity != 0 AND StockReceivedDocketId =" +StockReceivedDocketId+
                    ")";
        conn = ConnectDB.getConnection();
        List<VatTu> list = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {                
                VatTu vatTu = new VatTu();
                vatTu.setId(rs.getInt("Id"));
                vatTu.setSuppliesName(rs.getString("SuppliesName"));
                list.add(vatTu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //vat tu xuat
    public List<VatTuXuat> vatTuXuat(int DelieveryDocketId) throws SQLException{
        String sql = "SELECT HANGTONKHO.Id,HANGTONKHO.SupplierId,SuppliesName,Supplier, HANGTONKHO.Quantity, SuppliesAmount FROM dbo.HANGTONKHO INNER JOIN dbo.VATTU\n" +
                    "ON VATTU.Id = HANGTONKHO.SupplyId left JOIN dbo.PHIEUXUATCHITIET ON PHIEUXUATCHITIET.SupplyId = VATTU.Id\n" +
                    "LEFT JOIN dbo.NHACUNGCAP ON NHACUNGCAP.Id = HANGTONKHO.SupplierId\n" +
                    "WHERE HANGTONKHO.SupplyId NOT IN (SELECT SupplyId FROM dbo.PHIEUXUATCHITIET where IsDeleted = 0 AND DelieveryDocketId = "+DelieveryDocketId+")";
        conn = ConnectDB.getConnection();
        List<VatTuXuat> list = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {                
                VatTuXuat vatTuXuat = new VatTuXuat();
                vatTuXuat.setId(rs.getInt("Id")); //id vat tu-> pxct
                vatTuXuat.setSupplierId(rs.getInt("SupplierId"));
                vatTuXuat.setSuppliesName(rs.getString("SuppliesName"));// ten vat tu
                vatTuXuat.setSupplier(rs.getString("Supplier")); //nha cc
                vatTuXuat.setQuantity(rs.getInt("Quantity"));
                vatTuXuat.setSuppliesAmount(rs.getInt("SuppliesAmount"));
                list.add(vatTuXuat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //khach hang
    public List<KhachHang> khachHang(String key) throws Exception{
        String sql = "SELECT * FROM dbo.KHACHHANG WHERE IsDeleted = 0 AND CustomerName LIKE N'%"+key+"%'";
        List<KhachHang> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setId(rs.getInt("Id"));
                khachHang.setCustomerName(rs.getString("CustomerName"));
                khachHang.setGenderID(rs.getInt("GenderId"));
                khachHang.setPhone(rs.getString("Phone"));
                list.add(khachHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //hang ton kho
    public List<HangTonKho> hangTonKho(String name) throws Exception{
        String sql = "SELECT * FROM dbo.HANGTONKHO";
        List<HangTonKho> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                HangTonKho hangTonKho = new HangTonKho();
                hangTonKho.setId(rs.getInt("Id"));
                hangTonKho.setSupplyID(rs.getInt("SupplyID"));
                hangTonKho.setQuantity(rs.getInt("Quantity"));
                hangTonKho.setQuantityRemain(rs.getInt("QuantityRemain"));
                hangTonKho.setSupplierID(rs.getInt("SupplierID"));
                list.add(hangTonKho);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //hang ton kho laod freechart
//    public List<HangTonKho> hangTonKho(String name) throws Exception{
//        String sql = "SELECT * FROM dbo.HANGTONKHO";
//        List<HangTonKho> list = new ArrayList<>(); 
//        try {
//            conn = ConnectDB.getConnection();
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            
//            while(rs.next()){
//                HangTonKho hangTonKho = new HangTonKho();
//                hangTonKho.setId(rs.getInt("Id"));
//                hangTonKho.setSupplyID(rs.getInt("SupplyID"));
//                hangTonKho.setQuantity(rs.getInt("Quantity"));
//                hangTonKho.setQuantityRemain(rs.getInt("QuantityRemain"));
//                hangTonKho.setSupplierID(rs.getInt("SupplierID"));
//                list.add(hangTonKho);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally{
//            conn.close();
//        }
//        return list;
//    }
    
    //phieu nhap
    public List<PhieuNhap> phieuNhap(String name) throws Exception{
        String sql = "SELECT * FROM dbo.PHIEUNHAP WHERE IsDeleted = 0";
        List<PhieuNhap> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                PhieuNhap phieuNhap = new PhieuNhap();
                
                list.add(phieuNhap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //phieu xuat
    public List<PhieuXuat> phieuXuat(String name) throws Exception{
        String sql = "SELECT * FROM dbo.PHIEUXUAT WHERE IsDeleted = 0";
        List<PhieuXuat> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                PhieuXuat phieuXuat = new PhieuXuat();
                
                list.add(phieuXuat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    //phieu tra
    public List<PhieuTraHang> phieuTraHang(String name) throws Exception{
        String sql = "SELECT * FROM dbo.PHIEUTRAHANG WHERE IsDeleted = 0";
        List<PhieuTraHang> list = new ArrayList<>(); 
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                PhieuTraHang phieuTraHang = new PhieuTraHang();
                
                list.add(phieuTraHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            conn.close();
        }
        return list;
    }
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        ListItem list = new ListItem();
//        list.nhanViens("");
//        System.out.println("danh sach: "+list.nhanViens(""));
//System.out.println("danh sach: "+list.nhaCungCaps(""));
System.out.println("khach hang: "+ list.khachHang(""));
//        System.out.println("list hang ton kho: "+list.hangTonKho(""));
        System.out.println(list.phieuTraHang("").size());
        System.out.println("vat tu ton kho: "+ list.vatTuXuat(7).get(0).getId());
    }
}
