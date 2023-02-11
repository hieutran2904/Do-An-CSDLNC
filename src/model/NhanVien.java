/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int id;
    private String lastName; //ho
    private String firstName; //ten
    private String dateOfBirth;
    private int genderID;
    private String phone;
    private String userNameAccount;
    private String userPasswordAccount;

    public NhanVien() {
    }

    public NhanVien(int id ,String lastName, String firstName, String dateOfBirth, int genderID, String phone, String userNameAccount, String userPasswordAccount) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.genderID = genderID;
        this.phone = phone;
        this.userNameAccount = userNameAccount;
        this.userPasswordAccount = userPasswordAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGenderID() {
        return genderID;
    }

    public void setGenderID(int genderID) {
        this.genderID = genderID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserNameAccount() {
        return userNameAccount;
    }

    public void setUserNameAccount(String userNameAccount) {
        this.userNameAccount = userNameAccount;
    }

    public String getUserPasswordAccount() {
        return userPasswordAccount;
    }

    public void setUserPasswordAccount(String userPasswordAccount) {
        this.userPasswordAccount = userPasswordAccount;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", dateOfBirth=" + dateOfBirth + ", genderID=" + genderID + ", phone=" + phone + ", userNameAccount=" + userNameAccount + ", userPasswordAccount=" + userPasswordAccount + '}';
    }
}
