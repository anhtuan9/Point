import java.util.ArrayList;

public class Point_2D {
    private float x, y;
    private ArrayList list = new ArrayList();

    public Point_2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point_2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public ArrayList getList() {
        return list;
    }

    public ArrayList getXY() {
        list.add(this.x);
        list.add(this.y);
        return list;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
