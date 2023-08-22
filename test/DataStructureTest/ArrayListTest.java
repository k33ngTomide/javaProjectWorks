package DataStructureTest;

import DataStructure.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.*;

public class ArrayListTest {

    private ArrayList newList;

    @Test
    public void testThatArrayListCan_Be_Created(){
        newList = new ArrayList();
        assertNotNull(newList);
    }

    @Test
    public void testThatArrayListIsEmpty(){
        newList = new ArrayList();
        assertTrue(newList.isEmpty());
    }

    @Test
    public void testThatArrayListCanBeFilled(){
        newList = new ArrayList();
        newList.add("76");
        assertFalse(newList.isEmpty());
    }

    @Test
    public void testThatListCanHaveCapacity(){
        newList = new ArrayList(4);
        assertEquals(4, newList.getCapacity());
    }
    @Test
    public void testThatInitialCapacityCannotBeNegative(){
        assertThrows(IllegalArgumentException.class, ()->{
            newList = new ArrayList(-4);
            throw new IllegalArgumentException("Initial Capacity cannot be Zero or negative");
        });
    }

    @Test
    public void testThatAddingElementIncreaseSize(){
        newList = new ArrayList(4);
        newList.add("45");
        newList.add("30");
        assertEquals(2, newList.size());

    }
    @Test
    public void testThatAnAddedElement_Can_Be_Checked(){
        newList = new ArrayList(4);
        newList.add("45");
        newList.add("30");
        assertEquals("45", newList.get(0));
    }

    @Test
    public void testThatListCanBeExtendedWhenFilled(){
        newList = new ArrayList(3);
        newList.add("45");
        newList.add("30");
        newList.add("46");
        assertEquals("45", newList.get(0));
        assertEquals("30", newList.get(1));
        assertEquals("46", newList.get(2));
        newList.add("50");
        assertEquals("50", newList.get(3));
        newList.add("56");
        assertEquals("56", newList.get(4));

    }

    @Test
    public void testThatElementCanBeAddedAt_A_GivenIndex(){
        newList = new ArrayList(4);
        newList.add("45");
        newList.add("39");
        newList.add("46");
        assertEquals("45", newList.get(0));
        assertEquals("39", newList.get(1));
        assertEquals("46", newList.get(2));
        newList.add("50");
        assertEquals("50", newList.get(3));
        newList.add("101", 2);
        assertEquals("101", newList.get(2));
        assertEquals("46", newList.get(3));

    }

    @Test
    public void testThatElementCanBeReplaced(){
        newList = new ArrayList(4);
        newList.add("78");
        newList.add("109");
        newList.add("400");

        newList.set("30", 1);
        assertEquals("30", newList.get(1));

    }

    @Test
    public void testThatAllElementsCanBeRemoved(){
        newList = new ArrayList(5);
        newList.add("Akintomide");
        newList.add("Sodiq");
        newList.add("Muiliyu");
        assertEquals("Akintomide", newList.get(0));

        newList.clear();
        assertTrue(newList.isEmpty());
    }

    @Test
    public void testThatListCanBeCloned(){
        newList = new ArrayList(4);
        newList.add("Akintomide");
        newList.add("Sodiq");
        newList.add("Muiliyu");
        assertEquals("Akintomide", newList.get(0));

        String[] cloneList = newList.clone();
        assertEquals(cloneList[0], newList.get(0));
        assertEquals(cloneList[1], newList.get(1));
        assertEquals(cloneList[2], newList.get(2));
        assertEquals(cloneList[3], newList.get(3));

    }

    @Test
    public void testThatAListContainElement(){
        newList = new ArrayList();
        newList.add("78");
        newList.add("109");
        newList.add("400");
        assertEquals("109", newList.get(1));

        assertTrue(newList.contain("109"));
    }

    @Test
    public void testThatIndexOfElementCanBeReturned(){
        newList = new ArrayList();
        newList.add("20");
        newList.add("17");
        newList.add("49");
        newList.add("117");
        newList.add("17");
        assertEquals("49", newList.get(2));

        assertEquals(1,newList.indexOf("17"));
    }

    @Test
    public void testThatNegativeOneWillBeReturnedIfElementIsNotFoundInList(){
        newList = new ArrayList();
        newList.add("20");
        newList.add("17");
        newList.add("49");
        newList.add("117");
        newList.add("17");
        assertEquals("117", newList.get(3));

        assertEquals(-1,newList.indexOf("177"));
    }

    @Test
    public void testThatLastIndexOfElementCanBeReturned(){
        newList = new ArrayList();
        newList.add("29");
        newList.add("17");
        newList.add("49");
        newList.add("17");
        newList.add("17");
        newList.add("47");
        assertEquals("49", newList.get(2));

        assertEquals(4,newList.lastIndexOf("17"));
    }

    @Test
    public void testThatNegativeOneWillBeReturned_If_ElementIsNot_FoundInList(){
        newList = new ArrayList();
        newList.add("29");
        newList.add("17");
        newList.add("49");
        newList.add("17");
        newList.add("17");
        newList.add("47");
        assertEquals("49", newList.get(2));

        assertEquals(-1,newList.lastIndexOf("57"));
    }

    @Test
    public void testThatA_SubListCanBeRetrieved(){
        newList = new ArrayList();
        newList.add("29");
        newList.add("17");
        newList.add("49");
        newList.add("17");
        newList.add("18");
        newList.add("43");
        newList.add("22");
        newList.add("11");
        newList.add("45");
        newList.add("57");
        newList.add("97");
        newList.add("107");

        String[] subList = newList.subList(5,9);
        String[] expected = {"43", "22", "11",  "45", "57"};
        assertArrayEquals(expected, subList);

    }

