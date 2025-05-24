package gr.aueb.cf.ch4;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο αριθμό(n) και το πρόγραμμα τυπώνει
 * n αστεράκια σε οριζόντια διάταξη.
 * @author A.Polymeros
 */
public class StarsHorizontal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Παρακαλώ δώστε έναν ακέραιο αριθμό:");
        n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.print("*");
        }
    }
}
