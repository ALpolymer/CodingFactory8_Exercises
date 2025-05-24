package gr.aueb.cf.ch6;
import java.util.Arrays;

/**
 * A utility class that provides various array manipulation methods.
 * This class contains methods for validating arrays, finding elements,
 * filtering even numbers, doubling array values, and checking for
 * positive and negative values.
 */
public class ArrayMethodsExercise {
    /**
     * Main method that demonstrates the usage of array utility methods.
     * It creates an empty array and tests various array methods,
     * displaying the results to standard output.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8};
        if(!isArrayValid(arr)){
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int searchElement = 7;
        int findElementResult = findElement(searchElement, arr);


        if (findElementResult == -1) {
            System.out.println("The element is not found");
        } else {
            System.out.println("Το στοιχείο " + searchElement + " βρίσκεται στη θέση: " + findElementResult);

        }

        System.out.println("\nΖυγοί αριθμοί στον πίνακα:");
        findEvens(arr);


        int[] mapAndDouble = mapAndDouble(arr);
        System.out.println("\nΠίνακας με διπλασιασμένα στοιχεία:");
        for (int num : mapAndDouble) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Υπάρχει τουλάχιστον ένας θετικός: " + positiveCheck(arr));

        System.out.println("Ολα τα στοιχεία του πίνακα είναι θετικοί αριθμοί: " + !negativeCheck(arr));
    }
    /**
     * Validates if the given array is valid for processing.
     * An array is considered valid if it is not null and contains at least 2 elements.
     *
     * @param arr the array to validate
     * @return true if the array is valid, false otherwise
     */
    public static boolean isArrayValid(int[] arr) {
        return arr != null && arr.length >= 2;
    }
    /**
     * Searches for a specific element in the array and returns its index.
     * If multiple occurrences exist, the index of the last occurrence is returned.
     *
     * @param el the element to search for
     * @param arr the array to search in
     * @return the index of the last occurrence of the element, or -1 if not found
     */
    public static int findElement(int el, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return -1;
    }
    /**
     * Prints all even numbers from the array to standard output.
     * Numbers are printed in the same order as they appear in the array,
     * separated by spaces.
     *
     * @param arr the array to search for even numbers
     */
    public static void findEvens(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
    /**
     * Creates a new array with each element being twice the value of
     * the corresponding element in the original array.
     *
     * @param arr the array to process
     * @return a new array containing doubled values from the original array
     */
    public static int[] mapAndDouble(int[] arr) {
        int[] arrayCopy;
        arrayCopy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arrayCopy[i] = arrayCopy[i] * 2;
        }
        return arrayCopy;
    }
    /**
     * Checks if the array contains at least one positive value.
     *
     * @param arr the array to check
     * @return true if at least one positive value exists, false otherwise
     */
    public static boolean positiveCheck(int[] arr) {
        boolean positiveExists = false;
        for (int num : arr) {
            if (num > 0) {
                positiveExists = true;
                break;
            }
        }
        return positiveExists;
    }
    /**
     * Checks if the array contains at least one negative value.
     *
     * @param arr the array to check
     * @return true if at least one negative value exists, false otherwise
     */
    public static boolean negativeCheck(int[] arr) {
        boolean negativeExists = false;
        for (int num : arr) {
            if (num < 0) {
                negativeExists = true;
                break;
            }
        }
        return negativeExists;
    }
}