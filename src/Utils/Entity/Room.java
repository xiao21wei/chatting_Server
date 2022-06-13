package Utils.Entity;

import java.util.LinkedList;

public class Room {
    private String room_name;                 //聊天室名称，不能重复
    private LinkedList<String> users;         //聊天室用户列表,用户名
    private LinkedList<room_message> records;       //聊天记录列表

    public Room(String room_name) {
        this.room_name = room_name;
        this.users = new LinkedList<>();
        this.records = new LinkedList<>();
    }

    public Room(){}

    public String getRoom_name() {
        return room_name;
    }
    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public LinkedList<String> getUsers() {
        return users;
    }
    public void setUsers(LinkedList<String> users) {
        this.users = users;
    }

    public LinkedList<room_message> getRecords() {
        return records;
    }
    public void setRecords(LinkedList<room_message> records) {
        this.records = records;
    }
}
