package ir.maktab.q1.repository;

import ir.maktab.q1.model.BankAccount;

public interface BankAccountRepository {
    public void create(BankAccount bankAccount);

    public BankAccount read(int id);

    public void update(BankAccount bankAccount);

    public void delete(BankAccount bankAccount);
}
