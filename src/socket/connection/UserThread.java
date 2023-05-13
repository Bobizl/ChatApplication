package socket.connection;

import java.io.PrintWriter;
import java.net.Socket;

public class UserThread extends Thread {
    private Socket socket;
    private ChatServer server;
    private PrintWriter writer;
    public UserThread(Socket socket, ChatServer server){
        this.socket = socket;
        this.server = server;
    }

    public void run(){

    }


}
