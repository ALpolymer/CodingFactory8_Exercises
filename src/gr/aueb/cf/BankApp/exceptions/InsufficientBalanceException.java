package gr.aueb.cf.BankApp.exceptions;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message){
        super(message);
    }
}
