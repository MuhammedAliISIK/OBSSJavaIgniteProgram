package day4.FileStreamEx;

import java.io.*;

public class BufferedOP implements FileInterface{
    int c;
    @Override
    public void dataInput(String data, String path) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\" + path + ".txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());
            bos.flush();
            bos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dataOutput(String pathName) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\" + pathName + ".txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
            bis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
