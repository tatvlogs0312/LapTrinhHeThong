/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Tran Anh Tuan
 */
public class ServerUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            byte[] in = new byte[1024];
            byte[] out = new byte[1024];
            
            DatagramSocket sk = new DatagramSocket(8080);
                      
            DatagramPacket receive = new DatagramPacket(in, in.length);
            sk.receive(receive);
            
            String msg = new String(receive.getData()).trim();
            System.out.println("Client" + msg);
            String send = "";
            for (int i = 0; i < msg.length(); i++) {
                send = msg.charAt(i) + send;
            }
            
            out = String.valueOf(send).getBytes();
            InetAddress ipClient = receive.getAddress();
            int port = receive.getPort();
            DatagramPacket sendClient = new DatagramPacket(out,out.length,ipClient,port);
            sk.send(sendClient);
            
            sk.close();
            
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
}
