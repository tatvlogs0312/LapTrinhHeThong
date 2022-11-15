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
public class Timer1 extends Thread {

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Nhập số : ");
                De1.a = sc.nextInt();
                Thread.sleep(5);
            } while (De1.a != 0);
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }

}
