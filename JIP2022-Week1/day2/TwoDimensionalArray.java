package day2;

import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int cities[][] = new int[10][2];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            cities[i][0] = i + 1;
            cities[i][1] = rand.nextInt(10000);
        }

        int min = cities[0][1];
        int max = cities[0][1];

        for (int i = 0; i < cities.length; i++) {
            System.out.println(+cities[i][0] + "   " + cities[i][1]);
        }

        for (int i = 0; i < cities.length; i++) {
            if (cities[i][1] < min) {
                min = cities[i][1];
            } else if (cities[i][1] > max) {
                max = cities[i][1];
            }

        }
        System.out.println("Minimum value is: " + min);
        System.out.println("Maximum value is: " + max);
    }
}
