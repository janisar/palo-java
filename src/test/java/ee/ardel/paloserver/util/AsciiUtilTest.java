package ee.ardel.paloserver.util;

import org.junit.Test;

import static ee.ardel.paloserver.util.AsciiUtil.*;
import static org.junit.Assert.assertEquals;

public class AsciiUtilTest {

    @Test
    public void shouldCalculateStringsSumOfAscii() {
        String name = "AA";
        assertEquals(130, calculateStringAsciiSum(name));
    }
}