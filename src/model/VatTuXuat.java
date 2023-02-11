/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class VatTuXuat {
    private int id;
    private int supplierId;
    private String suppliesName;
    private String Supplier;
    private int quantity;
    private int suppliesAmount;

    public int getSuppliesAmount() {
        return suppliesAmount;
    }

    public void setSuppliesAmount(int suppliesAmount) {
        this.suppliesAmount = suppliesAmount;
    }

    public VatTuXuat() {
    }

    public VatTuXuat(int id, String suppliesName, String Supplier, int quantity, int supplierId,  int suppliesAmount) {
        this.id = id;
        this.suppliesName = suppliesName;
        this.Supplier = Supplier;
        this.quantity = quantity;
        this.supplierId = supplierId;
        this.suppliesAmount = suppliesAmount;
        
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuppliesName() {
        return suppliesName;
    }

    public void setSuppliesName(String suppliesName) {
        this.suppliesName = suppliesName;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
