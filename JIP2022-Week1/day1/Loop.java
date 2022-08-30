package day1;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 8)
                break;
            else if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
