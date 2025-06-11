package gr.aueb.cf.BankApp.dao;

import gr.aueb.cf.BankApp.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO{
    private final List<Account> accounts = new ArrayList<>();

    @Override
    public void saveOrUpdate(Account account) {
        accounts.add(account);
    }

    @Override
    public void remove(String iban) {

    }

    @Override
    public Optional<Account> getByIban(String iban) {
        return Optional.empty();
    }

    @Override
    public List<Account> getAccounts() {
        return List.of();
    }
}
