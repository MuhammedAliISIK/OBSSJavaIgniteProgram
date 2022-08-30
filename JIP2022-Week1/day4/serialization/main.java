package day4.serialization;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student(123,"ahmet", 17);
        Student s2 = new Student();
        Student.insertStudent(s1);
        Student.getStudent(s2);

        Student s3 = new Student(444,"Mehmet",23);
        System.out.println("Compare result of "+s1.getName()+" and "+s3.getName()+" = "+s1.compareTo(s3));
        System.out.println("Hash code of "+s3.getName()+": "+s3.hashCode());
    }
}
