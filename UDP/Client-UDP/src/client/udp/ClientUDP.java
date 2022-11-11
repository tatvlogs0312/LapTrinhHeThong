/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author Tran Anh Tuan
 */
public class ClientUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            byte[] in = new byte[1024];
            byte[] out = new byte[1024];
            
            DatagramSocket sk = new DatagramSocket(8081);
            InetAddress ipClient = InetAddress.getByName("localhost");
            int port = 8080;
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập chuỗi : ");
            String msg = sc.nextLine();
            
            out = msg.getBytes();
            DatagramPacket send = new DatagramPacket(out,out.length,ipClient,port);
            sk.send(send);
            
            DatagramPacket receive = new DatagramPacket(in, in.length);
            sk.receive(receive);
            
            String result = new String(receive.getData());
            System.out.println("Server : " + result);
            
            sk.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
}
