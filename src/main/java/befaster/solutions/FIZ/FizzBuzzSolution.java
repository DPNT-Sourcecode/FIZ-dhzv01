package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String value = "";
        if (number%3 == 0 || String.valueOf(number).contains("3")){
            value = "fizz";
        }
        if (number%5 == 0  || String.valueOf(number).contains("5")){
            if (number%3 == 0 || String.valueOf(number).contains("3")){
                value += " ";
            }
            value += "buzz";
        }
        else if (number%3 != 0){
            value = String.valueOf(number);
        }
        return value;
    }

}
