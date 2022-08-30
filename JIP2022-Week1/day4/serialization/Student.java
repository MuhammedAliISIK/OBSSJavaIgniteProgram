package day4.serialization;

import java.io.*;

public class Student implements Serializable, Comparable {
    transient private int id;
    private int age;
    private String name;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(){



    }
    public static void insertStudent(Student s) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\serialization\\students.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
    }

    public static void getStudent(Student s) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\serialization\\students.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s = (Student) ois.readObject();
        System.out.println("Name: "+s.getName());
        System.out.println("Id: "+s.getId());
        System.out.println("Age: "+s.getAge());
    }

    @Override
    public int compareTo(Object o) {
        if(this.age == ((Student)o).id){
            return 0;
        }
        else if(this.age > ((Student)o).id){
            return 1;
        }
        else{
            return -1;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }




}
