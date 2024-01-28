import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

        Scanner c1 = new Scanner(System.in);

        System.out.println("enter length in kilometer");
        float length = c1.nextFloat();

        double mileslength = length/1.609;

        System.out.println(" miles "+mileslength);


    }
}
