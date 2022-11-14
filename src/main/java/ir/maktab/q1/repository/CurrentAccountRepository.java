package ir.maktab.q1.repository;

import ir.maktab.q1.model.BankAccount;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CurrentAccountRepository implements BankAccountRepository {

    static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    private static CurrentAccountRepository instance;

    private CurrentAccountRepository() {
    }

    public static CurrentAccountRepository getInstance() {
        if (instance == null) {
            instance = new CurrentAccountRepository();
        }
        return instance;
    }

    @Override
    public void create(BankAccount currentAccount) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(currentAccount);
        transaction.commit();
        session.close();
    }

    @Override
    public BankAccount read(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        BankAccount currentAccount = session.get(BankAccount.class, id);
        transaction.commit();
        session.close();
        return currentAccount;
    }

    @Override
    public void update(BankAccount currentAccount) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(currentAccount);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(BankAccount currentAccount) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(currentAccount);
        transaction.commit();
        session.close();
    }
}
