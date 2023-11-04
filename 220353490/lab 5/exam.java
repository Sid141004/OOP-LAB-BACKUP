import java.util.Scanner;

public class Result {
    private int[][] marks;  // 2D array to store marks of 3 students in 3 subjects
    private int[] totalMarks;  // 1D array to store total marks of each student

    public Result() {
        marks = new int[3][3];
        totalMarks = new int[3];
    }

    public void storeMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
    }

    public void calculateTotalMarks() {
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            totalMarks[i] = total;
        }
    }

    public void findHighestSubjectMarks() {
        for (int j = 0; j < 3; j++) {
            int highestMarks = marks[0][j];
            int studentRoll = 1;

            for (int i = 1; i < 3; i++) {
                if (marks[i][j] > highestMarks) {
                    highestMarks = marks[i][j];
                    studentRoll = i + 1;
                }
            }

            System.out.println("Highest marks in Subject " + (j + 1) + ": " + highestMarks + " by Student " + studentRoll);
        }
    }

    public void findStudentWithHighestTotalMarks() {
        int highestTotalMarks = totalMarks[0];
        int studentRoll = 1;

        for (int i = 1; i < 3; i++) {
            if (totalMarks[i] > highestTotalMarks) {
                highestTotalMarks = totalMarks[i];
                studentRoll = i + 1;
            }
        }

        System.out.println("Student with the highest total marks: Student " + studentRoll);
    }

    public static void main(String[] args) {
        Result result = new Result();

        // Task (a): Store marks of 3 subjects obtained by 3 students in a 2D array
        result.storeMarks();

        // Task (b): Calculate total marks obtained by each student and store in a 1D array
        result.calculateTotalMarks();

        // Task (c): Find the highest marks in each subject and the roll number of the student who secured it
        result.findHighestSubjectMarks();

        // Task (d): Find the student who obtained the highest total marks
        result.findStudentWithHighestTotalMarks();
    }
}
