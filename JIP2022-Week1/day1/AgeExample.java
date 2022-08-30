package day1;

import java.util.*;

public class AgeExample {
    public static void main(String[] args) {
        System.out.println("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        boolean error;

        do {
            if (age < 45 && age > 0) {
                System.out.println("You are young!");
                error = false;
            } else if (age >= 45 && age <= 165) {
                System.out.println("You are old!");
                error = false;
            }
            else {
                System.out.println("Please enter a valid input!");
                error = true;
                System.out.println("Please enter your age: ");
                age = input.nextInt();
            }
        } while (error);
    }
}