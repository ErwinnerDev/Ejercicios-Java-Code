package org.example.caracterrepeticonmayor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class RepitTest {

    @InjectMocks
    private Repit repit;

    static String expectativa;

    @BeforeEach
    void init() {
        expectativa = "La letra que más se repite es la %l con %n repeticiones";
    }

    @Test
    void test1() {
        String letraMasRepetida = repit.contarLetra("Este es un Texto");
        expectativa =expectativa.replace("%l","e").replaceAll("%n","4");
        assertEquals(expectativa,letraMasRepetida);
    }

    @Test
    void test2() {
        String letraMasRepetida = repit.contarLetra("hola hola a todos y todas");
        expectativa =expectativa.replace("%l","o").replaceAll("%n","5");
        assertEquals(expectativa,letraMasRepetida);
    }
}