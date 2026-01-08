Task1_StudentGradeTracker/StudentGradeTracker.java
import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            int m = sc.nextInt();
            marks.add(m);
            sum += m;
        }

        double average = (double) sum / n;
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}
