package day2;

public enum EnumExample {
    MEDIUM("Medium", 3),
    SMALL("Small", 1),
    LARGE("Large", 5);

    private String name;
    private double litres;

    private EnumExample(String name, double litres) {
        this.name = name;
        this.litres = litres;
    }

    public String getName() {
        return name;
    }

    public double getLitres() {
        return litres;
    }

    public static void main(String[] args) {
        for (EnumExample sizes : EnumExample.values()) {
            System.out.println("Size: " + sizes.getName() + ", Capacity: " + sizes.getLitres());
        }
    }
}
