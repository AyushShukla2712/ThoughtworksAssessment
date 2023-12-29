import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTestChecker {
    @Test
    void testFactorialZero() {
        FindFactorial findFactorial = new FindFactorial(0);
        assertEquals(1, findFactorial.Calculate(0));

    }

    @Test
    void testFactorialOne() {
        FindFactorial findFactorial = new FindFactorial(1);
        assertEquals(1, findFactorial.Calculate(1));
    }

    @Test
    void testPositiveNumberFactorial() {
        FindFactorial findFactorial = new FindFactorial(3);
        assertEquals(6, findFactorial.Calculate(3));
    }

    @Test
    void testNegativeNumberFactorial() {
        FindFactorial findFactorial = new FindFactorial(-3);
        assertEquals(-1, findFactorial.Calculate(-3));

    }
}
