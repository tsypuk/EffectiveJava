package joshua;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rtsypuk on 04.07.15.
 */
public class Item19 {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        Set<String> stringSet = new HashSet();
//        stringSet.add("STR");
    }

    public static List<?> wildCardMethod(List<Integer> list) {
        list.add(22);
        return list;
    }
}