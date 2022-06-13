package Utils;

import java.sql.*;

public class DataBase {
    private static DataBase dataBase = new DataBase();
    public Connection connection = null;
    public PreparedStatement preparedStatement = null;

    private DataBase(){}

    public static DataBase getDataBase(){
        return dataBase;
    }

    public void connection(){
        try{
            //String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://101.42.160.94:3306/oo_lab";
            //Class.forName(driver);
            String username = "root";
            String password = "159357258";
            connection = DriverManager.getConnection(url,username,password);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet execResult(String sql, String... data) {
        try{
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 1; i < data.length + 1; i++){
                preparedStatement.setString(i, data[i-1]);
            }
            return preparedStatement.executeQuery();
        } catch (SQLException e){
            return null;
        }

    }

    public void exec(String sql, String... data) {
        try{
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 1; i < data.length + 1; i++){
                preparedStatement.setString(i, data[i-1]);
            }
            preparedStatement.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void exec(String sql) {
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void updateImage(String sql, String account, byte[] data) {
        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(2, account);
            preparedStatement.setBytes(1,data);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void updateInt(String sql, String account, int... data) {
        try{
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 1; i < data.length + 1; i++){
                preparedStatement.setInt(i, data[i-1]);
            }
            preparedStatement.setString(data.length + 1, account);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
