/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class PhieuNhap {
    private int id;
    private String code;
    private String orderEntryDate;
    private int totalAmount; //Tong chi phi chuyen hang (null)
    private int supplierID; //id nha cc
    private int employeeID;
    private String description;

    public PhieuNhap() {
    }

    public PhieuNhap(int id, String code, String orderEntryDate, int totalAmount, int supplierID, int employeeID, String description) {
        this.id = id;
        this.code = code;
        this.orderEntryDate = orderEntryDate;
        this.totalAmount = totalAmount;
        this.supplierID = supplierID;
        this.employeeID = employeeID;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrderEntryDate() {
        return orderEntryDate;
    }

    public void setOrderEntryDate(String orderEntryDate) {
        this.orderEntryDate = orderEntryDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PhieuNhap{" + "id=" + id + ", code=" + code + ", orderEntryDate=" + orderEntryDate + ", totalAmount=" + totalAmount + ", supplierID=" + supplierID + ", employeeID=" + employeeID + ", description=" + description + '}';
    }
    
}
