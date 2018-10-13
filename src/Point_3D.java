import java.util.ArrayList;

public class Point_3D extends Point_2D {
    private float z;
    ArrayList list = new ArrayList();

    public Point_3D() {
        super();
        this.z = 0.0f;
    }

    public Point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    @Override
    public ArrayList getList() {
        return list;
    }

    public ArrayList getXYZ() {
        list.add(getX());
        list.add(getY());
        list.add(getZ());
        return list;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}
