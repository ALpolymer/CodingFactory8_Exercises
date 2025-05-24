package gr.aueb.cf.ch6;

/**
 * This class provides functionality to find the second smallest element in an array of integers.
 * It contains methods to identify and return the second smallest value from a given input array.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class FindSecondSmaller {

    /**
     * The main method demonstrates the usage of the findSecondSmaller method.
     * It creates a sample array and calls the findSecondSmaller method to find the second smallest element.
     * The result is then displayed to the console.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {4,4,4};

        int result = findSecondSmaller(arr);

        if (result == -1){
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("The second smallest element is: " + result);
        }
    }

    /**
     * Finds and returns the second smallest element in the given array.
     * The method first finds the minimum value in the array, then finds the smallest value
     * that is greater than the minimum.
     *
     * @param arr the input array to search for the second smallest element
     * @return the second smallest element in the array, or -1 if:
     *         - the array is null or has fewer than 2 elements
     *         - all elements in the array are the same (no second smallest exists)
     */
    public static int findSecondSmaller(int [] arr){
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int minimum = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < minimum) {
                minimum = num;
            }
        }

        int secondMinimum = Integer.MAX_VALUE;
        for (int num : arr){
            if(num > minimum && num < secondMinimum){
                secondMinimum = num;
            }
        }

        if(secondMinimum == Integer.MAX_VALUE) {
            System.out.println("Τhere is no second smallest number from:" + minimum);
            return -1;
        }
        return secondMinimum;
    }
}