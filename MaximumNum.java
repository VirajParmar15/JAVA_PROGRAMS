import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner Mn = new Scanner(System.in);

        System.out.println("enter your first number");
        int num1 = Mn.nextInt();
        System.out.println("enter your second number");
        int num2 = Mn.nextInt();
        System.out.println("enter your third number");
        int num3 = Mn.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("num1 is greatest");
        }
        else if (num2>num1 && num2>num3)
        {
            System.out.println("num2 is greatest");
        }
        else
        {
            System.out.println("num3 is greatest");
        }
    }
}
