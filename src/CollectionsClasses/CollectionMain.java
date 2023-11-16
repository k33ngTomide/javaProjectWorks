package CollectionsClasses;

import java.util.*;

public class CollectionMain {


    public static Collection<String> printNonDuplicates(Collection<String> values) {
        return new HashSet<>(values);
    }

    public static void mainSet(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);

        System.out.println(numbers);

        Set<Integer> newNumbers = new HashSet<>();
        newNumbers.add(10);
        newNumbers.add(20);
        newNumbers.add(30);
        newNumbers.add(40);
        newNumbers.add(50);
        newNumbers.add(10);

        System.out.println(newNumbers);


    }

    public static void mainTreeSet(String[] args) {

//        for reverse order objects of a class use the Comparator Class.
//        Comparator<Dog> comparator = (d1, d2) -> d2.getName().compareTo(d1.getName());
//        Set<Dog> dogs = new TreeSet<>(comparator);

        Set<Dog> dogs = new TreeSet<>();

        Dog newNewDog = new Dog("German Shepherd");
        Dog dog = new Dog("Bingo");
        Dog newDog = new Dog("ChiHuaHua");

        dogs.add(dog);
        dogs.add(newDog);
        dogs.add(newNewDog);

//        dogs.addAll(List.of(dog, newDog, newNewDog));

        System.out.println(dogs);
    }

    public static void mainQueue(String[] args) {
        Queue<Dog> dogs = new PriorityQueue<>(Comparator.reverseOrder());

        dogs.add(new Dog("Aja 1"));
        dogs.offer(new Dog("AjaNleKoko"));

        System.out.println(dogs);
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("TEN", 10);
        map.put("FIVE", 5);
        map.put("FIV", 50);
        map.put("FIE", 55);
        map.put("FI", 53);
        map.put("FVE", 52);
        map.put("VE", 57);

        System.out.println(map.get("FIVE"));
        map.remove("FI");
        System.out.println(map);
    }


}
