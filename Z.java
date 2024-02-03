abstract class Z {
    abstract void Display();

    public static void main(String[] args) {
        Z1 z1 = new Z1();
        Z2 z2 = new Z2();
        z1.Display();
        z2.Display();

    }
}
class Z1 extends Z{
    @Override
    void Display() {
        System.out.println("In display() of class z1");
    }
}
class Z2 extends Z{
    @Override
    void Display() {
        System.out.println("In display() of class z2");
    }
}
