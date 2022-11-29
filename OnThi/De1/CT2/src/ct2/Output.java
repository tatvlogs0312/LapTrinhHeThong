/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ct2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class Output extends Thread{

    @Override
    public void run() {
        try {
            do {                
                File file = new File("D:\\DaiHocDienLuc\\ki_5\\LapTrinhHeThong\\LapTrinhHeThong\\OnThi\\file\\de1.txt");
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {                    
                    String data = sc.nextLine();
                    CT2.n = Integer.parseInt(data);
                    if(CT2.n % 1024 != 0){
                        System.out.println(CT2.n);
                    }
                }
            } while (CT2.n % 1024 != 0);
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
    
}
