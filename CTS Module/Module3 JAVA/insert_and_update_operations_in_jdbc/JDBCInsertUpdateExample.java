package insert_and_update_operations_in_jdbc;

public class JDBCInsertUpdateExample {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();
            dao.insertStudent(1, "Alice");
            dao.updateStudent(1, "Alice Johnson");
            System.out.println("Database operations successful.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
