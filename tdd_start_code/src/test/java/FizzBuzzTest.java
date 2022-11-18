import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void canReturnFizz(){
        String result = fizzBuzz.getFizzBuzz(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void canReturnBuzzz(){
        String result = fizzBuzz.getFizzBuzz(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void canReturnFizzBuzz(){
        String result = fizzBuzz.getFizzBuzz(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void returnsNumberAsStringIfDivisiblebyNeither(){
        String result = fizzBuzz.getFizzBuzz(4);
        assertThat(result).isEqualTo("4");

    }



}
