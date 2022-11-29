/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ct1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author Tran Anh Tuan
 */
public class Client {
    private Socket socket;
    public static long a = 0;

    public Client(Socket socket) {
        this.socket = socket;
    }
    
    public void Gui(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            do {                
                Random rd = new Random();
                a = rd.nextLong();
                out.println(a);
                out.flush();
            } while (!(a > 20000 && a%1024 == 0));
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
    
}
