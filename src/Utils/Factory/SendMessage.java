package Utils.Factory;

import Utils.ChatManager;
import Utils.IO;
import Utils.SignOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class SendMessage implements SignOperation {
    private String data;
    private IO io;

    @Override
    public void op(){
        StringTokenizer parse = new StringTokenizer(data, " ");
        String sign = parse.nextToken();
        String type = parse.nextToken();
        String name = parse.nextToken();
        String accountFrom = parse.nextToken();
        String accountTo = parse.nextToken();
        StringBuilder temp = new StringBuilder(parse.nextToken());
        while(parse.hasMoreTokens()){
            temp.append(" ");
            temp.append(parse.nextToken());
        }
        String message = temp.toString();
        ChatManager.getChatManager().sendMessage(accountTo,message);
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void setIO(IO io) {
        this.io = io;
    }
}
