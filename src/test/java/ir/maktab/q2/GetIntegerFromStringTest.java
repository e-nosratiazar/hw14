package ir.maktab.q2;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class GetIntegerFromStringTest {

    @SneakyThrows
    @Test
    void convertStringToInteger() {
        Assertions.assertEquals(23, Main.getIntegerFromString("23"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"32768", "-32768"})
    void outOfRangTest(String v) {
        OutOfRangException outOfRangException =
                Assertions.assertThrows(OutOfRangException.class
                        , () -> Main.getIntegerFromString(v));

        Assertions.assertEquals("integer is out of rang", outOfRangException.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"3e", "49!", "@d$"})
    void invalidInputTest(String v) {
        InvalidInputException invalidInputException =
                Assertions.assertThrows(InvalidInputException.class
                        , () -> Main.getIntegerFromString(v));

        Assertions.assertEquals("invalid input", invalidInputException.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"23 4", " 4", "45 "})
    void invalidInputByWhitSpace(String v) {
        InvalidInputException invalidInputException =
                Assertions.assertThrows(InvalidInputException.class
                        , () -> Main.getIntegerFromString(v));

        Assertions.assertEquals("invalid input with whitespace", invalidInputException.getMessage());
    }
}