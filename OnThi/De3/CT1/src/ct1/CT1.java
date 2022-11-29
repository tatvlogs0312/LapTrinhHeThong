/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ct1;

import java.net.Socket;

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
            Socket s = new Socket("localhost",100);
            System.out.println("Kết nối thành công đến server");
            
            Client c = new Client(s);
            c.Gui();
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
    
}
