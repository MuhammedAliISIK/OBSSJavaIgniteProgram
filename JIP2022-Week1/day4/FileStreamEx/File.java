package day4.FileStreamEx;

import java.io.*;

public class File implements FileInterface {

    FileInputStream fis;
    FileOutputStream fos;
    int c;

    @Override
    public void dataInput(String data, String path) {
        try {
            fos = new FileOutputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\" + path + ".txt");
            fos.write(data.getBytes());
            fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dataOutput(String pathName) {
        try {
            fis = new FileInputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\" + pathName + ".txt");
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
