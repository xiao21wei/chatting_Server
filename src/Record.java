import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {
    private int record_id;               //聊天记录编号，主键，自增
    private String  user;                //信息发送者的名称（昵称）
    private String time;                 //消息发送的时间，格式：MM-dd HH:mm
    private String details;              // 聊天消息内容

    public Record(String user, String details) {
        this.user = user;
        this.details = details;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd HH:mm");
        this.time = formatter.format(date);
    }

    public Record(){}

    public int getRecord_id() {
        return record_id;
    }
    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}
