package joshua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rtsy on 02.08.2015.
 */
public class Item40Methods {

    public static void main(String[] args) {
        Collection<?>[] collections = {
            new ArrayList<String>(),
                new HashSet<Integer>(),
                new HashMap<String, Boolean>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }

        List<Number> list = new ArrayList<Number>();
        list.add(new Integer(1));
        list.add(new Integer(1));
        list.add(new Long(2));
        list.add(new Double(2.3));

        for (Number number : list) {
            System.out.println(detectTheType(number));
        }
    }

    public static String detectTheType(Number number) {
        return "Number";
    }
    public static String detectTheType(Long number) {
        return "Long";
    }

    public static String detectTheType(Double number) {
        return "Double";
    }

    public static String classify(Collection<?> c) {
        return "Collection";
    }

    public static String classify(Set<?> c) {
        return "Set";
    }

    public static String classify(List<?> c) {
        return "List";
    }

}
