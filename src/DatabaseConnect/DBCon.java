package DatabaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
    public static Connection getConnect(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/lcms";
        String username = "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
