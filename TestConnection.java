package studentgrade;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("✅ JDBC is working! Connected to MySQL.");
        } else {
            System.out.println("❌ JDBC connection failed.");
        }
    }
}
