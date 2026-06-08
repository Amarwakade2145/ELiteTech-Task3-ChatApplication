import java.io.*;
import java.net.*;

public class ChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6000);

            System.out.println("================================");
            System.out.println("SERVER STARTED");
            System.out.println("Waiting for client...");
            System.out.println("================================");

            Socket socket = serverSocket.accept();

            System.out.println("Client Connected!");

            BufferedReader input =
                    new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = input.readLine();

            System.out.println("Client Says: " + message);

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
