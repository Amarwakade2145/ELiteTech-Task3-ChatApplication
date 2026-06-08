import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 6000);

            PrintWriter output =
                    new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello Server!");

            System.out.println("Message Sent Successfully!");

            socket.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
