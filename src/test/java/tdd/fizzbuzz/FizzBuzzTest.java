package tdd.fizzbuzz;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_normal_number_when_countOff_given_normal_number(){
        int num = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(num);

        assertThat(result).isEqualTo("1");
    }

    @Test
    public void should_return_Fizz_when_countOff_given_number_is_multiplication_of_three(){
        int num = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(num);

        assertThat(result).isEqualTo("Fizz");
    }


}
