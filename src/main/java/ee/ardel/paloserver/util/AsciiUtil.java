package ee.ardel.paloserver.util;

public class AsciiUtil {

    private static final int ZERO = 48;

    public static int calculateStringAsciiSum(String string) {
        return string.chars().sum();
    }

    public static String intToBinaryString(int number) {
        return Integer.toBinaryString(number);
    }

    public static int countMaxConsecutiveZeros(String binary) {
        if (binary == null) {
            return 0;
        }
        int maxResult = 0;
        int consecutiveZeros = 0;

        for (char c : binary.toCharArray()) {
            if ((int) c == ZERO) {
                consecutiveZeros++;
            } else {
                maxResult = Math.max(consecutiveZeros, maxResult);
                consecutiveZeros = 0;
            }
        }
        return Math.max(consecutiveZeros, maxResult);
    }
}
