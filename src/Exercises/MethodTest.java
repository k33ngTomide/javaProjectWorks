package Exercises;

public class MethodTest {

    private static int addition = 1200;
    private static int subtract = 189;

    public static void main(String[] args) {
        start();
        System.out.println(startMethod(4));
    }

    public static void start(){
        addition += subtract + startMethod(4);
        System.out.println("the addition is "+ addition);
    }
    public static int startMethod(int number){
        int startMethod =  2 * number;
        return startMethod;
    }
}
