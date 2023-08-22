package DataStructure;

import java.util.Iterator;
import java.util.Spliterator;

public interface Set {

    int size();

    boolean isEmpty();

    boolean add(Object element);

    boolean addAll(Object[] elements);

    boolean contains(Object element);

    boolean containsAll(Object[] elements);

    boolean equals(Object element);

    int hashCode();

    void clear();

    boolean remove();

    Object[] toArray();

    Iterator<Object> iterator();

    boolean remove(Object element);

    boolean removeAll(Object[] element);

    default Spliterator<Object> spliterator(){ return null;}


}
