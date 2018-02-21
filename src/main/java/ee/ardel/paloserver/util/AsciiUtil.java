package ee.ardel.paloserver.util;

public class AsciiUtil {

    public static int calculateStringAsciiSum(String string) {
        return string.chars().sum();
    }
}
