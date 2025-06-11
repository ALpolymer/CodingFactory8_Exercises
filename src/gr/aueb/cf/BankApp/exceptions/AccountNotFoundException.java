package gr.aueb.cf.BankApp.exceptions;


public class AccountNotFoundException extends Exception {
   public AccountNotFoundException(String message){
    super(message);
   }
}
