import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class exe35 {
   // public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket =  new ServerSocket(5000);

        Socket socket = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String msg = in.readLine();
           System.out.println("Client: " + msg);

        out.println("Hello Client");

        socket.close();
        serverSocket.close();
    }
}
