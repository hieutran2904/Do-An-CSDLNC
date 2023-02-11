/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.PhieuXuatChiTiet;
import service.ConnectDB;

/**
 *
 * @author Admin
 */
public class getNewItem {
    Connection conn = ConnectDB.getConnection();
    //chi tiet phieu xuat
    public PhieuXuatChiTiet phieuXuatChiTiet() throws SQLException{
        String sql = "select top 1* from PHIEUXUATCHITIET where IsDeleted = 0 order by id desc";
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
}
