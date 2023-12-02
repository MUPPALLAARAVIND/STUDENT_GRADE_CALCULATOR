import java.util.Scanner;

public class SGC {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3;

        double averageMarks = totalMarks / 3;

        String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("---------------------------");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");

        scanner.close();
    }
}
