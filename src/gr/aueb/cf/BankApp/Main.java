package gr.aueb.cf.BankApp;

import gr.aueb.cf.BankApp.dao.AccountDAOImpl;
import gr.aueb.cf.BankApp.dao.IAccountDAO;
import gr.aueb.cf.BankApp.dto.AccountInsertDTO;
import gr.aueb.cf.BankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.BankApp.exceptions.AccountNotFoundException;
import gr.aueb.cf.BankApp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.BankApp.exceptions.NegativeAmountException;
import gr.aueb.cf.BankApp.service.AccountServiceImpl;
import gr.aueb.cf.BankApp.service.IAccountService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService  = new AccountServiceImpl(accountDAO);
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String option;

        while (true){
            printMenu();
            option =scanner.nextLine();
            try{
                switch (option){
                    case "1":
                        System.out.println("Παρακαλώ εισάγετε το iban: ");
                        String iban = scanner.nextLine();
                        System.out.println("Παρακαλώ εισάγετε το υπόλοιπο: ");
                        BigDecimal initialBalance = new BigDecimal(scanner.nextLine());
                        AccountInsertDTO accountInsertDTO = new AccountInsertDTO(iban, initialBalance);
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    default:
                        System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά");
                }

            } catch (NegativeAmountException | InsufficientBalanceException | AccountNotFoundException e) {
                System.out.println("Λάθος " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Λάθος μορφή αριθμού. Παρακαλώ εισάγετε ένα έγκυρο ποσό");
            }

        }
    }

    public static void printMenu(){
        System.out.println("=== Account Service Menu ===");
        System.out.println("1. Εισαγωγή νέου λογαριασμού");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Ερώτηση Υπολοίπου");
        System.out.println("5. Εκτύπωαη όλων των λογαριασμών");
        System.out.println("6. Έξοδος");
        System.out.println("Εισάγετε μία επιλογή:");
    }
}
