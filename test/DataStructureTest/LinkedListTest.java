package DataStructureTest;

import DataStructure.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    private LinkedList newLinkedList;
    @Test
    public void testThatLinkedListCanBeCreated(){
        newLinkedList = new LinkedList();
    }

    @Test
    public void testThatElementCanBeAddedTo_The_List(){
        newLinkedList = new LinkedList();
        newLinkedList.add("67");

        assertEquals("67", newLinkedList.get(0));
    }

    @Test
    public void testThatTwoElementsCanBeAddedToTheList(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("89");

        assertEquals("45", newLinkedList.get(0));
        assertEquals("89", newLinkedList.get(1));
    }

    @Test
    public void testThatElementWillBeAddedAtThe_End_of_List(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("89");

        assertEquals("45", newLinkedList.get(0));
        assertEquals("89", newLinkedList.get(1));

        newLinkedList.addLast("75");
        assertEquals("75", newLinkedList.get(2));
    }

    @Test
    public void testThatSizeCanBeReturned(){
        newLinkedList = new LinkedList();
        newLinkedList.add("38");
        newLinkedList.add("67");

        assertEquals(2, newLinkedList.size());
    }

    @Test
    public void testThatElementWillBeAddedAtThe_Beginning_of_List(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("89");

        assertEquals("45", newLinkedList.get(0));
        assertEquals("89", newLinkedList.get(1));

        newLinkedList.addFirst("75");
        assertEquals("75", newLinkedList.get(0));
        assertEquals("45", newLinkedList.get(1));
        assertEquals("89", newLinkedList.get(2));
    }

    @Test
    public void testThatAllElementInTheListCanBeCleared(){
        newLinkedList = new LinkedList();
        newLinkedList.add("Akin");
        newLinkedList.add("Tomide");

        assertEquals("Akin", newLinkedList.get(0));
        assertEquals("Tomide", newLinkedList.get(1));

        newLinkedList.clear();
        assertEquals(0, newLinkedList.size());

    }

    @Test
    public void testThatFirstElementCanBeRetrieved(){
        newLinkedList = new LinkedList();
        newLinkedList.add("Akin");
        newLinkedList.add("Tomide");
        newLinkedList.add("Seyi");
        newLinkedList.add("Ayobami");

        assertEquals("Akin", newLinkedList.element());
    }

    @Test
    public void testThatLastElementCanBeRetrieved(){
        newLinkedList = new LinkedList();
        newLinkedList.add("Akin");
        newLinkedList.add("Tomide");
        newLinkedList.add("Seyi");
        newLinkedList.add("Ayobami");

        assertEquals("Ayobami", newLinkedList.getLast());
    }

    @Test
    public void testThatTheFirstElementCanBeRetrieved(){
        newLinkedList = new LinkedList();
        newLinkedList.add("Akin");
        newLinkedList.add("Tomide");
        newLinkedList.add("Seyi");
        newLinkedList.add("Ayobami");

        assertEquals("Akin", newLinkedList.get(0));
        assertEquals("Tomide", newLinkedList.get(1));
        assertEquals("Seyi", newLinkedList.get(2));
        assertEquals("Ayobami", newLinkedList.get(3));

        assertEquals("Akin", newLinkedList.getFirst());
    }

    @Test
    public void testThatTheElementSpecifiedWiLLBeAdded(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("56");
        newLinkedList.add("87");
        newLinkedList.add("98");

        assertEquals("45", newLinkedList.get(0));
        assertEquals("56", newLinkedList.get(1));
        assertEquals("87", newLinkedList.get(2));
        assertEquals("98", newLinkedList.get(3));

        newLinkedList.offer("65");
        assertEquals("65", newLinkedList.get(4));

    }

    @Test
    public void testThatTheElementSpecifiedWiLLBeAdded_ToTheFrontOfTheList(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("56");
        newLinkedList.add("87");
        newLinkedList.add("98");

        assertEquals("45", newLinkedList.get(0));
        assertEquals("56", newLinkedList.get(1));
        assertEquals("87", newLinkedList.get(2));
        assertEquals("98", newLinkedList.get(3));

        newLinkedList.offerFirst("65");
        assertEquals("65", newLinkedList.get(0));
        assertEquals("45", newLinkedList.get(1));
        assertEquals("56", newLinkedList.get(2));
        assertEquals("87", newLinkedList.get(3));
        assertEquals("98", newLinkedList.get(4));

    }

    @Test
    public void testThatTheElementSpecifiedWiLLBeAdded_ToTheEndOfTheList(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("56");
        newLinkedList.add("87");
        newLinkedList.add("98");

        assertEquals("45", newLinkedList.get(0));
        assertEquals("56", newLinkedList.get(1));
        assertEquals("87", newLinkedList.get(2));
        assertEquals("98", newLinkedList.get(3));

        newLinkedList.offerLast("65");
        assertEquals("65", newLinkedList.get(4));

    }

    @Test
    public void testThatTheElementAtTheHeadOfTheListWillBeRetrieved(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("56");
        newLinkedList.add("87");
        newLinkedList.add("98");

        assertEquals("45", newLinkedList.peek());
    }

    @Test
    public void testThatElementAtTheHeadOfTheListWillBeRetrieved(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("56");
        newLinkedList.add("87");
        newLinkedList.add("98");

        assertEquals("45", newLinkedList.peekFirst());
    }

    @Test
    public void testThatElementAtTheLastOfTheListWillBeRetrieved(){
        newLinkedList = new LinkedList();
        newLinkedList.add("45");
        newLinkedList.add("56");
        newLinkedList.add("87");
        newLinkedList.add("98");

        assertEquals("98", newLinkedList.peekLast());
    }

}
