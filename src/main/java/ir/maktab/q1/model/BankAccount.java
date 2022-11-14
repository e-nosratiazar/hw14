package ir.maktab.q1.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
public class BankAccount {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String accountNumber;
    String bankCardNumber; // 16 digit
    Date date;
    long balance;
    int cvv2;
    Date expirationDate;


    public BankAccount() {
    }

    public BankAccount(String accountNumber, String bankCardNumber, Date date, long balance, Date expirationDate) {
        this.accountNumber = accountNumber;
        this.bankCardNumber = bankCardNumber;
        this.date = date;
        this.balance = balance;
        this.cvv2 = new Random().nextInt();
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return id == that.id && balance == that.balance && cvv2 == that.cvv2 && accountNumber.equals(that.accountNumber) && bankCardNumber.equals(that.bankCardNumber) && date.equals(that.date) && expirationDate.equals(that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, bankCardNumber, date, balance, cvv2, expirationDate);
    }
}
