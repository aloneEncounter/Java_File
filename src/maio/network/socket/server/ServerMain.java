package maio.network.socket.server;


import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain
{
    public static void main(String[] args) throws Exception
    {

        ServerSocket server = new ServerSocket(9999);

        while(true)
        {
            Socket socket = server.accept();

            InputStreamThread ist = new InputStreamThread(socket);

            OutputStreamThread ost = new OutputStreamThread(socket);

            ist.start();

            ost.start();

        }

    }
}
