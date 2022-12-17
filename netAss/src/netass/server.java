package netass;

import java.net.*;
import java.io.*;
import java.awt.image.*;

import javax.imageio.*;
import javax.swing.*;

class server {

    public static void main(String args[]) throws Exception {
        ServerSocket server = null;
        Socket socket;
        server = new ServerSocket(1213);
        String clos = "hi";
        InputStream in=null;
        DataOutputStream dout=null;
         OutputStream outputStream=null;

        do {
            try {
                System.out.println("Server Waiting for image");

                socket = server.accept();
                System.out.println("Client connected.");

                in = socket.getInputStream();
//                dout = new DataOutputStream(socket.getOutputStream());

               outputStream = new FileOutputStream("C:\\Users\\murad\\Documents\\NetBeansProjects\\networking\\Server\\" + "server.jpg");
                byte[] buffer = new byte[2048];
                int length = 0;
                int i = 0;
                while ((length = in.read(buffer)) != -1) {
                    System.out.println(i++ + " Buffer Read of length: " + length);
                    outputStream.write(buffer, 0, length);

                }

                outputStream.close();
          

            } catch (Exception e) {
                System.out.println("error  " + e);
            }
        } while (!clos.equalsIgnoreCase("close"));

     
    }

}
