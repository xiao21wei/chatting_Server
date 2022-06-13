import Utils.DataBase;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args){

        DataBase dataBase = DataBase.getDataBase();
        dataBase.connection();
        System.out.println("连接数据库成功！");

        try{
            ServerSocket serverSocket = new ServerSocket(8100);
            System.out.println("chatServer端已正常开启，并在8100端口监听中...");

            while(true){
                Socket s = serverSocket.accept();
                new Thread(new ChatThread(s)).start();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
