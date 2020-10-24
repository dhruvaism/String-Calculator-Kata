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

    @Test
    public void isSingleString() {
        Assertions.assertEquals(1, this.sCalculator.add("1"));
    }

    @Test
    public void delimitersSeparatedTwo()  {
        Assertions.assertEquals(3, this.sCalculator.add("1,2"));
    }

    @Test
    public void delimitersSeparatedMoreThanTwo()  {
        Assertions.assertEquals(6, this.sCalculator.add("1,2,3"));
    }

    @Test
    public void NewLineDelimitedString()  {
        Assertions.assertEquals(10, this.sCalculator.add("1\n2,3,4"));
    }

    @Test
    public void supportDifferentDelimiters() {
        Assertions.assertEquals(3, this.sCalculator.add("//;\n1;2"));
    }

}
