package insert_and_update_operations_in_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {
    private Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "password");
    }

    public void insertStudent(int id, String name) throws Exception {
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)")) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.executeUpdate();
        }
    }

    public void updateStudent(int id, String newName) throws Exception {
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
            stmt.setString(1, newName);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }
}
