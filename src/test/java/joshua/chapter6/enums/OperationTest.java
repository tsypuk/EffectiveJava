package joshua.chapter6.enums;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OperationTest {

    @Test
    public void testApply() throws Exception {
        final double x = 20.5;
        final double y = 10.3;
        assertEquals(Operation.PLUS.apply(x, y), x + y);
        assertEquals(Operation.MINUS.apply(x, y), x - y);
        assertEquals(Operation.TIMES.apply(x, y), x * y);
        assertEquals(Operation.DIVIDE.apply(x, y), x / y);
    }
}