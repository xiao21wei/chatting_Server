/*
由于暂时未连接数据库，DataBase类暂时用于存储数据，用于相关方法的测试
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class DataBase {
    public static LinkedList<User> UserOnline;                 //当前在线的用户列表
    public static ArrayList<Room> AllRoom;                     //当前已开放的聊天室
    public static ArrayList<User> AllUser;                     //当前已注册的全部用户
    public static LinkedList<Code> CodeList;                   //当前有效的验证码列表
}
