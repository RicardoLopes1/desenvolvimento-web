import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String args[]) {
        try {

            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            while (true) {
                System.out.println("Server is running...");
                Socket clientSocket = listenSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                Connection c = new Connection(clientSocket);
                //listenSocket.close();
            }

        } catch (IOException e) {
            System.out.println("Listen :" + e.getMessage());
        }
    }
}