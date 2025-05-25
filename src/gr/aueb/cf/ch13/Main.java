package gr.aueb.cf.ch13;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(3,4,3);

        System.out.println("XY distance: " + p1.GetXYDistance());
        System.out.println("YZ distance: " + p1.GetYZDistance());
        System.out.println("XZ distance: " + p1.GetXZDistance());
        System.out.println("XYZ distance: " + p1.GetXYZDistance());

        int[] arr = {1,3,2,6,-2,3};
        System.out.println(MathHelper.findMax(arr));//6
        System.out.println(MathHelper.findMin(arr));//-2
        System.out.println(MathHelper.getAverage(arr));
    }
}
