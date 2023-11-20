package src;

public class EquilateralTriangle extends Geometric{
    private double edge;

    public EquilateralTriangle(String color, String name, double edge){
        super(color,name);
        this.edge = edge;
    }

    @Override
    public double getPerimeter() {
        return this.edge*3;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3)*this.edge/2;
    }
}
