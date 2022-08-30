package day4.FileStreamEx;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        File f1 = new File();
        f1.dataInput("asdasd","input");
        f1.dataOutput("input");
        BufferedOP b1 = new BufferedOP();
        b1.dataInput("bufferdeneme","input");
        b1.dataOutput("input");

    }
    public static void benchmark(String path, FileInterface fi) throws IOException {
        StringBuilder sb = new StringBuilder("Hello World");
        for(int i = 0;i<1000;i++){
            sb.append("Hello World");
        }
        long start = System.nanoTime();
        fi.dataInput(path, sb.toString());
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println("The execution time is "+diff);
    }
}
