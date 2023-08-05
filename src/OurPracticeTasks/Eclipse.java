package OurPracticeTasks;

public class Eclipse {
    private int number1;
    private int number2;

    public Eclipse(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {
        Eclipse eclipse = new Eclipse(65, 29);

        eclipse.setNumber1(109);
        System.out.println(eclipse.getNumber1());
        eclipse.setNumber2(546);
        System.out.println(eclipse.getNumber2());

        System.out.println(calculateNumber(eclipse));

    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public static int calculateNumber(Eclipse eclipse){
        int value = eclipse.number1 + eclipse.number2;
        return value;
    }
}
