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

        if ((number % 5 == 0 && String.valueOf(number).contains("5"))
                || (number % 3 == 0 || String.valueOf(number).contains("3"))) {
            String deluxe = "deluxe";
            if (!value.equals("") && !deluxe.equals("")) {
                value += " ";
            }
            if (number % 2 != 0 && !deluxe.equals("")) {
                deluxe = "fake ".concat(deluxe);
            }
            value += deluxe;
        }
        if (value.equals("")/*number%3 != 0 && !String.valueOf(number).contains("3")*/){
            value = String.valueOf(number);
        }
        return value;
    }

}
