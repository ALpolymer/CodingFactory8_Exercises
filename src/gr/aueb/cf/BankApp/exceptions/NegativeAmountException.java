package gr.aueb.cf.BankApp.exceptions;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(String message){
        super(message);
    }
}
