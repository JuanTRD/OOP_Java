import src.Triangle;

public class App {
    public static void main(String[] args) {
        Triangle tri = new Triangle(3,4,5);
        System.out.println(tri.getSide1());
        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());
        System.out.println(tri.toString());
    }
}
