package ir.maktab.q1.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//seporde boland moddat
public class TimeDeposit extends BankAccount {
    boolean timeDeposit;
}
