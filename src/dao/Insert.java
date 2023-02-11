/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.HangTonKho;
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
public class Insert {
    Connection conn = null;
    
    //phieu nhap
    public boolean phieunhap(PhieuNhap phieuNhap){
        String sql = "INSERT INTO dbo.PHIEUNHAP\n" +
                    "(\n" +
                    "    Code,\n" +
                    "    OrderEntryDate,\n" +
                    "    SupplierId,\n" +
                    "    EmployeeId,\n" +
                    "    Description\n" +
                    ")\n" +
                    "VALUES(?,?,?,?,?)";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phieuNhap.getCode());
            pstmt.setString(2, phieuNhap.getOrderEntryDate());
            pstmt.setInt(3, phieuNhap.getSupplierID());
            pstmt.setInt(4, phieuNhap.getEmployeeID());
            pstmt.setString(5, phieuNhap.getDescription());
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
        String sql = "INSERT INTO dbo.PHIEUNHAPCHITIET\n" +
                    "(\n" +
                    "    StockReceivedDocketId,\n" +
                    "    SupplyId,\n" +
                    "    Quantity,\n" +
                    "    SupplyAmount,\n" +
                    "    Description,\n" +
                    "    LocationId\n" +
                    ")\n" +
                    "VALUES(?,?,?,?,?,?)";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, phieuNhapChiTiet.getStockReceivedDocketID());
            pstmt.setInt(2, phieuNhapChiTiet.getSupplyID());
            pstmt.setInt(3, phieuNhapChiTiet.getQuantity());
            pstmt.setInt(4, phieuNhapChiTiet.getSupplyAmount());
            pstmt.setString(5, phieuNhapChiTiet.getDescription());
            pstmt.setInt(6, phieuNhapChiTiet.getLocationID());
            
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
        String sql = "INSERT INTO dbo.PHIEUXUAT\n" +
                    "(\n" +
                    "    Code,\n" +
                    "    OrderDepartureDate,\n" +
                    "    CustomerId,\n" +
                    "    EmployeeId,\n" +
                    "    Description\n" +
                    ")" +
                    "VALUES(?,?,?,?,?)";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, phieuXuat.getCode());
            pstmt.setString(2, phieuXuat.getOrderDepartureDate());
            pstmt.setInt(3, phieuXuat.getCustomerID());
            pstmt.setInt(4, phieuXuat.getEmployeeID());
            pstmt.setString(5, phieuXuat.getDescription());
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
    
    //phieu xuat chi tiet
    public boolean phieuxuatchitiet(PhieuXuatChiTiet phieuXuatChiTiet){
        String sql = "INSERT INTO dbo.PHIEUXUATCHITIET\n" +
                    "(\n" +
                    "DelieveryDocketId,\n" +
                    "SupplyId,\n" +
                    "Quantity,\n" +
                    "SupplyAmount,\n" +
                    "Description,\n" +
                    "LocationId" +
                    ")\n" +
                    "VALUES(?,?,?,?,?,?)";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, phieuXuatChiTiet.getDelieveryDocketID());
            pstmt.setInt(2, phieuXuatChiTiet.getSupplyID());
            pstmt.setInt(3, phieuXuatChiTiet.getQuantity());
            pstmt.setInt(4, phieuXuatChiTiet.getSupplyAmount());
            pstmt.setString(5, phieuXuatChiTiet.getDescription());
            pstmt.setInt(6, phieuXuatChiTiet.getLocationID());
            
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
    
    //nhap ton kho nhap
    public boolean hangtonkhoNhap(int id){
        String sql = "EXEC HANGTONKHO_INS @IdPhieunhap = ?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
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
    
    //xuat ton kho
    public boolean hangtonkhoXuat(int id){
        String sql = "EXEC HANGTONKHO_OUT @IdPhieuxuat = ?";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
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
        String sql = "INSERT INTO [dbo].[PHIEUTRAHANG]\n" +
                "           ([SupplyId]\n" +
                "           ,[OrderPayDay]\n" +
                "           ,[EmployeeId]\n" +
                "           ,[Quantity]\n" +
                "           ,[Description]           \n" +
                "     VALUES(?,?,?,?,?)";
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, phieuTraHang.getSupplyID());
            pstmt.setString(2, phieuTraHang.getOrderPayDay());
            pstmt.setInt(3, phieuTraHang.getEmployeeID());
            pstmt.setInt(4, phieuTraHang.getQuantity());
            pstmt.setString(5, phieuTraHang.getDescription());
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
    
    
//    public static void main(String[] args) {
//        Insert ins = new Insert();
//    
//    }
}
