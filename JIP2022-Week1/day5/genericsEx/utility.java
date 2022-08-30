package day5.genericsEx;

import java.io.*;

public class utility <T extends Serializable>{
    public void serializeObj(T t) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day5\\genericsEx\\genericstudent.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(t);

    }
    public T deserializeObj(T t) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day5\\genericsEx\\genericstudent.txt");
        ObjectInputStream oit = new ObjectInputStream(fis);
        t = (T) oit.readObject();
        return t;
    }
}
