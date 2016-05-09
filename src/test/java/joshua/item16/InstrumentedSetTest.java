package joshua.item16;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import static org.testng.Assert.*;

public class InstrumentedSetTest {
    private InstrumentedSet<Integer> integers;

    @BeforeMethod
    public void setUp() throws Exception {
        integers = new InstrumentedSet<Integer>(new HashSet<Integer>());
    }

    @Test
    public void testAdd() throws Exception {
        final int counter = 5;
        int c = counter;
        while (c-- > 0){
            integers.add(c);
        }
        assertEquals(counter, integers.getAddCount());
    }

    @Test
    public void testAddAll() throws Exception {
        Collection<Integer> integerCollection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integers.addAll(integerCollection);
        assertTrue(9 == integers.getAddCount());
    }
}