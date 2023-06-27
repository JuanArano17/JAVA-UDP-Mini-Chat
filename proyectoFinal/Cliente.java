package proyectoFinal;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {

    private String host;
    private int puerto;
    private String mensaje;

    public Cliente(String host, int puerto, String mensaje) {
        this.host = host;
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] buf = mensaje.getBytes();
            InetAddress address = InetAddress.getByName(host);
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, puerto);
            socket.send(packet);
            socket.close();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
