package DataStructure;

public class ArrayList {

    private boolean isEmpty;
    private int count;
    private Object[] elementList;
    private int capacity;

    public ArrayList(int initialCapacity) {
        elementList = new Object[initialCapacity];
        capacity = initialCapacity;
    }

    public ArrayList(){
        final int DEFAULT_CAPACITY = 10;
        elementList = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }
    public boolean isEmpty() {
        if (count == 0){
            isEmpty = true;
        }
        return isEmpty;
    }

    public void add(Object element) {
        if(size() == capacity) extend(element);
        elementList[count] = element;
        count++;
    }

    public void add(Object element, int index) {
        add(element);
        for (int counter = index; counter < size(); counter++){
            Object temp = elementList[counter];
            elementList[counter] = elementList[(size()-1)];
            elementList[(size()-1)] = temp;
        }
    }

    public void addAll(Object... elements){
        for (Object element : elements)
            add(element);
    }

    public void addAll(int index, Object... elements){

        Object[] endOfList = subList(index, size());
        int newCount = 0;
        for (int counter = index; counter < elements.length+index; counter++) {
            add(elements[newCount], counter);
            newCount++;
        }
        for (Object element : endOfList) {
            add(element);
        }
    }



    private void extend(Object object){
        capacity = capacity * 2;
        Object[] newElementList = new Object[capacity];
        for (int counter = 0; counter < elementList.length; counter++)
            newElementList[counter] = elementList[counter];

        elementList = newElementList;
    }

    public int size() {
        int size = 0;
        for(Object index : elementList)
            if (index != null) size++;
        return size;
    }

    public Object get(int index) {
        return elementList[index];
    }

    public int getCapacity(){return capacity;}

    public void set(Object element, int index) {
        elementList[index] = element;
    }

    public void clear() {
        elementList = new Object[capacity];
        count = 0;
    }

    public Object[] clone() {
        Object[] clonedList = new Object[capacity];
        for (int index = 0; index < elementList.length; index++) {
            clonedList[index] = elementList[index];
        }
        return clonedList;
    }

    public boolean contain(Object element) {
        boolean isPresent = false;
        for (Object each : elementList) if (element == each) isPresent = true;
        return isPresent;
    }

    public int indexOf(Object element) {
        for (int index = 0; index < elementList.length; index++)
            if (elementList[index] ==  element) return index;
        return -1;
    }

    public int lastIndexOf(Object element) {
        int lastIndex = -1;
        for (int index = 0; index < elementList.length; index++)
            if (elementList[index] ==  element) lastIndex = index;
        return lastIndex;
    }

    public Object[] subList(int fromIndex, int toIndex) {
        Object[] subList = new Object[toIndex - fromIndex + 1];
        int counter = 0;
        for (int index = fromIndex; index <= toIndex; index++) {
            subList[counter] = elementList[index];
            counter++;
        }
        return subList;
    }

    public void remove(int index) {
        for (int counter = index; counter < size(); counter++) {
            Object temp = elementList[counter];
            elementList[counter] = elementList[counter+1];
            elementList[(counter+1)] = temp;
        }
        elementList[size()] = null;
    }

    public void remove(Object element) {
        for (int index = 0; index < size(); index++) {
            if (element == elementList[index]) remove(index);
        }
    }


    public void removeAll(Object... elements) {
        for (int index = 0; index < elements.length; index++) {
            for (int counter = 0; counter < size(); counter++) {
                if (elements[index] == elementList[counter]) remove(counter);
            }
        }
    }

    public Object[] toArray() {
        Object[] newList = new Object[size()];
        for (int index = 0; index < size(); index++) {
            newList[index] = elementList[index];
        }
        return newList;
    }

    public void removeRange(int fromIndex, int toIndex) {
        int count = fromIndex;
        for (int index = fromIndex; index <= toIndex; index++) {
            remove(count);
        }
    }
}
