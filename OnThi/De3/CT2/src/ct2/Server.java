/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ct2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Tran Anh Tuan
 */
public class Server {
    private Socket socket;
    public static long a;

    public Server(Socket s) {
        this.socket = s;
    }
    
    public void Nhan(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {                
                long temp = Long.parseLong(in.readLine());
                if(temp > 20000 && temp % 1024 == 0){
                    break;
                }
                a = Math.max(a, temp);
                System.out.println("msg : " + a);
            }
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}
