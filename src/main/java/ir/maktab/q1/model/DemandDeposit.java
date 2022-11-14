package ir.maktab.q1.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

//seporde kootah moddat
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DemandDeposit extends BankAccount {
    boolean demandDeposit;
}
