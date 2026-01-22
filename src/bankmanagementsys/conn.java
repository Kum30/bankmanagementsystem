package bank.management.system;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            // Driver load (important for MySQL 8)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ✅ PERFECT JDBC URL
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankmanagementsystem?useSSL=false&serverTimezone=UTC",
                "root",
                "kumkumsharma"
            );

            s = c.createStatement();
            System.out.println("Database connected successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}