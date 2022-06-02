/*
用于测试已经完成的功能，方法之间的参数统一采用Map<String, String>的数据类型,返回值采用Map<String, Objects>的数据类型
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        UserController userController = new UserController();

        Scanner in = new Scanner(System.in);
        String argStr;
        while(in.hasNext()){
            Map<String, String> map = new HashMap<>();                        //map为传入方法进行相关操作的参数
            Map<String, Objects> re_map = new HashMap<>();                    //各方法的返回值，用于前端呈现
            argStr=in.nextLine();
            String[] buff = argStr.split("\\s+");
            if(buff[0].equals("login")){
                map.put("command", "login");
                map.put("username", buff[1]);
                map.put("password", buff[2]);
                re_map = userController.login(map);
            }
        }
    }
}
