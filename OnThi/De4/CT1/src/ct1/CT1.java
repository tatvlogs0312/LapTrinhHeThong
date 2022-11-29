/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ct1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class CT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket s = new Socket("localhost", 2014);
            System.out.println("Kết nối thành công");
            Scanner sc = new Scanner(System.in);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
            int n;
            while (true) {
                String msg = "";
                System.out.print("Nhập n : ");
                n = sc.nextInt();
                if (n <= 0) {
                    out.println(n);
                    out.flush();
                    break;
                }
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập giá trị : ");
                    arr[i] = sc.nextInt();
                    msg += arr[i] + " ";
                }
                out.println(msg);
                out.flush();
            }
            s.close();
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
