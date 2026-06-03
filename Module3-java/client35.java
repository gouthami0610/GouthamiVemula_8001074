
import java.io.*;
import java.net.*;
public record client35() {
   

//public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket =
                new Socket("localhost", 5000);

        BufferedReader in =
            new BufferedReader(
            new InputStreamReader(socket.getInputStream()));

        PrintWriter out =
            new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello Server");

        System.out.println(in.readLine());

        socket.close();
    }
}

