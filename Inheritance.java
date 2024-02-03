class base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("i am in base and setting x now");
        this.x = x;
    }
    public void PrintMe(){
        System.out.println("i am a constructor");
    }
}
class derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;

    }
}

public class Inheritance {
    public static void main(String[] args) {

        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        derived d = new derived();
        d.setY(43);
        System.out.println(d.getY());


    }
}