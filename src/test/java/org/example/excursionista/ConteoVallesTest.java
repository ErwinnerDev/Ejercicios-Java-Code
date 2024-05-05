package org.example.excursionista;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConteoVallesTest {
    
    @InjectMocks
    ConteoValles conteoValles;

    @Test
    void countVallys() {
        int valles = conteoValles.countingValleys(8, "UDDDUDUU");
        assertEquals(1,valles);
    }
}