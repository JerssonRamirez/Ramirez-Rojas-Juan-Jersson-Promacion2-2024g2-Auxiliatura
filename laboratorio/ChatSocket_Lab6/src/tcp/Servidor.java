package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public void iniciar() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor ejecutándose en el puerto " + port);
            while (true) {
                // Aceptar conexiones de clientes
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
                
                // Manejar el cliente en un nuevo hilo
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : 3000; // Cambia el puerto si es necesario
        Servidor server = new Servidor(port);
        server.iniciar();
    }

    // Clase interna para manejar la conexión con el cliente
    static class ClientHandler implements Runnable {
        private Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {
                 
                String inputLine;
                // Leer líneas del cliente
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Recibido del cliente: " + inputLine);
                    // Enviar una respuesta al cliente
                    out.println("Eco: " + inputLine);
                }
            } catch (IOException e) {
                System.err.println("Error manejando el cliente: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    System.err.println("Error cerrando el socket del cliente: " + e.getMessage());
                }
            }
        }
    }
}