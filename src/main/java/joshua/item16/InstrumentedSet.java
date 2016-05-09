package joshua.item16;

import java.util.Collection;
import java.util.Set;

/**
 * Created by rtsypuk on 03.07.15.
 */
public class InstrumentedSet<E> extends ForwwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> set) {
        super(set);
    }

    @Override
    public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
