package transaction_handling_in_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "root";
        String password = "Muthumani#2004";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn
                    .prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                    PreparedStatement creditStmt = conn
                            .prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debitStmt.setDouble(1, 100);
                debitStmt.setInt(2, 1);
                debitStmt.executeUpdate();

                creditStmt.setDouble(1, 100);
                creditStmt.setInt(2, 2);
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transaction completed successfully.");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolling back.");
            }
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
