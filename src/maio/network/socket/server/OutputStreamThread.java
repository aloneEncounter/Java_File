package maio.network.socket.server;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class OutputStreamThread extends Thread
{
    private Socket socket;

    public OutputStreamThread(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try (OutputStream os = socket.getOutputStream();
                Scanner scanner = new Scanner(System.in);)
        {
            String cont = null;

            while ((cont = scanner.next()) != null)
            {

                if (cont != null && cont.equals("no"))
                {
                    break;
                }

               os.write(cont.getBytes(), 0, cont.length());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
