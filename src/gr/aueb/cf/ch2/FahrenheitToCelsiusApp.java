package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * @author Alexandros Polymeros
 * Ο χρήστης εισάγει έναν ακέραιο αριθμό που είναι η θερμοκρασία σε βαθμούς Φάρεναιτ.
 * Η εφαρμογή μετατρέπει τους βαθμούς Φάρεναιτ σε βαθμούς Κελσίου και
 * τυπώνει στην κονσόλα την αντίστοιχη θερμοκρασία σε βαθμούς Κελσίου ως ακέραιο αριθμό.
 */

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempInFahrenheit;
        System.out.println("Παρακαλώ εισάγετε την Θερμοκρασία σε ακέραιους Βαθμούς Fahrenheit:");
        tempInFahrenheit = sc.nextInt();
        int tempInCelsius = (int)(5*(tempInFahrenheit-32))/9;

        System.out.println("Οι "+ tempInFahrenheit + " βαθμοί Φάρεναιτ ειναι: "+ tempInCelsius + " βαθμοί Κελσίου");
    }
}
