package SQL_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexao {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "estudo";
    private static String usuario = "root";
    private static String senha = "211007";

    public static Connection obConnection   (){
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario,senha);
            System.out.println("foi");
            return c;
        } catch(SQLException e) {
            System.out.println("num foi");
            return null;
        }
    }
}
