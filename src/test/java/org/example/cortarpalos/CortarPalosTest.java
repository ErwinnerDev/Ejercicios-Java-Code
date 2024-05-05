package org.example.cortarpalos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CortarPalosTest {
    @InjectMocks
    private CortarPalos cortarPalos;

    @Test
    void cortePalosTest1() {
        List<Integer> integers = cortarPalos.cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8));
        assertEquals(Arrays.asList(6,4,2,1), integers);
    }

    @Test
    void cortePalosTest2() {
        List<Integer> integers = cortarPalos.cutTheSticks(Arrays.asList(1,2,3,4,3,3,2,1));
        assertEquals(Arrays.asList(8,6,4,1), integers);
    }
}