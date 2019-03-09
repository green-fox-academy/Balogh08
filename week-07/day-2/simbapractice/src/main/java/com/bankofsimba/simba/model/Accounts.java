package com.bankofsimba.simba.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Accounts {
    private List<BankAccount> accounts;

    public Accounts() {
        accounts = new ArrayList<>();

        BankAccount account1 = new BankAccount("Simba", "lion");
        BankAccount account2 = new BankAccount("Mufasa", "monkey");
        BankAccount account3 = new BankAccount("Timon", "small something");
        BankAccount account4 = new BankAccount("Pumba", "boar");
        BankAccount account5 = new BankAccount("Sssss", "snake");

        account1.setKing(true);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
