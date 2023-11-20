import src.*;

public class App {
    public static void main(String[] args){
        Cylinder c = new Cylinder("Red", "Cylinder", 10,10);
        System.out.println("Volume of Cylinder is: " + c.getVolume());
        Rectangle rect = new Rectangle("Green","Rect1",10,10);
        System.out.println("Area of Rectangle is: " + rect.getArea());
        Squared square = new Squared("blue","Square",10,10);
        System.out.println("Perimeter of Squared is: " + square.getPerimeter());
        EquilateralTriangle EquilateralTriangle = new EquilateralTriangle("Orange", "EquilateralTriangle", 10);
        System.out.println("Perimeter of EquilateralTriangle is " + EquilateralTriangle.getPerimeter());
        System.out.println("Area of EquilateralTriangle is  " + EquilateralTriangle.getArea());
    }

}
