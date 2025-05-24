package gr.aueb.cf.ch4;
import java.util.Scanner;

/**
 * Απλή αριθμομηχανή που εκτελεί τις τέσσερις βασικές αριθμητικές πράξεις
 * Διαβάζει δύο αριθμούς και μια πράξη (+, -, *, /) από τον χρήστη
 * Ελέγχει για διαίρεση με μηδέν και μη έγκυρες πράξεις
 * Εμφανίζει κατάλληλα μηνύματα για τα σφάλματα και το αποτέλεσμα
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        char operation;
        double result;

        System.out.println("Παρακαλώ δώστε τον πρώτο αριθμό:");
         num1 = scanner.nextInt();


        System.out.println("Παρακαλώ δώστε το σύμβολο της πράξης(+, -, *, /):");
        operation = scanner.next().charAt(0);

        System.out.println("Παρακαλώ δώστε τον δεύτερο αριθμό:");
        num2 = scanner.nextInt();


        if(operation == '/' && num2 == 0 ){
            System.out.println("Δεν ορίζεται διαίρεση με διαιρέτη το 0");
            System.exit(0);
        }

        if(operation != '+' && operation != '-'  && operation != '*' && operation != '/' ){
            System.out.println("Μη έγκυρη πράξη. Παρακαλώ χρησιμοποιήστε +, -, *, ή /");
            System.exit(0);
        }

        switch (operation){
            case '+'-> {
                result = num1 + num2;
                System.out.println("Το αποτέλεσμα είναι: " + result);
            }
            case '-'-> {
                result = num1 - num2;
                System.out.println("Το αποτέλεσμα είναι: " + result);
            }
            case '*'-> {
                result = num1 * num2;
                System.out.println("Το αποτέλεσμα είναι: " + result);
            }
            case '/'-> {
                result = num1 / num2;
                System.out.println("Το αποτέλεσμα είναι: " + result);
            }
        }
    }
}
