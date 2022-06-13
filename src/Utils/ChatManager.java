package Utils;

import java.util.HashMap;
import java.util.Map;

public class ChatManager {
    private static ChatManager chatManager = new ChatManager();

    Map<String, IO> user_map = new HashMap<>(); // 账号映射其对应的IO

    public void addUserToMap(String account, IO io){
        user_map.put(account, io);
    }

    public void removeUserFromMap(String account){
        System.out.println(account + "已离线");
        user_map.remove(account);
    }

    public ChatManager(){}

    public static ChatManager getChatManager(){
        return chatManager;
    }

    public void sendMessage(String to, String message){
        for (Map.Entry<String, IO> entry : user_map.entrySet()){
            IO io = entry.getValue();
            if (entry.getKey().equals(to)){
                io.printStream.println(message);
            }
        }
    }
}
