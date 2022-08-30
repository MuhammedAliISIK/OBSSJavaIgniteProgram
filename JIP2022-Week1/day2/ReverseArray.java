package day2;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int original[] = new int[10];
        int reversed[] = new int[10];
        int temp;
        int j = original.length - 1;

        for (int i = 0; i < original.length; i++) {
            System.out.print("Please enter " + (i + 1) + ".element of array: ");
            temp = input.nextInt();
            original[i] = temp;
            reversed[j] = temp;
            j--;
        }
        for (int i = 0; i < original.length; i++) {
            System.out.println((i + 1) + ".element of reversed array: " + reversed[i]);
        }

    }

}
