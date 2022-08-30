package day2.LabPenExercise;

public class Pen {

    public static int counter;
    public int drawRectangle(Rectangle r){
        Pen.counter++;
        return r.width*r.height;
    }

    public double drawCircle(Circle c){
        Pen.counter++;
        return 3.14*c.radius*c.radius;
    }

    public String changeColorRectangle(String tempcolor, Rectangle r){
        Pen.counter++;
        r.color=tempcolor;
        return r.color;
    }

    public String changeColorCircle(String tempcolor, Circle c){
        Pen.counter++;
        c.color=tempcolor;
        return c.color;
    }
}
