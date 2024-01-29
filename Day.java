import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner d1 = new Scanner(System.in);

        System.out.println("enter number between 1 to 7");
        int day = d1.nextInt();

        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}

