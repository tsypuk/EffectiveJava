package joshua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rtsypuk on 30.06.15.
 */
public class Item13 {

    // Bad approach
    private static final String[] VALUES = {"a", "b", "c"};
    private static final String[] PRIVATE_VALUES = {"val1", "val2", "val3"};

    public static final List<String> LIST_UNMODIFIED_VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    private Item13() {

    }

    public static String[] getPrivateValues() {
        return PRIVATE_VALUES.clone();
    }

    public static String[] getValues() {
        return VALUES;
    }
}