    @Test
    public void testThatACollectionCanBeAdded_To_The_Existing_One(){
        newList = new ArrayList(5);
        newList.add("17");
        newList.add("18");
        newList.add("43");
        newList.add("22");
        assertEquals("22", newList.get(3));
        String[] listToBeAdded = {"23", "25", "27", "57"};
        newList.addAll(listToBeAdded);
        assertEquals("23", newList.get(4));
        assertEquals("25", newList.get(5));
        assertEquals("27", newList.get(6));
        assertEquals("57", newList.get(7));
    }

    @Test
    public void testThatACollectionCanBeAdded_To_The_Existing_One_AtAGivenIndex(){
        newList = new ArrayList(5);
        newList.add("17");
        newList.add("18");
        newList.add("43");
        newList.add("22");
        assertEquals("22", newList.get(3));
        String[] listToBeAdded = {"23", "30", "27", "57"};
        newList.addAll(2, listToBeAdded);
        assertEquals("17", newList.get(0));
        assertEquals("18", newList.get(1));

        assertEquals("23", newList.get(2));
        assertEquals("30", newList.get(3));
        assertEquals("27", newList.get(4));
        assertEquals("57", newList.get(5));

        assertEquals("43", newList.get(6));
        assertEquals("22", newList.get(7));
    }

    @Test
    public void testThatIndexCanBeRemoved(){
        newList = new ArrayList(5);
        newList.add("34");
        newList.add("188");
        newList.add("45");
        newList.add("122");
        assertEquals(4, newList.size());
        newList.remove(1);
        assertEquals(3, newList.size());

    }

    @Test
    public void testThatIndexWillBeReplacedAfterRemoval(){
        newList = new ArrayList(5);
        newList.add("34");
        newList.add("188");
        newList.add("45");
        newList.add("122");
        assertEquals(4, newList.size());
        newList.remove(1);

        assertEquals(3, newList.size());
        assertEquals("45", newList.get(1));
        assertEquals("122", newList.get(2));

    }

    @Test
    public void testThatElementCanBeRemoved() {
        newList = new ArrayList(5);
        newList.add("34");
        newList.add("188");
        newList.add("45");
        newList.add("122");
        assertEquals(4, newList.size());
        newList.remove("45");

        assertEquals(3, newList.size());
        assertEquals("122", newList.get(2));
        assertNull(newList.get(3));
    }

    @Test
    public void testThatListOfElementsCanBeRemoved(){
        newList = new ArrayList();
        newList.add("29");
        newList.add("17");
        newList.add("49");
        newList.add("17");
        newList.add("18");
        newList.add("43");
        newList.add("22");
        newList.add("11");
        newList.add("45");
        newList.add("57");
        newList.add("97");
        newList.add("107");
        assertEquals("107", newList.get(11));

        String[] listToBeRemoved = {"18", "11", "57", "107"};
        newList.removeAll(listToBeRemoved);
        assertEquals("29", newList.get(0));
        assertEquals("17", newList.get(1));
        assertEquals("49", newList.get(2));
        assertEquals("17", newList.get(3));
        assertEquals("43", newList.get(4));
        assertEquals("22", newList.get(5));
        assertEquals("45", newList.get(6));
        assertEquals("97", newList.get(7));

    }

    @Test
    public void testThatListCanBeDisplayedAsAnArray(){
        newList = new ArrayList(2);
        newList.add("43");
        newList.add("22");
        newList.add("11");

        Object[] expected = {"43", "22", "11"};

        assertArrayEquals(expected, newList.toArray());
    }

    @Test
    public void testThatRangeCanBeRemoved(){
        newList = new ArrayList();
        newList.add("29");
        newList.add("17");
        newList.add("49");
        newList.add("17");
        newList.add("18");
        newList.add("43");
        newList.add("22");
        newList.add("11");
        newList.add("45");
        newList.add("57");
        newList.add("97");
        newList.add("107");
        assertEquals("107", newList.get(11));

        newList.removeRange(3, 8);
        assertEquals("29", newList.get(0));
        assertEquals("17", newList.get(1));
        assertEquals("49", newList.get(2));
        assertEquals("57", newList.get(3));
        assertEquals("97", newList.get(4));
        assertEquals("107", newList.get(5));

    }

    @Test
    public void testThatCapacityCanBeTrimmedToSize() {
        newList = new ArrayList(6);
        newList.add("49");
        newList.add("17");
        newList.add("18");
        newList.add("43");

        newList.trimToSize();
        assertEquals(4, newList.size());
        assertEquals(4, newList.getCapacity());
    }

    @Test
    public void testThatOnlyTheSpecifiedListIsRetained(){
        newList = new ArrayList();
        newList.add("29");
        newList.add("17");
        newList.add("49");
        newList.add("17");
        newList.add("18");
        newList.add("43");
        newList.add("22");
        newList.add("11");
        newList.add("45");
        newList.add("57");
        newList.add("97");
        newList.add("107");
        assertEquals("107", newList.get(11));

        String[] retainedList = {"43", "22", "11"};

        newList.retainAll(retainedList);
        assertEquals("43", newList.get(0));
        assertEquals("22", newList.get(1));
        assertEquals("11", newList.get(2));

    }


}
