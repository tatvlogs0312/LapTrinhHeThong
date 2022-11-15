/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author Tran Anh Tuan
 */
public class Timer2 extends Thread{

    @Override
    public void run() {
        try {
            while(De1.a != 0) {           
                int dem = 0;
                for(int i = 1 ; i <= De1.a; i++){
                    if(De1.a % i == 0){
                        dem++;
                    }
                }
                if(dem == 2){
                    System.out.println(De1.a + " là số nguyên tố");
                } else {
                    System.out.println(De1.a + " không phải số nguyên tố");
                }
                
                dem = 0;
                
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
}
