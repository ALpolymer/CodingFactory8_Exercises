package gr.aueb.cf.ch5;
import java.util.Scanner;

/**
 * Η κλάση Square παρέχει λειτουργικότητα για τον υπολογισμό του τετραγώνου ενός αριθμού.
 * Η εφαρμογή ζητά από τον χρήστη έναν ακέραιο αριθμό και στη συνέχεια υπολογίζει και
 * εμφανίζει το τετράγωνο αυτού του αριθμού
 * Ο υπολογισμός γίνεται με τον πολλαπλασιασμό του αριθμού με τον εαυτό του.
 *
 * @author A.POLYMEROS
 * @version 1.0
 */
public class Square {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Η κύρια μέθοδος της εφαρμογής. Προτρέπει τον χρήστη να εισάγει έναν ακέραιο αριθμό,
     * λαμβάνει την είσοδο και καλεί τη μέθοδο square για τον υπολογισμό και την εμφάνιση
     * του τετραγώνου του αριθμού.
     *
     * @param args Παράμετροι γραμμής εντολών (δεν χρησιμοποιούνται)
     */
    public static void main(String[] args) {
        int intNumber = 0;
        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό:");
        intNumber = getOneInt();

        square(intNumber);

    }

    /**
     * Διαβάζει και επιστρέφει έναν ακέραιο αριθμό από την είσοδο του χρήστη.
     *
     * @return Ο ακέραιος αριθμός που εισήγαγε ο χρήστης
     */
    public static int getOneInt(){
        return scanner.nextInt();
    }

    /**
     * Υπολογίζει το τετράγωνο ενός ακέραιου αριθμού και εμφανίζει το αποτέλεσμα.
     * Ο υπολογισμός γίνεται πολλαπλασιάζοντας τον αριθμό με τον εαυτό του.
     *
     * @param intNumber Ο ακέραιος αριθμός για τον οποίο θα υπολογιστεί το τετράγωνο
     */
    public static void square(int intNumber){
        int square = intNumber * intNumber;
        System.out.printf("Το τετράγωνο του %d είναι: %d", intNumber, square);
    }
}
