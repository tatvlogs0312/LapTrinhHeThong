/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ct2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class CT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ServerSocket sk = new ServerSocket(2014);
            System.out.println("Chờ kết nối!");
            Socket s = sk.accept();
            System.out.println("Có một kết nối");
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
            while (true) {                
                String msg = in.readLine();
                if(msg.equals("0")){
                    break;
                }
                System.out.println("Client : " + msg);
            }
            s.close();
            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
}
