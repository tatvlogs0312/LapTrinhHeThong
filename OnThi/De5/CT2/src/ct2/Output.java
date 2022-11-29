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
        String data = ""; 
        try {
            do {                
                File file = new File("D:\\DaiHocDienLuc\\ki_5\\LapTrinhHeThong\\LapTrinhHeThong\\OnThi\\file\\de5.txt");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()){
                    data = sc.nextLine();
                    System.out.println(data);
                }
                sc.close();
            } while(!data.equals("!"));
            
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
}
