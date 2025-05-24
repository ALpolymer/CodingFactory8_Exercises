package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * Ενας χρήστης εισάγει 3 αριθμούς
 * Ο πρώτος αριθμός είναι η μέρα του μήνα
 * Ο δεύτερος αριθμός είναι ο μήνας
 * Ο τρίτος αριθμός είναι η χρονιά
 * Η εφαρμογή εμφανίζει την ημερομηνία σε μορφή ΧΧ/XX/XXXX
 */
public class DateFormatApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day=0, month=0, year=0;

        System.out.println("Παρακαλώ εισάγετε την μέρα του μήνα(σε αριθμό):");
        day = sc.nextInt();
        System.out.println("Παρακαλώ εισάγετε τον μήνα(σε αριθμό):");
        month = sc.nextInt();
        System.out.println("Παρακαλώ εισάγετε την χρονιά:");
        year = sc.nextInt();

        System.out.printf("%02d / %02d /%d" , day, month, year);
    }
}
