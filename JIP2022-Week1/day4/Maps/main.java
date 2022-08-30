package day4.Maps;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException, NullPointerException {
        Map<String, Integer> occuranceMap = new TreeMap<>();
        FileInputStream fis = new FileInputStream("C:\\Coding\\Java\\internship\\InternshipProjects\\src\\day4\\Maps\\lorem.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        StringBuilder sb = new StringBuilder();
        String fullText;

        int r;

        while ((r = bis.read()) != -1) {
            sb.append((char) r);
        }
        bis.close();

        fullText = sb.toString();
        fullText = fullText.replaceAll("\\p{P}", "");
        fullText = fullText.replaceAll("\r\n\r\n", "");
        fullText = fullText.toLowerCase();

        String[] arr = fullText.split(" ");

        for (String word : arr) {
            Integer integer = occuranceMap.get(word);
            if (integer == null) {
                occuranceMap.put(word, 1);
            } else {
                occuranceMap.put(word, integer + 1);
            }
        }
        System.out.println(occuranceMap);
    }

}
