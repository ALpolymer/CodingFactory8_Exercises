package gr.aueb.cf.ch5;
import java.util.Scanner;

/**
 * Η κλάση StarsMethodsApp παρουσιάζει διάφορα μοτίβα αστερίσκων στην κονσόλα.
 * Επιτρέπει στον χρήστη να επιλέξει ένα από τα έξι διαφορετικά μοτίβα και να καθορίσει
 * τον αριθμό των αστερίσκων που θα εμφανιστούν. Η εφαρμογή λειτουργεί μέσω ενός μενού
 * επιλογών που επαναλαμβάνεται έως ότου ο χρήστης επιλέξει έξοδο.
 *
 * Τα διαθέσιμα μοτίβα περιλαμβάνουν:
 * 1. Οριζόντια εμφάνιση αστερίσκων
 * 2. Κάθετη εμφάνιση αστερίσκων
 * 3. Ορθογώνιο μοτίβο αστερίσκων
 * 4. Αύξον τριγωνικό μοτίβο αστερίσκων
 * 5. Φθίνον τριγωνικό μοτίβο αστερίσκων
 *
 * @author A.POLYMEROS
 * @version 1.0
 */
public class StarsMethodsApp {
   static Scanner scanner = new Scanner(System.in);

    /**
     * Η κύρια μέθοδος που εκτελεί το πρόγραμμα. Εμφανίζει το μενού επιλογών,
     * λαμβάνει την επιλογή του χρήστη, επικυρώνει την επιλογή και εκτελεί την
     * αντίστοιχη λειτουργία εμφάνισης αστερίσκων.
     *
     * @param args Παράμετροι
     */
    public static void main(String[] args) {
        int numberOfStars;
        int choice;

        while (true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή.Η επιλογή πρέπει να είναι από 1-6");
                continue;
            }

            if (choice == 6) {
                System.out.println("'Εξοδος...");
                break;
            }

            starsNumberInput();
            numberOfStars = getOneInt();

            execChoice(choice , numberOfStars);
        }
    }

    /**
     * Εμφανίζει προτροπή για την εισαγωγή του αριθμού των αστερίσκων.
     */
    public static void starsNumberInput(){
        System.out.println("Παρακαλώ δώστε τον αριθμό από τα αστεράκια που θα εμφανιστούν:");
    }

    /**
     * Εμφανίζει το μενού επιλογών για τα διαθέσιμα μοτίβα αστερίσκων.
     */
    public static void printMenu(){
        System.out.println("\nΕπιλέξτε ένα από τα παρακάτω μοτίβα:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος");
    }


    /**
     * Εκτελεί την επιλεγμένη λειτουργία εμφάνισης αστερίσκων βάσει της επιλογής του χρήστη.
     *
     * @param choice Η επιλογή του χρήστη (1-5)
     * @param numberOfStars Ο αριθμός των αστερίσκων που θα εμφανιστούν
     */
    public static void execChoice(int choice , int numberOfStars){
        switch (choice){
            case 1 -> starsHorizontal(1,numberOfStars);
            case 2 -> starsVertical(numberOfStars);
            case 3 -> starsVH(numberOfStars);
            case 4-> starsAsc(numberOfStars);
            case 5 -> starsDesc(numberOfStars);
            default -> System.out.println("Error in choice");
        }
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
     * Ελέγχει αν η επιλογή του χρήστη είναι έγκυρη (1-6).
     *
     * @param choice Η επιλογή του χρήστη
     * @return true εάν η επιλογή είναι έγκυρη, false διαφορετικά
     */
    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <= 6;
    }


    /**
     * Εμφανίζει έναν καθορισμένο αριθμό αστερίσκων οριζόντια (σε μία γραμμή).
     *
     * @param start Η αρχική τιμή για το μετρητή επανάληψης
     * @param numberOfStars Ο αριθμός των αστερίσκων που θα εμφανιστούν
     */
    public static void starsHorizontal(int start, int numberOfStars){
        for (int i = start; i <= numberOfStars ; i++) {
            System.out.print("*");
        }
    }


    /**
     * Εμφανίζει έναν καθορισμένο αριθμό αστερίσκων κάθετα (ένα αστερίσκο ανά γραμμή).
     *
     * @param numberOfStars Ο αριθμός των αστερίσκων που θα εμφανιστούν
     */
    public static void starsVertical(int numberOfStars){
        for (int i = 1; i <= numberOfStars ; i++) {
            System.out.println("*");
        }
    }


    /**
     * Εμφανίζει ένα ορθογώνιο μοτίβο αστερίσκων με n γραμμές και n αστερίσκους ανά γραμμή.
     *
     * @param numberOfStars Ο αριθμός των γραμμών και των αστερίσκων ανά γραμμή
     */
    public static void starsVH(int numberOfStars){
        for (int i = 1; i <= numberOfStars; i++) {
            starsHorizontal(1, numberOfStars);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει ένα αύξον τριγωνικό μοτίβο αστερίσκων, όπου κάθε γραμμή i
     * περιέχει i αστερίσκους (1 έως n).
     *
     * @param numberOfStars Ο συνολικός αριθμός γραμμών του τριγώνου
     */
    public static void starsAsc(int numberOfStars){
        for (int i = 1; i <= numberOfStars ; i++) {
            starsHorizontal(1,i);
            System.out.println();
        }
    }

    /**
     * Εμφανίζει ένα φθίνον τριγωνικό μοτίβο αστερίσκων, όπου η πρώτη γραμμή
     * περιέχει n-0 αστερίσκους, η δεύτερη n-1 αστερίσκους κ.ο.κ.
     *
     * @param numberOfStars Ο συνολικός αριθμός γραμμών του τριγώνου
     */
    public static void starsDesc(int numberOfStars){
        for (int i = 1; i <= numberOfStars ; i++) {
            starsHorizontal(i , numberOfStars);
            System.out.println();
        }
    }
}
