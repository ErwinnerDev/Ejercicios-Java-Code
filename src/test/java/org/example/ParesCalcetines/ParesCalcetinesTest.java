package org.example.ParesCalcetines;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ParesCalcetinesTest {

    @InjectMocks
    ParesCalcetines service;

    @Test
    void busscarPares() {
        int pares = service.sockMerchant(9, Arrays.asList(10, 10, 20, 20, 10, 10, 30, 50, 20));
        System.out.println("Pares de calcetas: "+pares);
        assertEquals(3, pares);
    }
}