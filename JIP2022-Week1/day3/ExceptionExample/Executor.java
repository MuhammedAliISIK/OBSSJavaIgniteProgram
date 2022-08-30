package day3.ExceptionExample;

public class Executor{
    public static void exec() throws MyCheckedException {
        try {
            Divider.divide();
        }
        catch (Exception ex){
            System.out.println("Exception occurred!");
            throw new MyCheckedException(ex);
        }
    }
}
