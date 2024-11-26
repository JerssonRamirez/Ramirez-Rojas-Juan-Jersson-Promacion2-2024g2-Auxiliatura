package tcp;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    private Socket socket;

    public Cliente(String ip, int port) {
        try {
            this.socket = new Socket(ip, port);
            System.out.println("Conectado al servidor.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enviarPersona() {
        try (ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in)) {
            String nickname;
            String ip;

            while (true) {
                System.out.print("Ingrese su nickname: ");
                nickname = scanner.nextLine();
                System.out.print("Ingrese su IP: ");
                ip = scanner.nextLine();

                Persona persona = new Persona(nickname, ip);
                out.writeObject(persona);
                System.out.println("Persona enviada: " + persona);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("127.0.0.1", 3000);
        cliente.enviarPersona();
    }
}