package day3.ImprovedPenExercise;

public class Pen {
    public static int counter;

    public void draw(Drawable d){
        Pen.counter++;
        d.getDrawingInfo();
    }

    public String changeColor(String tempcolor, Shape s){
        Pen.counter++;
        s.setColor(tempcolor);
        return s.getColor();
    }

    public static void main(String[] args) {
        Circle s1 = new Circle();
        Rectangle s2 = new Rectangle();
        Triangle s3 =new Triangle();
        Pen pencil = new Pen();

        s1.setColor("blue");
        s1.setRadius(10);
        s2.setColor("yellow");
        s2.setHeight(6);
        s2.setWidth(5);
        s3.setHeight(4);
        s3.setWidth(2);
        s3.setColor("black");

        System.out.println(s1.getDrawingInfo());
        System.out.println(s2.getDrawingInfo());
        System.out.println(s3.getDrawingInfo());

        pencil.changeColor("orange",s1);
        pencil.changeColor("green",s1);

        System.out.println(s1.getDrawingInfo());
        System.out.println(s2.getDrawingInfo());
    }


}
