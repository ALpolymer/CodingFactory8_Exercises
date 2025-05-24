package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Εμφανίζει επαναληπτικά ένα μενού με επιλογές, το
 * οποίο επαναλαμβάνεται μέχρι ο χρήστης να δώσει τον αριθμό 5. Για κάθε
 * επιλογή από 1–4  εμφανίζεται κατάλληλο μήνυμα, για
 * παράδειγμα αν ο χρήστης δώσει 1, θα εμφανίζεται το μήνυμα «Επιλέξατε
 * Εισαγωγή».Επίσης ελέγχεται αν ο χρήστης έχει δώσει αριθμό
 * < 0 ή > 5 και δίνεται κατάλληλο μήνυμα.
 * @author A.Polymeros
 */

public class MenuIfApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(true){
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. 'Εξοδος");

            choice = sc.nextInt();

            if (choice < 1 || choice > 5){
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice == 5){
                System.out.println("Ευχαριστύμε");
                break;
            }

            if (choice == 1){
                System.out.println("Η εισαγωγή έγινε επιτυχώς");
            } else if (choice == 2){
                System.out.println("Η εισαγωγή έγινε επιτυχώς");
            }else if (choice == 3){
                System.out.println("Η διαγραφή έγινε επιτυχώς");
            } else{
                System.out.println("Η αναζήτηαη έγινε επιτυχώς");
            }
        }
    }
}
