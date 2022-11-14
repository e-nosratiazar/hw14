package ir.maktab.q1.service;

import ir.maktab.q1.model.BankAccount;
import ir.maktab.q1.repository.CurrentAccountRepository;

public class CurrentAccountService implements BankAccountService {
    @Override
    public void create(BankAccount bankAccount) {
        CurrentAccountRepository.getInstance().create(bankAccount);
    }

    @Override
    public BankAccount read(int id) {
        return CurrentAccountRepository.getInstance().read(id);
    }

    @Override
    public void update(BankAccount bankAccount) {
        CurrentAccountRepository.getInstance().update(bankAccount);
    }

    @Override
    public void delete(BankAccount bankAccount) {
        CurrentAccountRepository.getInstance().delete(bankAccount);
    }
}
