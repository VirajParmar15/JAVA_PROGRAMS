import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       // int a=3,b=5,c=6;
        // int sum = a + b + c;
        // System.out.println("sum of three numbers is : "+sum);

        Scanner s1 = new Scanner(System.in);

        System.out.println("enter no.1 :");
        int num1 = s1.nextInt();

        System.out.println("enter no.2 :");
        int num2 = s1.nextInt();

        System.out.println("enter no.3 :");
        int num3 = s1.nextInt();

        int sum = num1 + num2 + num3 ;
        System.out.println("sum of three number is: "+sum);
    }
}
