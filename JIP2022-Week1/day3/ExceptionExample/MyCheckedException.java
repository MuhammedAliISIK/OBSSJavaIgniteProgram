package day3.ExceptionExample;

public class MyCheckedException extends Exception{
    public MyCheckedException(Exception ex){
        System.out.println("Custom exception occurred!");
    }


}
