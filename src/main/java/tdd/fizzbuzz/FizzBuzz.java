package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int number) {
        if(number%3 == 0 && number%5 == 0){
            return "FizzBizz";
        }
        if(number%3 == 0 && number%7 == 0){
            return "FizzWhizz";
        }
        else if(number%3 == 0){
            return "Fizz";
        } else if (number%5 == 0){
            return "Bizz";
        } else if (number%7 == 0){
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
