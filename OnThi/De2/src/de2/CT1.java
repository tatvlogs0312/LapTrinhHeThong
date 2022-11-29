/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class CT1 extends Thread{

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Nhập chuỗi : ");
                De2.a = sc.nextLine();           
            } while (!De2.a.trim().equals("exit"));
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
}
