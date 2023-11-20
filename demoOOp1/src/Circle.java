package src;

public class Circle extends Geometric implements ICircle {
    protected double radius;
    public Circle(String color, String name, double radius){
        super(color, name);
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*this.radius*2;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
