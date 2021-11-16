package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersTest {
    @Test
    void testPerfectNumber(){
        PerfectNumbers numbers = new PerfectNumbers();
        assertTrue(numbers.isPerfectNumber(6));
        assertTrue(numbers.isPerfectNumber(8128));
        assertFalse(numbers.isPerfectNumber(7246));
        assertFalse(numbers.isPerfectNumber(9));
    }
}
