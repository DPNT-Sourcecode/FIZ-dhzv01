package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String value = "";
        if (number%3 == 0 || String.valueOf(number).contains("3")){
            value = "fizz";
        }
        if (number%5 == 0  || String.valueOf(number).contains("5")){
            if (!value.equals("")){
                value += " ";
            }
            value += "buzz";
        }
        else if (value.equals("")/*number%3 != 0 && !String.valueOf(number).contains("3")*/){
            value = String.valueOf(number);
        }
        return value;
    }

}
