package gr.aueb.cf.ch4;
import java.util.Scanner;

/**
 * Αυτή η κλάση μετατρέπει έναν αριθμό (1-7) στην αντίστοιχη ημέρα της εβδομάδας.
 * Ζητά από τον χρήστη να εισάγει έναν αριθμό από το 1 έως το 7 και εμφανίζει
 * την αντίστοιχη ημέρα της εβδομάδας στα Ελληνικά. Χρησιμοποιεί τη δομή ελέγχου
 * switch-case με τη σύγχρονη σύνταξη (arrow syntax) για την αντιστοίχιση.
 * Αν ο χρήστης εισάγει αριθμό εκτός του εύρους 1-7, εμφανίζεται κατάλληλο
 * μήνυμα λάθους.
 *
 * @author A.Polymeros
 */
public class NumToDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNum = 0;

        System.out.println("Παρακαλώ δώστε έναν αριθμό από 1 εώς 7 που αντιστοιχεί σε μία μέρα της εβδομάδας:");
        dayNum = scanner.nextInt();

        switch (dayNum){
            case 1 -> System.out.println("Δευτέρα");
            case 2 -> System.out.println("Τρίτη");
            case 3 -> System.out.println("Τετάρτη");
            case 4 -> System.out.println("Πέμπτη");
            case 5 -> System.out.println("Παρασκευή");
            case 6 -> System.out.println("Σάββατο");
            case 7 -> System.out.println("Κυριακή");
            default -> System.out.println("Λάθος επιλογή.Ο αριθμός πρέπει να είνα από 1 εώς 7");
        }
    }
}
