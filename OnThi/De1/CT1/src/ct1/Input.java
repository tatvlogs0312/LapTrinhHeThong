/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ct1;

import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Tran Anh Tuan
 */
public class Input extends Thread{

    @Override
    public void run() {
        try {
            do {                
                Random rd = new Random();
                CT1.n = rd.nextInt(0,Integer.MAX_VALUE);
                System.out.println(CT1.n);
                PrintWriter in = new PrintWriter("D:\\DaiHocDienLuc\\ki_5\\LapTrinhHeThong\\LapTrinhHeThong\\OnThi\\file\\de1.txt");
                in.write(Integer.toString(CT1.n));
                in.close();
                if(CT1.n % 1024 == 0){
                    break;
                }
                Thread.sleep(1000);
            } while (true);
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
    
}
