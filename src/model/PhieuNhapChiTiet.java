/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class PhieuNhapChiTiet {
    private int id;
    private int stockReceivedDocketID; //id phieu nhap
    private int supplyID; //id vat tu
    private int quantity; //so luong
    private int supplyAmount; //don gia
    private int totalAmount; // thanh tien
    private String description;
    private int locationID; //id vi tri kho hang

    public PhieuNhapChiTiet() {
    }

    public PhieuNhapChiTiet(int id, int stockReceivedDocketID, int supplyID, int quantity, int supplyAmount, int totalAmount, String description, int locationID) {
        this.id = id;
        this.stockReceivedDocketID = stockReceivedDocketID;
        this.supplyID = supplyID;
        this.quantity = quantity;
        this.supplyAmount = supplyAmount;
        this.totalAmount = totalAmount;
        this.description = description;
        this.locationID = locationID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockReceivedDocketID() {
        return stockReceivedDocketID;
    }

    public void setStockReceivedDocketID(int stockReceivedDocketID) {
        this.stockReceivedDocketID = stockReceivedDocketID;
    }

    public int getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(int supplyID) {
        this.supplyID = supplyID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSupplyAmount() {
        return supplyAmount;
    }

    public void setSupplyAmount(int supplyAmount) {
        this.supplyAmount = supplyAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    @Override
    public String toString() {
        return "PhieuNhapChiTiet{" + "id=" + id + ", stockReceivedDocketID=" + stockReceivedDocketID + ", supplyID=" + supplyID + ", quantity=" + quantity + ", supplyAmount=" + supplyAmount + ", totalAmount=" + totalAmount + ", description=" + description + ", locationID=" + locationID + '}';
    }
    
}
