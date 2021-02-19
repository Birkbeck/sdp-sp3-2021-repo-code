package adapter.enumerator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Adapts Enumeration interface to Iterator interface.
 * Does not support remove() operation.
 */
public class EnumerationAsIterator implements Iterator {
    private final Enumeration enumeration;

    public EnumerationAsIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    public Object next() {
        return this.enumeration.nextElement();
    }

    /**
     * Not supported.
     *
     * @throws UnsupportedOperationException if invoked
     */
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove");
    }
}