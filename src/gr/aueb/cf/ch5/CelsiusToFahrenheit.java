package gr.aueb.cf.ch5;
import java.util.Scanner;

/**
 * Η κλάση CelsiusToFahrenheit υλοποιεί έναν μετατροπέα θερμοκρασίας από βαθμούς Κελσίου
 * σε βαθμούς Φαρενάιτ (Fahrenheit). Η εφαρμογή προτρέπει τον χρήστη να εισάγει μια τιμή
 * θερμοκρασίας σε βαθμούς Κελσίου και στη συνέχεια μετατρέπει και εμφανίζει την αντίστοιχη
 * τιμή σε βαθμούς Φαρενάιτ.
 *
 * Η μετατροπή βασίζεται στον τύπο: F = (9/5) × C + 32, όπου:
 * F = θερμοκρασία σε βαθμούς Φαρενάιτ
 * C = θερμοκρασία σε βαθμούς Κελσίου
 *
 * @author A.POLYNEROS
 * @version 1.0
 */
public class CelsiusToFahrenheit {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Η κύρια μέθοδος της εφαρμογής. Προτρέπει τον χρήστη να εισάγει τη θερμοκρασία
     * σε βαθμούς Κελσίου, λαμβάνει την είσοδο και καλεί τη μέθοδο μετατροπής για την
     * εμφάνιση του αποτελέσματος.
     *
     * @param args Παράμετροι γραμμής εντολών (δεν χρησιμοποιούνται)
     */
    public static void main(String[] args) {
        double tempInCelsius = 0.0;
        System.out.println("Παρακάλώ εισάγετε τη θερμοκρασία σε βαθμούς Κελσίου ως δεκαδικό αριθμό:");

        tempInCelsius = getOneDouble();

        celsiusToFahrenheit(tempInCelsius);
    }

    /**
     * Διαβάζει και επιστρέφει έναν double αριθμό από την είσοδο του χρήστη.
     *
     * @return Ο double αριθμός που εισήγαγε ο χρήστης.
     */
    public static double getOneDouble(){
        return scanner.nextDouble();
    }

    /**
     * Μετατρέπει τη θερμοκρασία που έδωσε ο χρήστης σε βαθμούς Κελσίου
     * σε βαθμούς Fahrenheit και εκτυπώνει το αποτέλεσμα.
     * Χρησιμοποιεί τον τύπο μετατροπής: F = (9/5) × C + 32
     *
     * @param tempInCelsius Η θερμοκρασία σε βαθμούς Κελσίου προς μετατροπή.
     */
    public static void celsiusToFahrenheit(double tempInCelsius){
        double tempInFahrenheit = ((9.0 /5)*tempInCelsius + 32);

        System.out.printf("Η θερμοκρασία %-5.2f βαθμούς Κελσίου είναι: %5.2f βαθμούς Fahrenheit", tempInCelsius, tempInFahrenheit );
    }
}
