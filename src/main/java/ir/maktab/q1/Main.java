package ir.maktab.q1;

import ir.maktab.q1.model.CurrentAccount;
import ir.maktab.q1.service.CurrentAccountService;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        CurrentAccount currentAccount = new CurrentAccount("123", "123"
                , new Date(), 120l, new Date(), true);


        CurrentAccountService currentAccountService = new CurrentAccountService();
        currentAccountService.create(currentAccount);
        currentAccountService.update(currentAccount);
        currentAccountService.delete(currentAccount);


    }
}
