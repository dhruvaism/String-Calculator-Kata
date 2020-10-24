package gaurav.stringcalculator.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTestCase {

    StringCalculator sCalculator;

    public StringCalculatorTestCase() {
        this.sCalculator = new StringCalculator();
    }

    @Test
    public void isEmptyString(){
        Assertions.assertEquals(0, this.sCalculator.add(""));
    }

}
