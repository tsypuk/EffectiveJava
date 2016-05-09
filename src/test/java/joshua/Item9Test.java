package joshua;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.testng.Assert.*;

public class Item9Test {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    public void testAdd() {
        Map<Item9, String> map = new HashMap<Item9, String>();
        map.put(new Item9("Roman", 20), "first recoed");
        map.put(new Item9("B1", 21), "second recoed");

        String test = map.get(new Item9("Roman", 20));
        assertNotNull(test);
    }

    @Test
    public void testHashCode() {
//        Rule1: consistence
        Item9 item9 = new Item9("Test", new Random().nextInt(12));
        int hashCode = item9.hashCode();
        assertEquals(hashCode, item9.hashCode());

//        Rule2:    2 objects are equal -> hashcodes the same;
        Item9 firstObject = new Item9("Equal", 5);
        Item9 secondObject = new Item9("Equal", 5);
        assertEquals(firstObject, secondObject);
        assertTrue(firstObject.equals(secondObject));
        assertEquals(firstObject.hashCode(), secondObject.hashCode());

//        Rule3: 2 objects are not equal -> hashcodes is not required be different
    }

    @Test
    public void testEqualsCond1() {
        assertFalse(new Item9("Item9", 22).equals(new Item11("Item11")));
    }

    @Test
    public void testEqualsCond2() {
        assertFalse(new Item9("a", 1).equals(new Item9("a", 2)));
    }

    @Test
    public void testEqualsCond3() {
        assertFalse(new Item9("a", 1).equals(new Item9("b", 1)));
    }

    @Test
    public void testEqualsCond4() {
        assertFalse(new Item9("a", 1).equals(new Item9("b", 2)));
    }

    @Test
    public void testEquals() {
//        Rule1:     reflexive
        Item9 reflexiveObject = new Item9("Reflexive", 1);
        assertTrue(reflexiveObject.equals(reflexiveObject));

//        Rule2:    symmetric
        Item9 x = new Item9("Symmetric", 2);
        Item9 y = new Item9("Symmetric", 2);
        assertTrue(x.equals(y));
        assertTrue(y.equals(x));

//        Rule3:      transitive
        Item9 x1 = new Item9("transitive", 2);
        Item9 y1 = new Item9("transitive", 2);
        Item9 z1 = new Item9("transitive", 2);
        assertTrue(x1.equals(y1));
        assertTrue(y1.equals(z1));
        assertTrue(x1.equals(z1));

//        Rule5: null
        assertFalse(x.equals(null));
    }
}