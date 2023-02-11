/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class PhieuTraHang {
    private int id;
    private int supplyID;//id vat tu
    private int employeeID;//id nha cc
    private int quantity;
    private String orderPayDay;
    private String description;

    public PhieuTraHang() {
    }

    public PhieuTraHang(int id, int supplyID, int employeeID, int quantity,String orderPayDay ,String description) {
        this.id = id;
        this.supplyID = supplyID;
        this.employeeID = employeeID;
        this.quantity = quantity;
        this.orderPayDay = orderPayDay;
        this.description = description;
    }

    public String getOrderPayDay() {
        return orderPayDay;
    }

    public void setOrderPayDay(String orderPayDay) {
        this.orderPayDay = orderPayDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(int supplyID) {
        this.supplyID = supplyID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
