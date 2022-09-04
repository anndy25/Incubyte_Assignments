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

    // TODO:- It should return "Fizz" if given number is only divible by 3;
    @Test
    void shouldReturnedFizzString(){
        assertEquals("Fizz",fizzbuzz.converter(9));
        assertEquals("Fizz",fizzbuzz.converter(18));
    }

    // TODO:- It should return "Fizz" if given number is only divible by 5;
    @Test
    void shouldReturnedBuzzString(){
        assertEquals("Buzz",fizzbuzz.converter(10));
        assertEquals("Buzz",fizzbuzz.converter(20));
    }
    // TODO:- It should return "FizzBuzz" if given number is  divible by 3 and 5;
    @Test
    void shouldReturnedFizzBuzzString(){
        assertEquals("FizzBuzz",fizzbuzz.converter(90));
        assertEquals("FizzBuzz",fizzbuzz.converter(60));
    }

     /* Activity No. 2:
                1)53 should return FizzBuzz (contain 5 and 3)
                2)35 should return FizzBuzzBuzz (contain 3 and 5 and it divided by 5)
     */

    //TODO:- It should return "Fizz" If given number contain only 3
    @Test
    void shouldReturnFizzIfNumberContainThree(){
        assertEquals("Fizz",fizzbuzz.converter(31));
        assertEquals("Fizz",fizzbuzz.converter(13));
    }
    //TODO:- It should return "Buzz" if given number contain only  5
    @Test
    void shouldReturnBuzzIfNumberContainFive(){
        assertEquals("Buzz",fizzbuzz.converter(58));
        assertEquals("BuzzBuzz",fizzbuzz.converter(55));
    }

    //TODO:- It should return "FizzBuzz" if given number contain 3 ans 5
    @Test
    void shouldReturnedFizzBuzzIfContainThreeAndFive(){
        assertEquals("FizzBuzzBuzz",fizzbuzz.converter(35));
        assertEquals("FizzBuzz",fizzbuzz.converter(53));
    }



}