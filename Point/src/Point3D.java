package src;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){};

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(float x, float y, float z) {
        return new float[]{this.x, this.y, this.z};
    }

    public void setXYZ(float x, float y, float z) {
        this.y = y;
        this.x = x;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Toa do diem la (" + x + ", " + y + ", " + z + ")";
    }
}
