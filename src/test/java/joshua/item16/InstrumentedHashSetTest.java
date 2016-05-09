package joshua.item16;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static org.testng.Assert.*;

public class InstrumentedHashSetTest {
    private InstrumentedHashSet<String> instrumentedHashSet;

    @BeforeMethod
    public void init() {
        instrumentedHashSet = new InstrumentedHashSet<String>(3, 2);
    }
    @Test
    public void testAdd() throws Exception {
        final int counter = new Random().nextInt(30);
        int iterationCounter = counter;
        while (iterationCounter-- > 0) {
            instrumentedHashSet.add("TEST"+ iterationCounter);
        }
        assertEquals(counter, instrumentedHashSet.getAddCount());
    }

    @Test
    public void testAddAll() throws Exception {
        Collection<String> collection = new ArrayList<String>();
        collection.addAll(Arrays.asList(new String[]{"a", "b", "c", "d", "e"}));
        instrumentedHashSet.addAll(collection);
        assertFalse(5 == instrumentedHashSet.getAddCount());
    }

    @Test
    public void testGetAddCount() throws Exception {

    }
}