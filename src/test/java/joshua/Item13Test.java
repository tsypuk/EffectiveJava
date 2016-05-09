package joshua;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Item13Test {

    @Test
    public void testChangeList() {

        int oldSize = Item13.LIST_UNMODIFIED_VALUES.size();
        try {
            Item13.LIST_UNMODIFIED_VALUES.add("TEST");
        }
        catch (Exception ex){
            assertTrue(ex.getClass().equals(UnsupportedOperationException.class));
        }
        int newSize = Item13.LIST_UNMODIFIED_VALUES.size();
        assertEquals(oldSize, newSize);
    }

    @Test
    public void testNotChangable() {
        String[] privateValues = Item13.getPrivateValues();
        privateValues[0] = "TEST_A";
        privateValues[1] = "TEST_B";

//        Drop this test
        assertFalse(privateValues[0] == Item13.getPrivateValues()[0]);
        assertFalse(privateValues[1] == Item13.getPrivateValues()[1]);
    }

    @Test
    public void testBadApproach() {
        //        Test of bad approach
        final String value = "TEST_VALUE";
        assertEquals(Item13.getValues()[0] = value, value);
    }

    @Test
    public void testChangable() {
        final String changableName = "TEST_C";
        String[] vals = Item13.getValues();
        vals[0] = changableName;
        assertEquals(Item13.getValues()[0], changableName);
    }
}