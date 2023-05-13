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


            }
        } catch (IOException ex) {
            System.out.println("Error in the server" + ex.getMessage());
            ex.printStackTrace();
        }


    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Syntax: java ChatServer <port-number>");
            System.exit(0);
        }
        int port = Integer.parseInt(args[0]);
        ChatServer server = new ChatServer(port);
        server.execute();
    }

    public void chatBroadcast(String message, User)

}
