package Utils.Entity;

import java.util.LinkedList;

public class User {
    private int user_id;                      //用户编号，主键
    private String mail;                         //邮箱，用于发送验证码验证身份
    private String username;                     //用户名，要求只能包含字母数字和下划线(_)，长度4~16，不允许重复
    private String nickname;                     //昵称，长度6~20
    private String password;                     //密码，要求必须同时包含大写字母、小写字母、数字，长度8~20
    private String sex;                          //性别，male,female,unknown
    private int age;                          //年龄，默认为null
    private LinkedList<String> friends;         //好友列表
    private LinkedList<String> rooms;           //聊天室列表

    public User(String mail, String username, String nickname, String password) {
        this.mail = mail;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.sex = "unknown";
        this.friends = new LinkedList<>();
        this.rooms = new LinkedList<>();
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public LinkedList<String> getFriends() {
        return friends;
    }
    public void setFriends(LinkedList<String> friends) {
        this.friends = friends;
    }

    public LinkedList<String> getRooms() {
        return rooms;
    }
    public void setRooms(LinkedList<String> rooms) {
        this.rooms = rooms;
    }
}
