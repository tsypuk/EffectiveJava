package joshua;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import static org.testng.Assert.*;

public class Item40MethodsTest {

    @Test
    public void testCollection() {
        Collection<?>[] collections = {
                new ArrayList<String>(),
                new HashSet<Integer>(),
                new HashMap<String, Boolean>().values()
        };
        assertEquals(Item40Methods.classify(collections[0]), "List");
        assertEquals(Item40Methods.classify(collections[1]), "Set");
        assertEquals(Item40Methods.classify(collections[2]), "Map");
    }

    @Test
    public void directTest() {
        assertEquals(Item40Methods.classify(new ArrayList<String>()), "List");
        assertEquals(Item40Methods.classify(new TreeSet<Object>()), "Set");
    }

    @Test
    public void testNumbers() {
        assertEquals(Item40Methods.detectTheType(new Double(2.5)), "Double");
    }

    @Test
    public void testNumbersFromCollection() {
        List<Number> collection = new ArrayList<Number>();
                collection.add(new Integer(1));
                collection.add(new Long(1));
                collection.add(new Double(2.4));

        assertEquals(Item40Methods.detectTheType(collection.get(0)), "Integer");
        }
    }