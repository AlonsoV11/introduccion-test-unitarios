package es.fpsumma.dam1.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

        @Test
        void testSuma() {
            assertEquals(5, NumberUtils.suma(2, 3));
        }

        @Test
        void testIsEven() {
            assertTrue(NumberUtils.isEven(4));
            assertFalse(NumberUtils.isEven(5));
        }

        @Test
        void testMax() {
            assertEquals(10, NumberUtils.max(10, 5));
        }

        @Test
        void testSumArray() {
            int[] nums = {1, 2, 3};
            assertEquals(6, NumberUtils.sumArray(nums));
        }

        @Test
        void testCountEven() {
            int[] nums = {1, 2, 4, 5};
            assertEquals(2, NumberUtils.countEven(nums));
        }

        @Test
        void testReverse() {
            int[] nums = {1, 2, 3};
            int[] esperado = {3, 2, 1};
            assertArrayEquals(esperado, NumberUtils.reverse(nums));
        }
    }
