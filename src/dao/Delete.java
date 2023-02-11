/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.PhieuNhap;
import service.ConnectDB;

/**
 *
 * @author Admin
 */
public class Delete {
    Connection conn = null;
    
    //phieu nhap
    public boolean phieunhap(int id){
        String sql = "UPDATE dbo.PHIEUNHAP SET IsDeleted = 1 WHERE Id = "+id;
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
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
    public boolean phieunhapchitiet(int id){
        String sql = "UPDATE dbo.PHIEUNHAPCHITIET SET Quantity = 0  WHERE id = "+id;
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
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
    public boolean phieuxuat(int id){
        String sql = "UPDATE dbo.PHIEUXUAT SET IsDeleted = 1 WHERE Id = "+id;
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
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
    public boolean phieuxuatchitiet(int id){
        String sql = "UPDATE dbo.PHIEUXUATCHITIET SET IsDeleted = 1 WHERE id = "+id;
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
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
    public boolean phieutrahang(int id){
        String sql = "UPDATE dbo.PHIEUTRAHANG SET IsDeleted = 1 WHERE id = "+id;
        try {
            conn = ConnectDB.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
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
