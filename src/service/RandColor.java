/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class RandColor {
    public int Color(){
        Random r = new Random();
        int low = 0;
        int high = 255;
        return r.nextInt(high-low) + low;
    }
    public static void main(String[] args) {
        System.out.println("number: "+new RandColor().Color());
    }
}
