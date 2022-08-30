package day5.events;

public class Executer {
    public static void main(String[] args) {
        Button button1 = new Button(25);
        Form form1 = new Form();

        form1.setFormButton(button1);
        button1.arrEvent.add(form1);
        button1.click();
    }
}
