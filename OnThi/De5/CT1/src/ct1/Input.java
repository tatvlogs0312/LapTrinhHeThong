/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ct1;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class Input extends Thread {

    @Override
    public void run() {
        try {
            String s = "";
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhap ky tu : ");
                s = sc.nextLine();
                FileWriter file = new FileWriter("D:\\DaiHocDienLuc\\ki_5\\LapTrinhHeThong\\LapTrinhHeThong\\OnThi\\file\\de5.txt");
                file.write(s);
                file.close();
            } while (!s.equals("!"));
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
