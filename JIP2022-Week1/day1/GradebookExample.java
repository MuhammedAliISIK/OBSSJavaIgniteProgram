package day1;

import java.util.*;

public class GradebookExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0, numOfGrades = 1;
        double average = 0;
        System.out.println("Enter 101 to exit program");

        while (grade != 101) {
            System.out.print("Please enter grade: ");
            grade = input.nextInt();
            if (grade >= 0 && grade < 101) {
                average += grade;
                average /= numOfGrades;
                numOfGrades++;
            } else if (grade == 101) {
                System.out.println("Terminating program...");
            } else {
                System.out.println("Please enter a valid grade!");
            }
            System.out.println("Average grade is " + average);
        }
    }
}
