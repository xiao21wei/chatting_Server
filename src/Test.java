/*
用于测试已经完成的功能，方法之间的参数统一采用Map<String, String>的数据类型,返回值采用Map<String, Objects>的数据类型
 */

import Utils.DataBase;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        DataBase.getDataBase().connection();
        String sql = "update room set room_name = ? where room_name= ?";
        DataBase.getDataBase().exec(sql,"aa","cc");
    }
}
