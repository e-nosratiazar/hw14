package ir.maktab.q1.model;

import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

//hesab jari
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "bank_account_id")

public class CurrentAccount extends BankAccount {

    boolean currentAccount;

    public CurrentAccount() {
    }

    public CurrentAccount(String accountNumber, String bankCardNumber, Date date
            , long balance, Date expirationDate, boolean currentAccount) {
        super(accountNumber, bankCardNumber, date, balance, expirationDate);
        this.currentAccount = currentAccount;
    }
}
