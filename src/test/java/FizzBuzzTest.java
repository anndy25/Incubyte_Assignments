import org.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzbuzz=new FizzBuzz();
    /* Activity No. 1:
                1) Write a program that prints the numbers from 1 to 100
                2) for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
                3) For numbers which are multiples of both three and five print “FizzBuzz “
     */

    // TODO:-   It should return number if given number is not either divisble by 3 or 5
    @Test
    void shouldReturnedGivenNumberOnly() {


        assertEquals("2",fizzbuzz.converter(2));
        assertEquals("17",fizzbuzz.converter(17));
        assertEquals("14",fizzbuzz.converter(14));
    }

    // TODO:- If should return "Fizz" if given number is only divible by 3;
    @Test
    void shouldReturnedFizzString(){
        assertEquals("Fizz",fizzbuzz.converter(3));
        assertEquals("Fizz",fizzbuzz.converter(9));
        assertEquals("Fizz",fizzbuzz.converter(18));
    }

    // TODO:- If should return "Fizz" if given number is only divible by 5;
    @Test
    void shouldReturnedBuzzString(){
        assertEquals("Buzz",fizzbuzz.converter(5));
        assertEquals("Buzz",fizzbuzz.converter(10));
        assertEquals("Buzz",fizzbuzz.converter(20));
    }
    // TODO:- If should return "FizzBuzz" if given number is  divible by 3 and 5;
    @Test
    void shouldReturnedFizzBuzzString(){
        assertEquals("FizzBuzz",fizzbuzz.converter(15));
        assertEquals("FizzBuzz",fizzbuzz.converter(30));
        assertEquals("FizzBuzz",fizzbuzz.converter(60));
    }
}