package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 500.0;
    static boolean exit = false;
    public static void main(String[] args) {

        while (!exit){
         int choice = showMenu();
         choiceAction(choice);
        }
    }

    public static int showMenu (){
        int choice;
        System.out.println("\nΕπιλέξτε ενέργεια:");
        System.out.println("1. Κατάθεση");
        System.out.println("2. Ανάληψη");
        System.out.println("3. Προβολή υπολοίπου");
        System.out.println("4. Έξοδος");
        System.out.print("Επιλογή: ");

        choice = scanner.nextInt();

        return choice;
    }

    public static void choiceAction(int choice){
        double amount;
            switch (choice) {
                case 1 -> {
                    System.out.println("Εισάγετε το ποσό κατάθεσης:");
                    amount = scanner.nextDouble();
                    deposit(amount);
                }
                case 2 -> {
                    System.out.println("Εισάγετε το ποσό ανάληψης:");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                }
                case 3 -> showBalance(balance);

                case 4 -> {
                    exit = true;
                    System.out.println("Έξοδος από το πρόγραμμα. Ευχαριστούμε!");
                }
                default -> System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
            }
        }

        public static void deposit(double amount) {
            if(amount <= 0){
                System.out.println("To ποσό ανάληψηε πρέπει να είναι θετικός αριθμός");
                return;
            }
            balance += amount;
            System.out.printf("Η κατάθεση των %f€ έγινε με επιτυχία" , amount);
        }

        public static void withdraw(double amount) {
            if(amount <= 0){
                System.out.println("To ποσό ανάληψηε πρέπει να είναι θετικός αριθμός");
            }
            else if(balance < amount){
                System.out.println("Μη επαρκές υπόλοιπο");
            } else {
                balance -= amount;
                System.out.printf("Η ανάληψη των %f€ έγινε με επιτυχία" , amount);
            }
        }

        public static void showBalance(double balance){
            System.out.println("Τρέχον υπόλοιπο: " + balance + "€");
        }
}
