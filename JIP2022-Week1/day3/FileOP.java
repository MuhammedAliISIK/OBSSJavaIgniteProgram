package day3;

import java.io.*;

public class FileOP {



    public static void main(String[] args) throws IOException,FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day3\\example.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        FileInputStream fis = new FileInputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day3\\example.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int c = 0;
        String s = "Hello World";
        byte b[]=s.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
        while((c = bis.read())!= -1){
            System.out.print((char)c);
        }

        bis.close();

    }


}
