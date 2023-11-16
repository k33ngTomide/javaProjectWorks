package HackerRank;

public class HSolution {







}

class Shape{

    private int l;
    private int b;
    public Shape(int l, int b){
        this.l = l;
        this.b = b;
    }

    public void area(){
        System.out.println( l + " " + b);
    }
}

class  Rectangle extends Shape{
    private int l;
    private int b;

    public Rectangle(int l, int b) {
        super(l,b);
    }

    @Override
    public void area(){
        System.out.println( l * b);
    }

}
