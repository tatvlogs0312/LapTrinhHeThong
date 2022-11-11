/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class ClientTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket s = new Socket("localhost",8080);
            System.out.println("Kết nối thành công");
            
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            
            Scanner sc = new Scanner(System.in);
            
            while (true) {           
                System.out.println("Nhập số : ");
                double a = sc.nextDouble();
                out.println(a);
                out.flush();
                if(a == 0){
                    break;
                }
                String result = in.readLine();
                System.out.println("Server : " + result);
            }
            s.close();
            in.close();
            out.close();
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
}
