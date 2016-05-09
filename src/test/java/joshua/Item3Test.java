package joshua;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class Item3Test {

    @Test
    public void testSingleTone(){
        Item3.INSTANCE.leaveTheBuilding();
        assertEquals(Item3.INSTANCE.hashCode(), Item3.INSTANCE.hashCode());
    }


}