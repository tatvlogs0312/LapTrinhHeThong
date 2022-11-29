/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author Tran Anh Tuan
 */
public class CT2 extends Thread{
    @Override
    public void run() {
        try {
            while (!De2.a.trim().equals("exit")) {                
                System.out.println("" + De2.a);
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}
