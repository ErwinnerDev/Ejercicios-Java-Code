package org.example.juegoNubes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class JuegoNubesTest {

    @InjectMocks
    JuegoNubes juegoNubes;

    @Test
    void juesgoNubesTest(){
        int i = juegoNubes.jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
        assertEquals(4, i);
    }

    @Test
    void juesgoNubesTest2(){
        int i = juegoNubes.jumpingOnClouds(Arrays.asList(0,0,0,0,1,0));
        assertEquals(3, i);
    }
}