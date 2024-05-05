package org.example.textoInfinito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TextoInfinitoTest {
    @InjectMocks
    private TextoInfinito textoInfinito;

    @Test
    void name() {
        long countA = textoInfinito.repeatedString("aba", "10");
        assertEquals(7, countA);
    }
    @Test
    void test2() {
        long countA = textoInfinito.repeatedString("a", "1000000000000");
        System.out.println(countA);
        assertEquals(new BigInteger("1000000000000"),new BigInteger(String.valueOf(countA)) );
    }
}