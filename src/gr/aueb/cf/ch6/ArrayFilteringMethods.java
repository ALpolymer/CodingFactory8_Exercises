package gr.aueb.cf.ch6;
import java.util.Scanner;

/**
 * Μια κλάση που υλοποιεί διάφορες μεθόδους φιλτραρίσματος για έναν πίνακα ακεραίων.
 * Η κλάση ελέγχει αν ένας πίνακας 6 αριθμών πληροί συγκεκριμένα κριτήρια που αφορούν
 * άρτιους/περιττούς αριθμούς, συνεχόμενους αριθμούς, λήγοντα ψηφία και δεκάδες.
 * Όλοι οι αριθμοί πρέπει να είναι μικρότεροι ή ίσοι του 49.
 * @author A.Polymeros
 */
public class ArrayFilteringMethods {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Η κύρια μέθοδος του προγράμματος. Καλεί τη μέθοδο για την εισαγωγή του πίνακα από το χρήστη,
     * ελέγχει την εγκυρότητά του, και στη συνέχεια εφαρμόζει διάφορα φίλτρα για να επαληθεύσει
     * αν ο πίνακας πληροί συγκεκριμένα κριτήρια.
     *
     * @param args Παράμετροι γραμμής εντολών (δε χρησιμοποιούνται)
     */
    public static void main(String[] args) {
        int [] initializedArr = userInitializesArray();

        if(!checkArrayIsValid(initializedArr)){
            System.out.println("Οι αριθμοί που εισάγετε πρέπει να ειναι μικρότεροι ή ισοι του 49");
            return;
        }

        System.out.println();
        printArr(initializedArr);

        if(checkEvensFilter(initializedArr)){
            System.out.println("\n1. Ο πίνακας δεν έχει πάνω από 3 άρτιους: Passed ");
        }else{
            System.out.println("\n1. Ο πίνακας δεν έχει πάνω από 3 άρτιους: Failed ");
        }

        if(checkOddsFilter(initializedArr)){
            System.out.println("\n2. Ο πίνακας δεν έχει πάνω από 3 περιττοὐς: Passed ");
        }else{
            System.out.println("\n2. Ο πίνακας δεν έχει πάνω από 3 περιττοὐς: Failed ");
        }

        if(checkConsecutiveFilter(initializedArr)){
            System.out.println("\n3. Ο πίνακας δεν έχει πάνω από 3 συνεχόμενους: Passed ");
        }else{
            System.out.println("\n3. Ο πίνακας δεν έχει πάνω από 3 συνεχόμενους: Failed ");
        }


        if(checkLastDigitFilter(initializedArr)){
            System.out.println("\n4. Ο πίνακας δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα: Passed ");
        }else{
            System.out.println("\n4. Ο πίνακας δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα: Failed ");
        }

        if(checkDecadesFilter(initializedArr)){
            System.out.println("\n5. Ο πίνακας δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα : Passed ");
        }else{
            System.out.println("\n5. Ο πίνακας δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα : Failed ");
        }
    }

    /**
     * Ζητά από το χρήστη να εισάγει 6 ακέραιους αριθμούς και τους αποθηκεύει σε έναν πίνακα.
     *
     * @return Επιστρέφει έναν πίνακα με τους 6 αριθμούς που εισήγαγε ο χρήστης
     */
    public static int[] userInitializesArray(){
        int[] arr = new int[6];
        System.out.println("Παρακαλώ εισάγετε 6 ακέραιους αριθμούς από το 1 εως το 49");
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        arr[4] = scanner.nextInt();
        arr[5] = scanner.nextInt();

        return arr;
    }

    /**
     * Εκτυπώνει τα στοιχεία ενός πίνακα ακεραίων.
     *
     * @param arr Ο πίνακας ακεραίων που θα εκτυπωθεί
     */
    public static void printArr(int[] arr){
        System.out.println("Ο πίνακας που εισάγατε έχει τα στοιχεια:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    /**
     * Ελέγχει αν όλα τα στοιχεία του πίνακα είναι μικρότερα ή ίσα του 49.
     *
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν όλα τα στοιχεία είναι μικρότερα ή ίσα του 49, διαφορετικά false
     */
    public static boolean checkArrayIsValid(int[] arr){
        for(int num : arr){
            if (num > 49) return false;
        }
        return true;
    }

    /**
     * Ελέγχει αν ο αριθμός των άρτιων αριθμών στον πίνακα δεν υπερβαίνει τους 3.
     *
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν ο αριθμός των άρτιων αριθμών είναι μικρότερος ή ίσος του 3, διαφορετικά false
     */
    public static boolean checkEvensFilter(int[] arr){
        int count = 0;
        for(int num : arr){
            if (num % 2 == 0) count++;
        }
        return count <= 3;
    }

    /**
     * Ελέγχει αν ο αριθμός των περιττών αριθμών στον πίνακα δεν υπερβαίνει τους 3.
     *
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν ο αριθμός των περιττών αριθμών είναι μικρότερος ή ίσος του 3, διαφορετικά false
     */
    public static boolean checkOddsFilter(int[] arr){
        int count = 0;
        for(int num : arr){
            if (num % 2 == 1) count++;
        }
        return count <= 3;
    }

    /**
     * Ελέγχει αν ο πίνακας έχει λιγότερους από 3 συνεχόμενους αριθμούς.
     * Συνεχόμενοι αριθμοί θεωρούνται δύο αριθμοί όπου ο ένας είναι αμέσως μεγαλύτερος του άλλου.
     *
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν ο πίνακας έχει λιγότερους από 3 συνεχόμενους αριθμούς, διαφορετικά false
     */
    public static boolean checkConsecutiveFilter(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1] -1) count ++;
        }
        return count < 3;
    }

    /**
     * Ελέγχει αν υπάρχουν περισσότεροι από 3 αριθμοί με το ίδιο τελευταίο ψηφίο στον πίνακα.
     *
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν δεν υπάρχουν περισσότεροι από 3 αριθμοί με το ίδιο τελευταίο ψηφίο, διαφορετικά false
     */
    public static boolean checkLastDigitFilter(int[] arr){
        int[] lastDigitCountArr = new int[10];

        for(int num : arr){
            int lastDigit = num %10;
            lastDigitCountArr[lastDigit]++;
        }

        boolean countLimit = false;
        for(int num : lastDigitCountArr){
            if (num > 3) {
                countLimit = true;
                break;
            }
        }
        return !countLimit;
    }

    /**
     * Ελέγχει αν υπάρχουν περισσότεροι από 3 αριθμοί στην ίδια δεκάδα στον πίνακα.
     * Για παράδειγμα, οι αριθμοί 31, 32, 33, 34 ανήκουν στην ίδια δεκάδα (30-39).
     *
     * @param arr Ο πίνακας προς έλεγχο
     * @return true αν δεν υπάρχουν περισσότεροι από 3 αριθμοί στην ίδια δεκάδα, διαφορετικά false
     */
    public static boolean checkDecadesFilter(int[] arr){
        int[] decadesCountArr = new int[10];

        for(int num : arr){
            int decadesDigit = (int) Math.floor((double) (num % 100) /10);
            decadesCountArr[decadesDigit]++;
        }

        boolean countLimit = false;
        for(int num : decadesCountArr){
            if (num > 3) {
                countLimit = true;
                break;
            }
        }
        return !countLimit;
    }
}