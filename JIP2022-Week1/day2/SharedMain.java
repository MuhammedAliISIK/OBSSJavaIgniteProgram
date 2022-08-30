package day2;

import day2.LabPenExercise.Circle;
import day2.LabPenExercise.Pen;
import day2.LabPenExercise.Rectangle;


public class SharedMain {
    public static void main(String[] args) {
        Pen pencil = new Pen();
        Pen pencil2 = new Pen();

        Circle circleObj = new Circle(6, "blue");
        Rectangle rectangleObj = new Rectangle(10, 6, "red");
        pencil2.changeColorRectangle("green", rectangleObj);

        System.out.println("Area of circle: " + pencil.drawCircle(circleObj));
        System.out.println("Area of rectangle: " + pencil.drawRectangle(rectangleObj));

        System.out.println("New color of circle: " + pencil.changeColorCircle("purple", circleObj));
        System.out.println("New color of rectangle: " + pencil.changeColorRectangle("yellow", rectangleObj));

        System.out.println("Pen used " + Pen.counter + " times");
    }
}


