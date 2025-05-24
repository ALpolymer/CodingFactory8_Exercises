package gr.aueb.cf.ch13;

public class Main {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(3,4,3);

        System.out.println("XY distance: " + p1.GetXYDistance());
        System.out.println("YZ distance: " + p1.GetYZDistance());
        System.out.println("XZ distance: " + p1.GetXZDistance());
        System.out.println("XYZ distance: " + p1.GetXYZDistance());
    }
}
