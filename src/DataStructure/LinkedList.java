package DataStructure;

public class LinkedList{
    Node head;

    public LinkedList(){
        this.head = null;
    }
    public void add(String element) {
        Node newNode = new Node(element);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String get(int index) {

        if (index < 0 || index > size()) throw new IndexOutOfBoundsException("Invalid Index");

        Node current = head;
        for (int count = 0; count < index; count++) {
            current = current.next;
        }
        return current.element;
    }

    public int size(){
        int size = 0;
        Node current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public void addLast(String element) {
        add(element);
    }

    public void addFirst(String element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }

    public void clear() {
        head = null;
    }

    public String element() {
        return get(0);
    }

    public String getLast() {
        return get(size() - 1);
    }

    public String getFirst() {
        return get(0);
    }

    public void offer(String element) {
        add(element);
    }

    public void offerFirst(String element) {
        addFirst(element);
    }

    public void offerLast(String element) {
        addLast(element);
    }

    public String peek() {
        return get(0);
    }

    public String peekFirst() {
        return get(0);
    }

    public String peekLast() {
        return get(size() - 1);
    }
}
