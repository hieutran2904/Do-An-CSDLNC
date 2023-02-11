/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class PhieuXuat {
    private int id;
    private String code;
    private String orderDepartureDate;// ngay xuat hang
    private int totalAmount;//tong chi phi chuyen hang
    private int customerID;
    private int employeeID;
    private String description;

    public PhieuXuat() {
    }

    public PhieuXuat(int id, String code, String orderDepartureDate, int totalAmount, int customerID, int employeeID, String description) {
        this.id = id;
        this.code = code;
        this.orderDepartureDate = orderDepartureDate;
        this.totalAmount = totalAmount;
        this.customerID = customerID;
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

    public String getOrderDepartureDate() {
        return orderDepartureDate;
    }

    public void setOrderDepartureDate(String orderDepartureDate) {
        this.orderDepartureDate = orderDepartureDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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
    
}
