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
import model.NhaCungCap;
import model.PhieuNhap;
import model.PhieuNhapChiTiet;
import model.PhieuXuat;
import model.PhieuXuatChiTiet;
import model.VatTu;
import model.VatTuXuat;
import service.ConnectDB;

/**
 *
 * @author Admin
 */
public class FindById {
    Connection conn = ConnectDB.getConnection();
    
    //phieu nhap
    public PhieuNhap phieuNhap(int id) throws SQLException{
        String sql = "SELECT * FROM dbo.PHIEUNHAP WHERE IsDeleted = 0 AND Id = "+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            PhieuNhap phieuNhap = new PhieuNhap();
            phieuNhap.setId(rs.getInt("Id"));
            phieuNhap.setCode(rs.getString("Code"));
            phieuNhap.setOrderEntryDate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("OrderEntryDate")));
            phieuNhap.setSupplierID(rs.getInt("SupplierID"));
            phieuNhap.setEmployeeID(rs.getInt("EmployeeID"));
            phieuNhap.setDescription(rs.getString("Description"));
            return phieuNhap;
        }
        return null;
    }
    //chi tiet phieu nhap
    public PhieuNhapChiTiet phieuNhapChiTiet(int id) throws SQLException{
        String sql = "SELECT * FROM dbo.PHIEUNHAPCHITIET WHERE IsDeleted = 0 AND Id ="+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            PhieuNhapChiTiet phieuNhapChiTiet = new PhieuNhapChiTiet();
            phieuNhapChiTiet.setId(rs.getInt("Id"));
            phieuNhapChiTiet.setStockReceivedDocketID(rs.getInt("StockReceivedDocketId"));
            phieuNhapChiTiet.setSupplyID(rs.getInt("SupplyId"));
            phieuNhapChiTiet.setQuantity(rs.getInt("Quantity"));
            phieuNhapChiTiet.setSupplyAmount(rs.getInt("SupplyAmount"));
            phieuNhapChiTiet.setTotalAmount(rs.getInt("TotalAmount"));
            phieuNhapChiTiet.setLocationID(rs.getInt("LocationID"));
            phieuNhapChiTiet.setDescription(rs.getString("Description"));
            return phieuNhapChiTiet;
        }
        return null;
    }
   
    
    //vat tu
    public VatTu vatTu(int id) throws SQLException{
        String sql = "SELECT * FROM dbo.VATTU WHERE IsDeleted = 0 AND id = "+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            VatTu vatTu = new VatTu();
            vatTu.setId(rs.getInt("Id"));
            vatTu.setSuppliesName(rs.getString("SuppliesName"));
            vatTu.setSuppliesType(rs.getInt("SuppliesType"));
            vatTu.setSuppliesUnit(rs.getInt("SuppliesUnit"));
            vatTu.setSuppliesAmount(rs.getInt("SuppliesAmount"));
            return vatTu;
        }
        return null;
    }
    
    
    //phieu xuat
    public PhieuXuat phieuXuat(int id) throws SQLException{
        String sql = "SELECT * FROM dbo.PHIEUXUAT WHERE IsDeleted = 0 AND Id = "+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            PhieuXuat phieuXuat = new PhieuXuat();
            phieuXuat.setId(rs.getInt("Id"));
            phieuXuat.setCode(rs.getString("Code"));
            phieuXuat.setOrderDepartureDate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("OrderDepartureDate")));
            phieuXuat.setCustomerID(rs.getInt("CustomerID"));
            phieuXuat.setEmployeeID(rs.getInt("EmployeeID"));
            phieuXuat.setDescription(rs.getString("Description"));
            return phieuXuat;
        }
        return null;
    }
    //chi tiet phieu xuat
    public PhieuXuatChiTiet phieuXuatChiTiet(int id) throws SQLException{
        String sql = "SELECT * FROM dbo.PHIEUXUATCHITIET WHERE IsDeleted = 0 AND Id ="+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            PhieuXuatChiTiet phieuXuatChiTiet = new PhieuXuatChiTiet();
            phieuXuatChiTiet.setId(rs.getInt("Id"));
            phieuXuatChiTiet.setDelieveryDocketID(rs.getInt("DelieveryDocketID"));
            phieuXuatChiTiet.setSupplyID(rs.getInt("SupplyId"));
            phieuXuatChiTiet.setQuantity(rs.getInt("Quantity"));
            phieuXuatChiTiet.setSupplyAmount(rs.getInt("SupplyAmount"));
            phieuXuatChiTiet.setTotalAmount(rs.getInt("TotalAmount"));
            phieuXuatChiTiet.setLocationID(rs.getInt("LocationID"));
            phieuXuatChiTiet.setDescription(rs.getString("Description"));
            return phieuXuatChiTiet;
        }
        return null;
    }
    
    //nha cung cap
    public NhaCungCap nhaCungCap(int id) throws SQLException{
        String sql = "SELECT * FROM dbo.NHACUNGCAP where IsDeleted = 0 AND Id = "+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            NhaCungCap nhaCungCap = new NhaCungCap();
            nhaCungCap.setId(rs.getInt("Id"));
            nhaCungCap.setSupplier(rs.getString("Supplier"));
            nhaCungCap.setAddress(rs.getString("Address"));
            nhaCungCap.setPhone(rs.getString("Phone"));
            return nhaCungCap;
        }
        return null;
    }
    
     //nha cung cap
    public VatTuXuat vatTuXuat(int id) throws SQLException{
        String sql = "SELECT Id, SupplyId FROM dbo.HANGTONKHO WHERE Id = "+id;
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            VatTuXuat vatTuXuat = new VatTuXuat();
            vatTuXuat.setId(rs.getInt("Id"));
            vatTuXuat.setSupplierId(rs.getInt("SupplyId"));
            return vatTuXuat;
        }
        return null;
    }
    
    
    
    public static void main(String[] args) throws SQLException {
        FindById find = new FindById();
        //System.out.println(find.phieuNhap(13).getCode());
        //System.out.println(find.vatTu(12).getSuppliesAmount());
        System.out.println(find.vatTuXuat(58).getSupplierId());
    }
}
