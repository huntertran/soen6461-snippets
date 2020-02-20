package fragile;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedHashSet<E> extends ForwardingSet<E> {

    public InstrumentedHashSet(Set<E> set) {
        super(set);
    }

    public InstrumentedHashSet(){
        super(new HashSet<E>());
    }

    private int addCount = 0;

    @Override
    public boolean add(final E e) {
        final boolean added = super.add(e);

        if (added) {
            this.addCount++;
        }

        return added;
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        int countBefore = this.size();
        boolean added = super.addAll(c);
        int countAfter = this.size();

        if (countBefore < countAfter) {
            this.addCount = this.addCount + (countAfter - countBefore);
        }

        return added;
    }

    public int getAddCount() {
        return this.addCount;
    }
}