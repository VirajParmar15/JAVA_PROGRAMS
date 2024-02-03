import java.util.Scanner;

public class Income {

    public static void main(String[] args) {

        Scanner i1 = new Scanner(System.in);

        double tax = 0;

        System.out.println("Enter your income in lakhs");
        int income = i1.nextInt();

        if(income <= 250000){
            tax = tax + 0;
        }
        else if (income>250000 && income<=500000) {
            tax = tax + 0.05*(income-250000);
        }
        else if (income>500000 && income<=1000000) {
            tax = tax + 0.2*(income-250000);
        }
        else if (income>1000000) {
            tax = tax + 0.3*(income-250000);
        }
        System.out.println("total tax : "+tax);
    }
}
