/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class Timer1 extends Thread{
    
    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            do {                
                System.out.print("Nhập chuỗi : ");
                De2.a = sc.nextLine();
                Thread.sleep(5);
            } while (!De2.a.equals("thoat"));
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
