package studentgrade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			StudentDAO studentDAO = new StudentDAO();
			GradeDAO gradeDAO = new GradeDAO();
			GradeService service = new GradeService();

			while (true) {
			    System.out.println("\n--- Student Grade Management System ---");
			    System.out.println("1. Add Student");
			    System.out.println("2. Add Grade");
			    System.out.println("3. View Grade Summary");
			    System.out.println("4. Exit");
			    System.out.print("Enter option: ");
			    int choice = sc.nextInt();

			    switch (choice) {
			        case 1:
			            System.out.print("ID: ");
			            int id = sc.nextInt(); sc.nextLine();
			            System.out.print("Name: ");
			            String name = sc.nextLine();
			            System.out.print("Course: ");
			            String course = sc.nextLine();
			            studentDAO.addStudent(new Student(id, name, course));
			            break;
			        case 2:
			            System.out.print("Student ID: ");
			            int sid = sc.nextInt(); sc.nextLine();
			            System.out.print("Subject: ");
			            String subject = sc.nextLine();
			            System.out.print("Grade: ");
			            float grade = sc.nextFloat();
			            gradeDAO.addGrade(new Grade(sid, subject, grade));
			            break;
			        case 3:
			            System.out.print("Enter Student ID: ");
			            int sId = sc.nextInt();
			            service.showSummary(sId);
			            break;
			        case 4:
			            System.out.println("👋 Goodbye!");
			            return;
			        default:
			            System.out.println("❌ Invalid choice.");
			    }
			}
		}
    }
}
