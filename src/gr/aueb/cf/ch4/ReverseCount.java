package gr.aueb.cf.ch4;

/**
 * Αυτή η κλάση εκτελεί αντίστροφη μέτρηση από το 10 μέχρι το 1.
 * Χρησιμοποιεί έναν βρόχο for με φθίνουσα σειρά για να διατρέξει
 * τους αριθμούς από την τιμή της μεταβλητής max (10) μέχρι το 1,
 * και εμφανίζει κάθε αριθμό στην έξοδο.
 *
 * @author A.Polymeros
 */
public class ReverseCount {
    public static void main(String[] args) {
        int max =10;

        for (int i = max; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
    }
}
