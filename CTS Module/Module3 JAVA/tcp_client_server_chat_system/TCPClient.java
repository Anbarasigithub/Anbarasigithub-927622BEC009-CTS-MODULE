package tcp_client_server_chat_system;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
                OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to server. Type your message:");
            while (true) {
                String message = scanner.nextLine();
                writer.write(message + "\n");
                writer.flush();
                System.out.println("Server says: " + reader.readLine());
            }
        } catch (Exception e) {
            System.out.println("Error in client: " + e.getMessage());
        }
    }
}
