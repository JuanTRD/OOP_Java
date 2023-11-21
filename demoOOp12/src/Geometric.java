package src;

public abstract class Geometric {
    protected String color;
    protected String name;
    public Geometric(String color, String name) {
        this.color = color;
        this.name = name;
    };
    public abstract double getPerimeter();
    public abstract double getArea();
    void setColor(String color){
        this.color = color;
    }

}
