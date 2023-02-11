/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class VatTu {
    private int id;
    private String suppliesName;
    private int suppliesType; //id loai vat tu
    private int suppliesUnit; //id don vi vat tu
    private int suppliesAmount; // price default

    public VatTu() {
    }

    public VatTu(int id, String suppliesName, int suppliesType, int suppliesUnit, int suppliesAmount) {
        this.id = id;
        this.suppliesName = suppliesName;
        this.suppliesType = suppliesType;
        this.suppliesUnit = suppliesUnit;
        this.suppliesAmount = suppliesAmount;
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

    public int getSuppliesType() {
        return suppliesType;
    }

    public void setSuppliesType(int suppliesType) {
        this.suppliesType = suppliesType;
    }

    public int getSuppliesUnit() {
        return suppliesUnit;
    }

    public void setSuppliesUnit(int suppliesUnit) {
        this.suppliesUnit = suppliesUnit;
    }

    public int getSuppliesAmount() {
        return suppliesAmount;
    }

    public void setSuppliesAmount(int suppliesAmount) {
        this.suppliesAmount = suppliesAmount;
    }
    
}
