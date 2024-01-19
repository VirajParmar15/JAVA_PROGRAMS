import java.util.Scanner;

public class Cgpa {

    public static void main(String[] args) {

        //int mark1 = 95;
        //int mark2 = 85;
        //int mark3 = 75;

        Scanner c1 = new Scanner(System.in);

        System.out.println("mark 1:");
        int mark1 = c1.nextInt();

        System.out.println("mark 2:");
        int mark2 = c1.nextInt();

        System.out.println("mark 3:");
        int mark3 = c1.nextInt();

        int total = mark1 + mark2 + mark3 ;
        float percentage = (total * 100)/300;
        double Cgpe = percentage/10;

        System.out.println(Cgpe);

    }
}
