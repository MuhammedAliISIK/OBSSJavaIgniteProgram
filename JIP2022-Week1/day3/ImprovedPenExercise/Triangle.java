package day3.ImprovedPenExercise;

public class Triangle extends Shape{
    private int height;
    private int width;


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String getDrawingInfo() {
        return "Area is "+getArea()+"and color is "+getColor();
    }

    @Override
    double getArea() {
        return width*height/2;
    }
}
