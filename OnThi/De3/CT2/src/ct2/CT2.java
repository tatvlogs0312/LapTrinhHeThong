/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ct2;

import java.net.ServerSocket;
import java.net.Socket;

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
            ServerSocket sk = new ServerSocket(100);
            System.out.println("Cho ket noi");
            Socket s = sk.accept();
            System.out.println("Co 1 ket noi!");
            
            Server server = new Server(s);
            server.Nhan();
            
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
}
