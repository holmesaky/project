package networking;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import java.net.URL;

 class Download {

    public static void main(String[] args) {

        try {
            
            Socket s=new Socket("localhost",1213);
            
            String fileName = "new-image.jpg";
            String website = "http://cdn.playbuzz.com/cdn/925704be-9b8e-4dfc-852e-f24d720cb9c5/bcf39e88-5731-43bb-9d4b-e5b3b2b1fdf2.jpg";

            System.out.println("Downloading File From: " + website);

            URL url = new URL(website);
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream("C:\\Users\\murad\\Documents\\NetBeansProjects\\networking\\Client\\"+fileName);
            OutputStream serverout=s.getOutputStream();
            byte[] buffer = new byte[2048];

            int length = 0;
int i=0;
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(i++ + " Buffer Read of length: " + length);
                outputStream.write(buffer, 0, length);
                serverout.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();
            serverout.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
