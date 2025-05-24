package gr.aueb.cf.ch6;
import java.util.Scanner;

/**
 * Η κλάση αυτή υλοποιεί έναν αλγόριθμο για την εύρεση της θέσης του μεγαλύτερου στοιχείου
 * σε ένα συγκεκριμένο εύρος ενός πίνακα ακεραίων.
 *
 * @author A.Polymeros
 * @version 1.0
 */

public class FindMaxFromArray {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Η κύρια μέθοδος που εκτελεί το πρόγραμμα.
     * Δέχεται είσοδο από τον χρήστη για τα όρια του εύρους (αρχική και τελική θέση)
     * και εμφανίζει τη θέση του μεγαλύτερου στοιχείου στο συγκεκριμένο εύρος του πίνακα.
     *
     * @param args Παράμετροι γραμμής εντολών (δεν χρησιμοποιούνται σε αυτή την εφαρμογή)
     */
    public static void main(String[] args) {
        int max = 0;
        int low = 0;
        int high = 0;
        int[] arr = {2,3,5,1,7,5,3,5,6};


        System.out.println("Παρακαλώ είσάγετε την θέση του αρχικού στοιχείου του πίνακα:");
        low = getOneInt();
        System.out.println("Παρακαλώ είσάγετε την θέση του τελικού στοιχείου του πίνακα:");
        high = getOneInt();

        max = getMaxPosition(arr, low, high);
        System.out.println("Ο μεγαλύτερος αριθμός είναι: " + max);
    }

    /**
     * Εντοπίζει τη θέση του μεγαλύτερου στοιχείου σε ένα συγκεκριμένο εύρος πίνακα.
     *
     * @param arr   Ο πίνακας ακεραίων στον οποίο γίνεται η αναζήτηση
     * @param low   Η αρχική θέση του εύρους αναζήτησης (συμπεριλαμβάνεται)
     * @param high  Η τελική θέση του εύρους αναζήτησης (συμπεριλαμβάνεται)
     * @return      Η θέση (δείκτης) του μεγαλύτερου στοιχείου στο καθορισμένο εύρος
     */
    public static int getMaxPosition(int[] arr ,int low, int high){
        if(low < 0 || high > arr.length - 1){
            System.out.println("Out of array boundaries");
        }

        if(low > high){
            System.out.println("First position must be smaller than the last");
        }

        var maxIndex = low;
        for (int i = low; i <= high ; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Διαβάζει και επιστρέφει έναν ακέραιο από την είσοδο του χρήστη.
     *
     * @return  Ο ακέραιος που εισήγαγε ο χρήστης
     */
    public static int getOneInt(){
        return scanner.nextInt();
    }
}