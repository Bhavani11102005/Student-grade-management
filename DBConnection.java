package studentgrade;
import java.sql.*;
public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/grade_system",
                "root", 
                "2005" 
            );
            System.out.println("✅ Connected to MySQL database!");
        } catch (Exception e) {
            System.out.println("❌ Failed to connect: " + e.getMessage());
        }
        return conn;
    }
}