package maio.network.socket.client;

import maio.network.socket.server.InputStreamThread;
import maio.network.socket.server.OutputStreamThread;

import java.net.Socket;

public class ClientMain
{
    public static void main(String[] args) throws Exception
    {

        Socket client = new Socket("127.0.0.1", 9999);

        maio.network.socket.server.InputStreamThread ist = new InputStreamThread(client);

        maio.network.socket.server.OutputStreamThread ost = new OutputStreamThread(client);

        ist.start();

        ost.start();

    }
}
