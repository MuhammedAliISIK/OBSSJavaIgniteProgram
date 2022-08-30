package day3.ImprovedPenExercise;

public abstract class Shape implements Drawable{
    private String color;

    abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
