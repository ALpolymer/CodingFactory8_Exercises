package gr.aueb.cf.ch13;

public class MathHelper {
    private MathHelper(){

    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i :arr){
            if(i< min){
                min = i;
            }
        }
        return min;
    }

    public static double getAverage(int[] arr){
        double sum = 0;
        for (double i : arr){
            sum += i;
        }
        return (double) (sum / arr.length);
    }
}
