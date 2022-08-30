package day5.genericsEx;

import java.io.IOException;

public class Executor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student();
        s1.setId(123);
        s1.setName("ali");
        utility<Student> u1 = new utility<>();
        u1.serializeObj(s1);
        System.out.println(u1);
        System.out.println(s1.getName()+" "+s1.getId());
        u1.deserializeObj(s1);
        System.out.println(u1);
        System.out.println(s1.getName()+" "+s1.getId());
    }
}
