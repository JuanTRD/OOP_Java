package src;

public class Point2D {
    protected float x=0.0f;
    protected float y=0.0f;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){};

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "Toa do diem la (" + x + ", " + y + ")";
    }
}
