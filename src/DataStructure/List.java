package DataStructure;

public interface List {

    boolean isEmpty();

    void add(Object element);

    void add(Object element, int index);

    void addAll(Object... elements);

    void addAll(int index, Object... elements);

    void extend(Object object);

    int size();

    Object get(int index);

    public void set(Object element, int index);

    void clear();
    Object[] clone();

    boolean contain(Object element);

    int indexOf(Object element);

    int lastIndexOf(Object element);

    Object[] subList(int fromIndex, int toIndex);

    void remove(int index);

    void remove(Object element);

    void removeAll(Object... elements);

    Object[] toArray();

    void removeRange(int fromIndex, int toIndex);

    void trimToSize();

    void retainAll(Object[] list);


}
