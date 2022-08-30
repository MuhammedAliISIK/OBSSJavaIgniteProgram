package day3.ImprovedPenExercise;

public class Rectangle extends Shape{
    private int width;
    private int height;


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    @Override
    public String getDrawingInfo() {
        return "Area is "+getArea()+"and color is "+getColor();
    }

    @Override
    double getArea() {
        return width*height;
    }
}
