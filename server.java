import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server{
	ArrayList<ClientHandler> clients = new ArrayList();
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(5000);
		System.out.println(" server running ");
		while(true){
			Socket socket = serverSocket.accet();
			System.out.println("New client connected");
			ClientHandler clientHandler = new ClientHandler(socket);
			clients.add(clientHandler);
			Thread thread = new Thread(clientHandler);
			thread.start();

		}
	}
	public static void broadcast(String message, ClientHandler sender){
    for(ClientHandler client: clients){

      if(client != sender){
        client.sendMessage(message);
      }
      
    }
	}
  public static void removeClient(ClientHandler client){

    clients.remove(client);
    
  }
}
