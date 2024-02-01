import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        Scanner g1 = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = g1.next();

        System.out.println("hello,"+name+" have a good day");
    }
}
