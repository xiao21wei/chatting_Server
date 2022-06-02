public class Session {
    private String type;                        //会话窗口类型，room/friend
    private int session_id;                     //会话窗口id，等于聊天室id或者好友id
    private Record lastRecord;                  //最近的一条消息

    public Session(){}

    public Session(String type, int session_id, Record lastRecord) {
        this.type = type;
        this.session_id = session_id;
        this.lastRecord = lastRecord;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getSession_id() {
        return session_id;
    }
    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public Record getLastRecord() {
        return lastRecord;
    }
    public void setLastRecord(Record lastRecord) {
        this.lastRecord = lastRecord;
    }
}
