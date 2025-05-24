package gr.aueb.cf.ch3;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα έτος (τετραψήφιο ακέραιο)
 * Η εφαρμογή ελέγχει αν το έτος είναι δίσεκτο ή όχι και τυπώνει στην κονσόλα το αποτέλεσμα
 * @author Alexandros Polymeros
 */

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        boolean isLeapYear;

        System.out.println("Δώσε ένα έτος:");
        year = sc.nextInt();

        isLeapYear = (year%4 == 0 && year%100 != 0) || year%400 == 0;

        if (isLeapYear) {
            System.out.printf("Το έτος %d είναι δίσεκτο" , year);
        } else {
            System.out.printf("Το έτος %d δεν είναι δίσεκτο" , year);
        }
    }
}
