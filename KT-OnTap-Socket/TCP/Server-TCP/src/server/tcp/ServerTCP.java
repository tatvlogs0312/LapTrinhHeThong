/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class ServerTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            ServerSocket sk = new ServerSocket(8080);
            System.out.println("Chờ kết nối từ client!");
            Socket s = sk.accept();
            System.out.println("Kết nối thành công");

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

            Scanner sc = new Scanner(System.in);

            while (true) {
                String receive = in.readLine();
                System.out.println("Client : " + receive);
                int result = (int) Double.parseDouble(receive);
                if (result == 0) {
                    break;
                }
                
                String msg = "";
                switch (result) {
                    case 1:
                        msg = "one";
                        break;
                    case 2:
                        msg = "two";
                        break;
                    case 3:
                        msg = "three";
                        break;
                    case 4:
                        msg = "four";
                        break;
                    case 5:
                        msg = "five";
                        break;
                    case 6:
                        msg = "six";
                        break;
                    case 7:
                        msg = "seven";
                        break;
                    case 8:
                        msg = "eight";
                        break;
                    case 9:
                        msg = "nine";
                        break;
                    default:
                        msg = "Giá trị không hợp lệ";
                }
                out.println(msg);
                out.flush();
            }

            sk.close();
            in.close();
            out.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

}
