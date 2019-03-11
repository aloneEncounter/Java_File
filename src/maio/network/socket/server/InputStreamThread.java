package maio.network.socket.server;

import java.io.InputStream;
import java.net.Socket;

public class InputStreamThread extends Thread
{
    private Socket socket;

    public InputStreamThread(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try(InputStream is = socket.getInputStream();)
        {
            byte[] b = new byte[512];

            int len = 0;

            while((len = is.read(b)) != -1)
            {
                String cont = new String(b, 0, len);

                if(cont != null && cont.equals("no"))
                {
                    break;
                }

                System.out.println(cont);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}






