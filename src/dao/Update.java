/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.PhieuNhap;
import model.PhieuNhapChiTiet;
import model.PhieuTraHang;
import model.PhieuXuat;
import model.PhieuXuatChiTiet;
import service.ConnectDB;

/**
 *
 * @author Admin
 */
public class Update {
    Connection conn = null;
    
    //phieu nhap
    public boolean phieunhap(PhieuNhap phieuNhap){
        String sql = "UPDATE dbo.PHIEUNHAP SET OrderEntryDate = ?, SupplierId = ?, EmployeeId = ?, Description = ?\n" +
                    "WHERE Id = ?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phieuNhap.getOrderEntryDate());
            pstmt.setInt(2, phieuNhap.getSupplierID());
            pstmt.setInt(3, phieuNhap.getEmployeeID());
            pstmt.setString(4, phieuNhap.getDescription());
            pstmt.setInt(5, phieuNhap.getId());
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false; 
    }
    
    //phieu nhap chi tiet
    public boolean phieunhapchitiet(PhieuNhapChiTiet phieuNhapChiTiet){
        String sql = "UPDATE dbo.PHIEUNHAPCHITIET SET Quantity = ?, SupplyAmount = ?, Description = ?, LocationId = ?\n" +
                    "WHERE Id=?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, phieuNhapChiTiet.getQuantity());
            pstmt.setInt(2, phieuNhapChiTiet.getSupplyAmount());
            pstmt.setString(3, phieuNhapChiTiet.getDescription());
            pstmt.setInt(4, phieuNhapChiTiet.getLocationID());
            pstmt.setInt(5, phieuNhapChiTiet.getId());
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false; 
    }
    //phieu xuat
    public boolean phieuxuat(PhieuXuat phieuXuat){
        String sql = "UPDATE dbo.PHIEUXUAT SET OrderDepartureDate = ?, CustomerId = ?,  EmployeeId = ?, Description = ?\n" +
                    "WHERE Id = ?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phieuXuat.getOrderDepartureDate());
            pstmt.setInt(2, phieuXuat.getCustomerID());
            pstmt.setInt(3, phieuXuat.getEmployeeID());
            pstmt.setString(4, phieuXuat.getDescription());
            pstmt.setInt(5, phieuXuat.getId());
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false; 
    }
    //phieu nhap chi tiet
    public boolean phieuxuatchitiet(PhieuXuatChiTiet phieuXuatChiTiet){
        String sql = "UPDATE dbo.PHIEUXUATCHITIET SET Quantity = ?, SupplyAmount = ?, Description = ?, LocationId = ?\n" +
                    "WHERE Id=?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, phieuXuatChiTiet.getQuantity());
            pstmt.setInt(2, phieuXuatChiTiet.getSupplyAmount());
            pstmt.setString(3, phieuXuatChiTiet.getDescription());
            pstmt.setInt(4, phieuXuatChiTiet.getLocationID());
            pstmt.setInt(5, phieuXuatChiTiet.getId());
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false; 
    }
    
    //phieu tra hang
    public boolean phieutrahang(PhieuTraHang phieuTraHang){
        String sql = "UPDATE dbo.PHIEUTRAHANG SET OrderPayDay = ?, Quantity = ?, Description = ? WHERE Id = ?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phieuTraHang.getOrderPayDay());
            pstmt.setInt(2, phieuTraHang.getQuantity());
            pstmt.setString(3, phieuTraHang.getDescription());
            pstmt.setInt(4, phieuTraHang.getId());
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false; 
    }

}
