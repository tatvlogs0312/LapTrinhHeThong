/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

/**
 *
 * @author Tran Anh Tuan
 */
public class Timer2 extends Thread{

    @Override
    public void run() {
        try {
            while (!De2.a.equals("thoat")) {        
                String result = "";
                for(int i = 0 ; i < De2.a.length() ; i++){
                    result = De2.a.charAt(i) + result;
                }
                System.out.println("Chuỗi đảo ngược : " + result);
                result = "";
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
}
