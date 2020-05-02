
import java.net.Socket;
import java.io.DataOutputStream;
public class Client
{
    public static void main(String[] args) throws Exception
    {
        Socket client = new Socket("127.0.0.1", 8090);

        // SOcket is like a phone (speaker and mic)
        // It has input stream (speaker)
        // And o/p stream (mic)

        // Socket has o/p stream (mic) open speaking side.
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        // Send message

        String message = "Hello Socket";
        out.writeBytes(message);

        System.out.println("Sent to server " + message);

        // Close connection 
        client.close();

    }
}