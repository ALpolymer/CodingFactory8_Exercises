package gr.aueb.cf.ch6;

/**
 * Κλάση που βρίσκει το χαμηλότερο και υψηλότερο δείκτη ενός κλειδιού σε έναν ταξινομημένο πίνακα.
 * Χρησιμοποιείται για την εύρεση της πρώτης και τελευταίας εμφάνισης μιας τιμής.
 * @author A.Polymeros
 */
public class GetLowAndHighIndexOfKey {

    /**
     * Κύρια μέθοδος που δημιουργεί έναν πίνακα και αναζητά τη θέση του κλειδιού KEY.
     * Εκτυπώνει τις θέσεις της πρώτης και τελευταίας εμφάνισης του κλειδιού.
     * Εάν το κλειδί δεν βρεθεί, εμφανίζει κατάλληλο μήνυμα.
     *
     * @param args  παράμετροι γραμμής εντολών (δεν χρησιμοποιούνται)
     */
    public static void main(String[] args) {
        final int KEY = 8;
        int [] arr = {0, -1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};

        int[] result = getLowAndHighIndexOf(arr , KEY);

        for(int num : result){

            if(num == -1){
                System.out.printf("Key %d not found in the array" , KEY);
                break;
            } else{
                System.out.print(num + " ");
            }
        }
    }

    /**
     * Μέθοδος που βρίσκει την πρώτη και τελευταία εμφάνιση ενός κλειδιού σε έναν πίνακα.
     * Επιστρέφει πίνακα δύο στοιχείων: το πρώτο στοιχείο είναι η θέση της πρώτης εμφάνισης
     * και το δεύτερο στοιχείο είναι η θέση της τελευταίας εμφάνισης του κλειδιού.
     * Εάν το κλειδί δεν βρεθεί, επιστρέφει πίνακα με τιμές {-1, -1}.
     * Εάν το κλειδί εμφανίζεται μόνο μία φορά, και οι δύο θέσεις είναι ίδιες.
     *
     * @param arr   ο πίνακας στον οποίο γίνεται η αναζήτηση
     * @param key   η τιμή που αναζητείται
     * @return      πίνακας με τις θέσεις [πρώτη_εμφάνιση, τελευταία_εμφάνιση] ή [-1, -1] αν δε βρεθεί
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int [] result = {-1,-1};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                result[0] = i;
                break;
            }
        }

        for (int i = result[0]; i < arr.length -1 ; i++) {
            if (arr[i+1] == key){
                result[1] = i+1;
            } else {
                break;
            }
        }

        if( result[0] != -1 && result[1] == -1){
            result[1] = result[0];
        }
        return result;
    }
}