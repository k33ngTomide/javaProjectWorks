package OurPracticeTasks.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfOptions {

    static ArrayList<Integer> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        option_box();
    }

    public static void option_box(){
        System.out.println("""
                1. Add
                2. Remove
                3. Display
                4. Exit""");
        System.out.print("Enter your choice: ");
        int userEntry = scanner.nextInt();


        switch (userEntry){
            case 1:
                addElement();
                option_box();
                break;
            case 2:
                removeElement();
                option_box();
                break;
            case 3:
                displayElement();
                option_box();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Wrong entry, try again!");
                option_box();
        }
    }
    public static void addElement(){
        System.out.println("Enter an integer: ");
        int userEntry = scanner.nextInt();
        list.add(userEntry);
        System.out.println("Integer Entered added");
    }
    public static void removeElement(){
        System.out.println("Enter the Integer to be removed in the list: ");
        int userEntry = scanner.nextInt();

        if (list.contains(userEntry)) {
            for (int counter = 0; counter < list.toArray().length; counter++) {
                if (list.get(counter) == userEntry) list.remove(counter);
            }
            System.out.println("Number Removed");
        }
        else System.out.println("Integer is not in the list.");
    }

    public static void displayElement(){
        System.out.println(list);
    }
    public static void exit(){
        System.out.println("Program is exiting... Bye");
        System.exit(1);
    }

}
