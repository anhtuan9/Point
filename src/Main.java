public class Main {

    public static void main(String[] args) {
        Point_2D a = new Point_2D(2,6);
        Point_3D b = new Point_3D(3,9,10);
        System.out.println(a.toString());
        System.out.println(b.toString());
        a.getXY();
        b.getXYZ();
        System.out.println(a.getList());
        System.out.println(b.getList());
    }
}
