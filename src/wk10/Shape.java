package wk10;

public abstract class Shape {

    private int sides;
    private double radius;
    private String name;

    public static final String COMPANY = "Georgian College";

    //abstract methods

    public abstract double area();

    public abstract double perimeter();

    public Shape(){}
    public Shape(String name, int sides, double radius) {

        setSides(sides);
        setName(name);
        setRadius(radius);
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
