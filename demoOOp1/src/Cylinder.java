package src;

public class Cylinder extends Circle{
    private double height;


    public Cylinder(String color, String name, double radius, double height) {
        super(color, name, radius);
        this.height = height;

    }
    public double getVolume(){
        return super.getArea() * height;
    }
}
