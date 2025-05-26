package basic_jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "Muthumani#2004";

    public static Connection getConnection() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
        return null;
    }
}
