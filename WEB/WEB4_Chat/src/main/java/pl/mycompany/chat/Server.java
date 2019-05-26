package pl.mycompany.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Server {

    ArrayList clientArrayList;
    PrintWriter printWriter;

    // start method
    public static void main(String[] args) {

        Server server = new Server();
        server.startServer();
    }

    // server start running
    public void startServer() {
        clientArrayList = new ArrayList();

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Listening actual IP and port: " + serverSocket);
                printWriter = new PrintWriter(socket.getOutputStream());
                clientArrayList.add(printWriter);

                Thread threadWatek = new Thread(new ServerClient(socket));
                threadWatek.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ServerClient implements Runnable {

        Socket socket;
        BufferedReader bufferedReader;

        ServerClient(Socket socketClient) {

            try {
                System.out.println("Connected.");
                this.socket = socketClient;
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            String str;
            PrintWriter pw = null;

            try {

                while ((str = bufferedReader.readLine()) != null) {
                    System.out.println("Received. >> ");

                    Iterator iterator = clientArrayList.iterator();

                    while (iterator.hasNext()) {
                        pw = (PrintWriter) iterator.next();
                        pw.println(str);
                        pw.flush();
                    }
                }
            } catch (Exception e) {}
        }
    }
}
