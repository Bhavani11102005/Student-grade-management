package studentgrade;

import java.sql.*;

public class StudentDAO {
    public void addStudent(Student s) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO students (student_id, name, course) VALUES (?, ?, ?)")) {
            stmt.setInt(1, s.getId());
            stmt.setString(2, s.getName());
            stmt.setString(3, s.getCourse());
            stmt.executeUpdate();
            System.out.println("✅ Student added.");
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}