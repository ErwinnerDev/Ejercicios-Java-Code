package org.example.fizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class fizzBuzzTest {

    @InjectMocks
    private FizzBuzz fizzBuzz;

    @Test
    void multepleDeCindo() {
        String result = fizzBuzz.FizzBuzz(5);
        assertEquals("Buzz",result);
    }

    @Test
    void multepleDeTres() {
        String result = fizzBuzz.FizzBuzz(3);
        assertEquals("Fizz",result);

        result = fizzBuzz.FizzBuzz(9);
        assertEquals("Fizz",result);
    }

    @Test
    void multepleDeCincoYTres() {
        String result = fizzBuzz.FizzBuzz(15);
        assertEquals("FizzBuzz",result);

        result = fizzBuzz.FizzBuzz(30);
        assertEquals("FizzBuzz",result);
    }

}