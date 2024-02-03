import java.util.Scanner;

public class Leap {

    public static void main(String[] args) {


        Scanner L1 = new Scanner(System.in);

        System.out.println("enter year");
        int year = L1.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year %400 ==0))
            System.out.println("leap year");
        else
            System.out.println(" not leap year");
    }
}

