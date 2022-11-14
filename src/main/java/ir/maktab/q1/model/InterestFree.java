package ir.maktab.q1.model;
//gharz al_hasane

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InterestFree extends BankAccount {
    boolean interestFree;
}
