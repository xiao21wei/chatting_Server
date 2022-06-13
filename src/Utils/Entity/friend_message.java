package Utils.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class friend_message {
    private int id;                      //聊天记录编号，主键，自增
    private String user_to;              //信息接收方的用户名
    private String  user_from;           //信息发送者的用户名
    private String send_time;            //消息发送的时间，格式：MM-dd HH:mm
    private String message;              //聊天消息内容

    public friend_message(String user_from, String user_to, String message) {
        this.user_from = user_from;
        this.user_to = user_to;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd HH:mm");
        this.send_time = formatter.format(date);
        this.message = message;
    }

    public friend_message(){}

    public String getUser_to() {
        return user_to;
    }
    public void setUser_to(String user_to) {
        this.user_to = user_to;
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