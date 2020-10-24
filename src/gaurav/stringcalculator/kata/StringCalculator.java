package gaurav.stringcalculator.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringCalculator {

    public StringCalculator() {
    }

    public int add(String input) {
        if(input.isEmpty())
            return 0;
        else if(input.length()==1)
            return convert2int(input);

        String[] strings = split(input);
        return getSum(strings);
    }

    public String[] split(String input){
        if(input.startsWith("//")){
            return separateCustomDelimiters(input);
        }
        return input.split(",|\n");
    }
    private String[] separateCustomDelimiters(String input) throws PatternSyntaxException {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        matcher.matches();
        String customDelimiters = matcher.group(1);
        String numbers = matcher.group(2);
        return numbers.split(customDelimiters);
    }

    private int getSum(String[] strings)  {
        int sum=0;
        for(String n:strings) {
                sum += this.convert2int(n);

        }
        return sum;
    }

    private int convert2int(String inp){
        return Integer.parseInt(inp);
    }

}
