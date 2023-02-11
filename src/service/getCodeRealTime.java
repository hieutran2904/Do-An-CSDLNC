/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class getCodeRealTime {
//    public String getAlphaNumbericString(String name){
//        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//         + "0123456789"
//         + "abcdefghijklmnopqrstuvxyz";
//        StringBuilder sb = new StringBuilder(n);
// 
//        for (int i = 0; i < n; i++) {
//        int index = (int)(AlphaNumericString.length() * Math.random());
//        sb.append(AlphaNumericString
//           .charAt(index));
//        }
//       return name + sb.toString();
//    }
    
//    public static void main(String[] args) {
//        System.out.println("code 1: " +new getCodeRealTime().getAlphaNumbericString("PN",10));
//        System.out.println("code 1: " +new getCodeRealTime().getAlphaNumbericString("PN",10));
//    }
    
    public String DateTime(String type){
        return type+new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }
    public static void main(String[] args) {
        System.out.println("code: "+ new getCodeRealTime().DateTime("PN"));
    }
}
