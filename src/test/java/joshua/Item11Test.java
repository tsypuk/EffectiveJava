package joshua;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.Arrays;

public class Item11Test {
    private Item11[] list;
    private Item11 valueFirst;
    private Item11 valueLast;

    @BeforeMethod
    public void init(){
        list = new Item11[4];
        list[0] = new Item11("B");
        list[1] = new Item11("A");
        list[2] = new Item11("D");
        list[3] = new Item11("C");

        valueFirst = new Item11("A");
        valueLast = new Item11("D");
    }

    @Test
    public void testSort() {
        Arrays.sort(list);
        assertEquals(list[0], valueFirst);
        assertEquals(list[list.length - 1], valueLast);
    }

    @Test
    public void testEquals(){
        Item11 first = new Item11("test1");
        Item11 second = new Item11("test1");
        assertTrue(first.equals(second));

        assertFalse(new Item11("a").equals(null));
        assertFalse(new Item11("b").equals(new Object()));
        Item11 item11 = new Item11("item11");
        assertTrue(item11.equals(item11));
        assertFalse(new Item11("a").equals(new Item11("b")));
    }

    @Test
    public void testSetName() {
        Item11 item1 = new Item11("name");
        item1.setName("TEST");
        assertTrue("TEST".equals(item1.getName()));
    }

    @Test
    public void testHashCode() {
        String name = "TEST";
        int hash1 = name.hashCode();
        int hash2 = new Item11(name).hashCode();
        assertTrue(hash1 == hash2);
    }

    @Test
    public void testToString() {
        String name = "TEST";
        String equivivalent = "Item11{" +
                "name='" + name + '\'' +
                '}';
        assertEquals(equivivalent, new Item11("TEST").toString());
    }

    @Test
    public void testCompareTo() {
        final Item11 A = new  Item11("A");
        final Item11 A_COPY = new Item11("A");
        final Item11 B = new  Item11("B");
        final Item11 C = new  Item11("C");


        assertTrue(Math.signum(A.compareTo(B)) == - Math.signum(B.compareTo(A)));
        assertTrue(B.compareTo(A) > 0 && C.compareTo(B) > 0 && C.compareTo(A) > 0);
        assertTrue(A.compareTo(A_COPY) == 0 && Math.signum(A.compareTo(B)) == Math.signum(A_COPY.compareTo(B)));

        assertTrue(A.compareTo(A_COPY) == 0);
        assertTrue(A.equals(A_COPY));
    }

    @Test(expectedExceptions = ClassCastException.class)
    public void testCompareException() {
        new Item11("a").compareTo(new Object());
    }


}