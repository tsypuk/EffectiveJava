package joshua.item16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rtsypuk on 03.07.15.
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount = 0;
    private static final long serialVersionUID = 93750923750923L;

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
//        Don't work correctly
        addCount += c.size();
        return super.addAll(c);
//        boolean result = true;
//        for (E element : c) {
//            result &= add(element);
//        }
//        return result;
    }

    public int getAddCount() {
        return addCount;
    }
}