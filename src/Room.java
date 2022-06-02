import java.util.LinkedList;

public class Room {
    private int room_id;                      //聊天室编号，主键，自增
    private String room_name;                 //聊天室名称，不能重复
    private int port;                         //端口号
    private String admin;                     //管理员，只有一个
    private LinkedList<String> users;         //聊天室用户列表,用户名
    private LinkedList<Record> records;       //聊天记录列表

    public Room(String room_name, int port, String admin) {
        this.room_name = room_name;
        this.port = port;
        this.admin = admin;
        this.users = new LinkedList<>();
        this.users.add(admin);
        this.records = new LinkedList<>();
    }

    public Room(){}

    public int getRoom_id() {
        return room_id;
    }
    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_name() {
        return room_name;
    }
    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    public String getAdmin() {
        return admin;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public LinkedList<String> getUsers() {
        return users;
    }
    public void setUsers(LinkedList<String> users) {
        this.users = users;
    }

    public LinkedList<Record> getRecords() {
        return records;
    }
    public void setRecords(LinkedList<Record> records) {
        this.records = records;
    }
}
