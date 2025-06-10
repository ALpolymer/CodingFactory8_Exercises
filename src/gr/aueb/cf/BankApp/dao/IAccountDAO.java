package gr.aueb.cf.BankApp.dao;

import gr.aueb.cf.BankApp.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    void saveOrUpdate(Account account);
    void remove(String iban);

    Optional<Account> getByIban(String iban);
    List<Account> getAccounts();
}
