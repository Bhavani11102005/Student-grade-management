package studentgrade;

import java.sql.*;
import java.util.*;

public class GradeDAO {
    public void addGrade(Grade g) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO grades (student_id, subject, grade) VALUES (?, ?, ?)")) {
            stmt.setInt(1, g.getStudentId());
            stmt.setString(2, g.getSubject());
            stmt.setFloat(3, g.getGrade());
            stmt.executeUpdate();
            System.out.println("✅ Grade added.");
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public List<Grade> getGradesByStudentId(int studentId) {
        List<Grade> grades = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM grades WHERE student_id = ?")) {
            stmt.setInt(1, studentId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                grades.add(new Grade(
                        rs.getInt("student_id"),
                        rs.getString("subject"),
                        rs.getFloat("grade")));
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        return grades;
    }
}
