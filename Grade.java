package studentgrade;
public class Grade {
    private int studentId;
    private String subject;
    private float grade;

    public Grade(int studentId, String subject, float grade) {
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
    }

    public int getStudentId() { return studentId; }
    public String getSubject() { return subject; }
    public float getGrade() { return grade; }
}