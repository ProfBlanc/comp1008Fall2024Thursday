package wk10;

public class Rectangle extends Shape {

    double length, width;

    public Rectangle(){}

    public Rectangle(String name, int sides, double radius
            ,double length, double width) {

        super(name, sides, radius);
        this.length = length;
        this.width = width;
    }


    @Override
    public double area(){
        return length * width;
    }
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}
