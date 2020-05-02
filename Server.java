import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main(String[] args) throws Exception 
    {
        ServerSocket socket = new ServerSocket(8090);
        System.out.println("Server is now READY");
        Socket connectedClient = socket.accept();
        
        

        // Socket has inputStream (speaker) open the listening side

        DataInputStream input = new DataInputStream(connectedClient.getInputStream());

        // Receive message

       String message = input.readLine();

       System.out.println("Received from client:" + message);

        // Close connection 
        
        connectedClient.close();
        socket.close();

    }
}