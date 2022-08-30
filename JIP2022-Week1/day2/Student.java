package day2;

import java.util.*;

public class Student {
    private String name;
    private int id;

    Student(String tempName) {
        name = tempName;
    }

    void setName(String temp) {
        name = temp;
    }

    String getName() {
        return name;
    }

    void setId(int tempid) {
        id = tempid;
    }

    int getId() {
        return id;
    }

    public static void main(String[] args) {
        Student stu = new Student("Ali");
        System.out.println("Name: " + stu.getName());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        stu.setName(input.next());
        System.out.println("Enter id: ");
        stu.setId(input.nextInt());

        System.out.println("Name: " + stu.getName());
        System.out.println("Id: " + stu.getId());
    }
}
