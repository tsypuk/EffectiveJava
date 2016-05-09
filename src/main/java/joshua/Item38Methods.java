package joshua;

/**
 * Created by rtsy on 01.08.2015.
 */
public class Item38Methods {
    public static void main(String[] args) {
        long a[] = {1,2,3,4,5,5,6,7,8,9,0};
//        long a[] = null;
        int offset = 1;
        int length = 10;
        sort(a, offset, length);
    }

    private static void sort(long[] a, int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;

    }
}