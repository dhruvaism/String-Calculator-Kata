package gaurav.stringcalculator.kata;

public class StringCalculator {

    public StringCalculator() {
    }

    public int add(String input) {
        if(input.isEmpty())
            return 0;
        else if(input.length()==1)
            return convert2int(input);

        return -1;
    }

    private int convert2int(String inp){
        return Integer.parseInt(inp);
    }

}
