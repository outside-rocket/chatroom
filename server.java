import java.net.io.*;
import java.io.*;
import java.util.ArrayList;

public class server{

  static ArrayList<ClientHandler> clients = new ArrayLIst<>();
  public static void main(String[] args) throw Exception{

    ServerSocket serversocket = new ServerSocket(5000);
    System.out.println("Server started! ");
    while(true){

      Socket socket = serverSocket.accept();
      System.out.println("new client cpnnected! ");
      ClientHandler clienthandler = new ClientHandler(socket)
      
    }
    
  }
  
}