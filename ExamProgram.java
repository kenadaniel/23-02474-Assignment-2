/*This program will be ablle to calculate the students coursework
and compute the coursework for the student to view.
*/

import java.util.Scanner;

public class ExamProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        // Insert the variables for coursework and exam results
        int ass1 = 10, ass2 = 10, ass3 = 10, cat1 = 10, cat2 = 10;
        int coursework = ass1 + ass2 + ass3 + cat1 + cat2;
        int finalExam = 40; // Example value
        int totalScore = coursework + finalExam;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. View coursework results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // View coursework results
                    System.out.println("Coursework results:");
                    System.out.println("Assessment 1: " + ass1);
                    System.out.println("Assessment 2: " + ass2);
                    System.out.println("Assessment 3: " + ass3);
                    System.out.println("CAT 1: " + cat1);
                    System.out.println("CAT 2: " + cat2);
                    System.out.println("Total coursework: " + coursework);
                    break;
                case 2:
                    // View exam results
                    System.out.println("Exam results:");
                    System.out.println("Final Exam: " + finalExam);
                    System.out.println("Total Score: " + totalScore);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (option != 3);

        // Counting function
        int numberOfAssessments = 0;
        int[] assessments = {ass1, ass2, ass3, cat1, cat2};
        for (int i = 0; i < assessments.length; i++) {
            numberOfAssessments++;
        }

        // Decision function
        double courseworkThreshold = 0.67 * numberOfAssessments;
        if (numberOfAssessments < courseworkThreshold) {
            System.out.println("You have not done 2/3 of the coursework. You are required to repeat the course irrespective of your final exam grade.");
        } else {
            System.out.println("You have completed the required coursework.");
        }

        scanner.close();
    }
}
  