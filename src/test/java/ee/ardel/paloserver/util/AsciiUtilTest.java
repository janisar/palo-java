package ee.ardel.paloserver.util;

import org.junit.Test;

import static ee.ardel.paloserver.util.AsciiUtil.*;
import static org.junit.Assert.assertEquals;

public class AsciiUtilTest {

    @Test
    public void shouldConvert2ToBinary() {
        assertEquals(intToBinaryString(2), "10");
    }

    @Test
    public void shouldConvert100ToBinary() {
        assertEquals(intToBinaryString(100), "1100100");
    }

    @Test
    public void shouldCalculateConsecutiveZeros() {
        assertEquals(countMaxConsecutiveZeros("10011110110"), 2);
    }

    @Test
    public void shouldCalculateConsecutiveZerosWhenBinaryEndsWithZeros() {
        assertEquals(countMaxConsecutiveZeros("10000000"), 7);
    }

    @Test
    public void shouldCalculateStringsSumOfAscii() {
        String name = "AA";
        assertEquals(130, calculateStringAsciiSum(name));
    }
}