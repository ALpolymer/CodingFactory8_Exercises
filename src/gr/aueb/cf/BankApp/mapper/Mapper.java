package gr.aueb.cf.BankApp.mapper;

import gr.aueb.cf.BankApp.dto.AccountInsertDTO;
import gr.aueb.cf.BankApp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.BankApp.model.Account;

import java.util.Map;

public class Mapper {

    private Mapper(){

    }

    public static Account mapToModelEntity(AccountInsertDTO dto){
        return new Account(dto.getIban(), dto.getBalance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDTO(Account account){
        return new AccountReadOnlyDTO(account.getIban(), account.getBalance());
    }
}
