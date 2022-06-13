import Utils.IO;
import Utils.SignFactory;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ChatThread implements Runnable{
    private Socket socket;
    private IO io;
    private String ip;

    public ChatThread(Socket s){
        this.socket = s;
        this.io = new IO(s);
        this.ip = socket.getInetAddress().getHostAddress();
    }

    public void out(String msg){
        io.printStream.println(msg);
    }

    public String in(){
        String content = null;
        try{
            content = io.bufferedReader.readLine();
        } catch (IOException e){
            System.out.println("IP为:" + ip + "的用户断开连接");
        }
        return content;
    }

    @Override
    public void run(){
        System.out.println("IP为:" + ip + "的用户连接成功");
        String content = null;
        SignFactory signFactory = new SignFactory();
        while((content = in()) != null){
            StringTokenizer parse = new StringTokenizer(content, "#");
            String sign = parse.nextToken();
            String data = parse.nextToken();
            signFactory.getOp(sign, data, io).op();
        }
    }
}
