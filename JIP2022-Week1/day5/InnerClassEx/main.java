package day5.InnerClassEx;

public class main {
    public static void main(String[] args) {
        Book.Publisher publisher = new Book.Publisher();
        Book book1 = new Book();
        publisher.setName("Sait Faik");
        publisher.setCountry("Turkey");
        book1.setPublisher(publisher);
        System.out.println(book1.getPublisher().getName());
        System.out.println(book1.getPublisher().getCountry());
    }

}
