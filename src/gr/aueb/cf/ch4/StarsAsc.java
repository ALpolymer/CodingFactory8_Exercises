package gr.aueb.cf.ch4;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο αριθμό(n) και το πρόγραμμα τυπώνει
 * n σειρές αστεράκια με την κάθε σειρά να περιέχει από 1 εώς n αστεράκια.
 * Δηλαδή η 1η σειρα θα έχει 1 αστεράκι , η 2η σειρά 2 αστεράκια ... , η νιοστή σειρά n αστεράκια.
 * @author A.Polymeros
 */
public class StarsAsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Παρακαλώ δώστε έναν ακέραιο αριθμό:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
