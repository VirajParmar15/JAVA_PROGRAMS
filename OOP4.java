class sqaure {

    int side;


    public int getarea() {
        return side*side;
    }

    public int getPerimeter() {
        return 4*side;
    }



}

public class OOP4 {
    public static void main(String[] args) {

        sqaure s1 = new sqaure();

        s1.side=5;

        System.out.println(s1.getarea());
        System.out.println(s1.getPerimeter());
    }
}
