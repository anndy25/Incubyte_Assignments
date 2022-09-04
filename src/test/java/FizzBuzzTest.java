import org.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void game() {

        FizzBuzz fizzbuzz=new FizzBuzz();
        assertEquals("2",fizzbuzz.converter(2));

    }
}