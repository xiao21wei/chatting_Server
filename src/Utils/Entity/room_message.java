package Utils.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class room_message {
    private int id;                      //聊天记录编号，主键，自增
    private String room_name;            //聊天室名称
    private String  user_from;           //信息发送者的用户名
    private String send_time;            //消息发送的时间，格式：MM-dd HH:mm
    private String message;              //聊天消息内容

    public room_message(String user_from, String room_name, String message) {
        this.user_from = user_from;
        this.room_name = room_name;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd HH:mm");
        this.send_time = formatter.format(date);
        this.message = message;
    }

    public room_message(){}

    public String getRoom_name() {
        return room_name;
    }
    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getUser_from() {
        return user_from;
    }
    public void setUser_from(String user_from) {
        this.user_from = user_from;
    }

    public String getSend_time() {
        return send_time;
    }
    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
