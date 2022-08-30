package day3.ImprovedPenExercise;

public class Circle extends Shape{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getDrawingInfo() {
        return "Area is "+getArea()+"and color is "+getColor();
    }

    @Override
    double getArea() {
        return Math.pow(radius,2)* Math.PI;
    }
}
