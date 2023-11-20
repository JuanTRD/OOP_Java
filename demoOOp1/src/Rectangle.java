package src;

public class Rectangle extends Geometric {
    private double width;
    private double height;
    public Rectangle(String color, String name, double width, double height) {
        super(color, name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }
}
