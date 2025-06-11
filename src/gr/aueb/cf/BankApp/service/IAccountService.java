package gr.aueb.cf.BankApp.service;

import gr.aueb.cf.BankApp.dto.AccountInsertDTO;
import gr.aueb.cf.BankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.BankApp.exceptions.AccountNotFoundException;
import gr.aueb.cf.BankApp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.BankApp.exceptions.NegativeAmountException;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    boolean createNewAccount(AccountInsertDTO dto);
    void deposit (String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException;
    void withdraw (String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException, InsufficientBalanceException;
    BigDecimal getBalance(String iban);
    List<AccountReadOnlyDTO> getAccounts();
}
