package socket.connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;


public class ChatServer {
    private int port;
    private Set<String> users = new HashSet<>();

    public ChatServer(int port) {
        this.port = port;
    }

    public void execute() {
        try (ServerSocket connection = new ServerSocket(port)) {
            System.out.println("The server is currently listening on port " + port);
            while (true) {
                Socket socket = ServerSocket.accept();
                /*Create a user*/


            }
        } catch (IOException ex) {
            System.out.println("Error in the server" + ex.getMessage());
            ex.printStackTrace();
        }


    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        ChatServer server = new ChatServer(port);
        server.execute();
    }

}
