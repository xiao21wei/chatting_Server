import java.util.LinkedList;

public class User {
    private int user_id;                      //用户编号，主键
    private String mail;                         //邮箱，用于发送验证码验证身份
    private String username;                     //用户名，要求只能包含字母数字和下划线(_)，长度4~16，不允许重复
    private String nickname;                     //昵称，长度6~10
    private String password;                     //密码，要求必须同时包含大写字母、小写字母、数字，长度8~20
    private String sex;                          //性别，male,female,unknown
    private String age;                          //年龄，默认为null
    private String type1;                        //标签1，默认为null
    private String type2;                        //标签2，默认为null
    private String type3;                        //标签3，默认为null
    private int pri;                         //用户的权限位，0表示被管理员禁言，1表示普通用户，2表示管理员
    private LinkedList<Friend> friends;         //好友列表
    private LinkedList<Room> rooms;           //聊天室列表
    private LinkedList<Session> sessions;        //会话窗口列表

    public User(String mail, String username, String nickname, String password) {
        this.mail = mail;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.sex = "unknown";
        this.age = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.pri = 1;
        this.friends = new LinkedList<>();
        this.rooms = new LinkedList<>();
        this.sessions = new LinkedList<>();
    }

    public User(){}

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getType1() {
        return type1;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }
    public void setType3(String type3) {
        this.type3 = type3;
    }

    public int getPri() {
        return pri;
    }
    public void setPri(int pri) {
        this.pri = pri;
    }

    public LinkedList<Friend> getFriends() {
        return friends;
    }
    public void setFriends(LinkedList<Friend> friends) {
        this.friends = friends;
    }

    public LinkedList<Room> getRooms() {
        return rooms;
    }
    public void setRooms(LinkedList<Room> rooms) {
        this.rooms = rooms;
    }

    public LinkedList<Session> getSessions() {
        return sessions;
    }
    public void setSessions(LinkedList<Session> sessions) {
        this.sessions = sessions;
    }
}
