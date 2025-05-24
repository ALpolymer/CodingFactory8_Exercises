package gr.aueb.cf.ch4;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο αριθμό(n) και το πρόγραμμα τυπώνει
 * n σειρές αστεράκια με την κάθε σειρά να περιέχει από n εώς 1 αστεράκια.
 * Δηλαδή η 1η σειρα θα έχει n αστεράκια , η 2η σειρά n-1 αστεράκια ... , η νιοστή σειρά 1 αστεράκι.
 * @author A.Polymeros
 */
public class StarsDesc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Παρακαλώ δώστε έναν ακέραιο αριθμό:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
