package basic_jdbc_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBOperations {
    public void fetchData() {
        try (Connection conn = DBConfig.getConnection();
                PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM students");
                ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Database query error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new DBOperations().fetchData();
    }
}
