import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer: ");
        int number = input.nextInt();
        System.out.println("you enterd" + number);

        input.close();
    }
}
