package tcp_client_server_chat_system;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is listening...");
            Socket clientSocket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());

            String receivedMessage;
            while ((receivedMessage = reader.readLine()) != null) {
                System.out.println("Client: " + receivedMessage);
                writer.write("Message received: " + receivedMessage + "\n");
                writer.flush();
            }
        } catch (Exception e) {
            System.out.println("Error in server: " + e.getMessage());
        }
    }
}
