import java.util.LinkedList;

public class Friend {
    private int friend_id;                            //好友的用户ID
    private String friend_name;                       //备注名，默认为昵称
    private int port;                                 //端口号
    private LinkedList<Record> records;               //聊天记录列表

    public Friend(){}

    public Friend(String friend_name, int port) {
        this.friend_name = friend_name;
        this.port = port;
        this.records = new LinkedList<>();
    }

    public int getFriend_id() {
        return friend_id;
    }
    public void setFriend_id(int friend_id) {
        this.friend_id = friend_id;
    }

    public String getFriend_name() {
        return friend_name;
    }
    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    public LinkedList<Record> getRecords() {
        return records;
    }
    public void setRecords(LinkedList<Record> records) {
        this.records = records;
    }
}
