package joshua;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class Item19Test {

    @Test
    public void testWildCard() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(33);
        List<?> list1 = Item19.wildCardMethod(list);
        System.out.println(list1);
        assertEquals(list.get(1).intValue(), 22);
    }
}