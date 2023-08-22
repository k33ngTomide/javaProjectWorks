package DataStructure;

import java.util.Objects;

public class ArrayList  {

    private boolean isEmpty;
    private int count;
    private String[] elementList;
    private int capacity;

    public ArrayList(int initialCapacity) {
        if(initialCapacity <= 0)
            throw new IllegalArgumentException("Initial Capacity cannot be Zero or negative");
        elementList = new String[initialCapacity];
        capacity = initialCapacity;
    }

    public ArrayList(){
        final int DEFAULT_CAPACITY = 10;
        elementList = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }
    public boolean isEmpty() {
        if (count == 0) isEmpty = true;
        return isEmpty;
    }

    public void add(String element) {
        if(size() == capacity) extend(element);
        elementList[count] = element;
        count++;
    }

    public void add(String element, int index) {
        add(element);
        for (int counter = index; counter < size(); counter++){
            String temp = elementList[counter];
            elementList[counter] = elementList[(size()-1)];
            elementList[(size()-1)] = temp;
        }
    }

    public void addAll(String... elements){
        for (String element : elements)
            add(element);
    }

    public void addAll(int index, String... elements){

        String[] endOfList = subList(index, size());
        int newCount = 0;
        for (int counter = index; counter < elements.length+index; counter++) {
            add(elements[newCount], counter);
            newCount++;
        }
        for (String element : endOfList) {
            add(element);
        }
    }

    public void extend(String object){
        capacity = capacity * 2;
        String[] newElementList = new String[capacity];
        for (int counter = 0; counter < elementList.length; counter++)
            newElementList[counter] = elementList[counter];

        elementList = newElementList;
    }

    public int size() {
        int size = 0;
        for(String index : elementList)
            if (index != null) size++;
        return size;
    }

    public String get(int index) {
        return elementList[index];
    }

    public int getCapacity(){return capacity;}

    public void set(String element, int index) {
        elementList[index] = element;
    }

    public void clear() {
        elementList = new String[capacity];
        count = 0;
    }

    public String[] clone() {
        String[] clonedList = new String[capacity];
        for (int index = 0; index < elementList.length; index++)
            clonedList[index] = elementList[index];

        return clonedList;
    }

    public boolean contain(String element) {
        boolean isPresent = false;
        for (String each : elementList) if (element == each) isPresent = true;
        return isPresent;
    }

    public int indexOf(String element) {
        for (int index = 0; index < elementList.length; index++)
            if (Objects.equals(elementList[index], element)) return index;
        return -1;
    }

    public int lastIndexOf(String element) {
        int lastIndex = -1;
        for (int index = 0; index < elementList.length; index++)
            if (Objects.equals(elementList[index], element)) lastIndex = index;
        return lastIndex;
    }

    public String[] subList(int fromIndex, int toIndex) {
        String[] subList = new String[toIndex - fromIndex + 1];
        int counter = 0;
        for (int index = fromIndex; index <= toIndex; index++) {
            subList[counter] = elementList[index];
            counter++;
        }
        return subList;
    }

    public void remove(int index) {
        for (int counter = index; counter < size(); counter++) {
            String temp = elementList[counter];
            elementList[counter] = elementList[counter+1];
            elementList[(counter+1)] = temp;
        }
        elementList[size()] = null;
    }

    public void remove(Object element) {
        for (int index = 0; index < size(); index++)
            if (element == elementList[index]) remove(index);

    }


    public void removeAll(String... elements) {
        for (int index = 0; index < elements.length; index++)
            for (int counter = 0; counter < size(); counter++)
                if (Objects.equals(elements[index], elementList[counter])) remove(counter);


    }

    public String[] toArray() {
        String[] newList = new String[size()];
        for (int index = 0; index < size(); index++)
            newList[index] = elementList[index];
        return newList;
    }

    public void removeRange(int fromIndex, int toIndex) {
        int count = fromIndex;
        for (int index = fromIndex; index <= toIndex; index++) remove(count);

    }

    public void trimToSize() {
        capacity = size();
    }

    public void retainAll(String[] list) {
        elementList = new String[list.length];
        for (int index = 0; index < list.length; index++)
            elementList[index] = list[index];
    }

}
