package servlets.http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;


//Пример создания клиента

public class SocketRunner {
    public static void main(String[] args) throws IOException {
        // var inetAddress = Inet4Address.getByName("google.com");
        var inetAddress = Inet4Address.getByName("localhost");
        try (var socket = new Socket(inetAddress, 7777);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream());
             var scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                var request = scanner.nextLine();
                outputStream.writeUTF(request);
                System.out.println("Response from server: " + inputStream.readUTF());
            }
        }
    }
}
