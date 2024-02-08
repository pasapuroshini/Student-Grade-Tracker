import java.util.ArrayList;
import java.util.Scanner;
/*without using collections  */
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Grade Tracker!\n");

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        
        
        ArrayList<Integer> grades = new ArrayList<>();
        
       
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for Student " + (i + 1) + ": ");
            grades.add(sc.nextInt());
        }

        
        double average = calculateAverage(grades);
        Integer highestMark = Integer.MIN_VALUE;
        Integer lowestMark = Integer.MAX_VALUE;

        for (Integer mark : grades) {
            if (mark > highestMark) {
                highestMark = mark;
            }
            if (mark < lowestMark) {
                lowestMark = mark;
            }
        }

      
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Score: " + highestMark);
        System.out.println("Lowest Score: " + lowestMark);

       
        System.out.println("\nThank you for using the Student Grade Tracker!");
    }

   
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
