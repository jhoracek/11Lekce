import java.io.IOException;
import java.net.*;

public class EchoClient {


    private byte[] buf;
//    private EchoClient socket;

    public void sendEcho(String msg) {
        buf = msg.getBytes();
        DatagramPacket packet
                = null;
        try {
            packet = new DatagramPacket(buf, buf.length, InetAddress.getByAddress(new byte[]{10, 0, 104,
                    (byte) 136}), 10000);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}