package studentgrade;

import java.util.List;

public class GradeService {
    GradeDAO dao = new GradeDAO();

    public void showSummary(int studentId) {
        List<Grade> grades = dao.getGradesByStudentId(studentId);
        if (grades.isEmpty()) {
            System.out.println("⚠️ No grades found.");
            return;
        }

        float total = 0, max = Float.MIN_VALUE, min = Float.MAX_VALUE;
        for (Grade g : grades) {
            float gr = g.getGrade();
            total += gr;
            max = Math.max(max, gr);
            min = Math.min(min, gr);
        }

        System.out.println("📊 Total Subjects: " + grades.size());
        System.out.println("📈 Average: " + (total / grades.size()));
        System.out.println("🔼 Highest: " + max);
        System.out.println("🔽 Lowest: " + min);
    }
}
