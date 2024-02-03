import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        Scanner p1 = new Scanner(System.in);

        System.out.println("enter a marks out of 100 for sub1 ");
        int sub1 = p1.nextInt();

        System.out.println("enter a marks out of 100 for sub2 ");
        int sub2 = p1.nextInt();

        System.out.println("enter a marks out  of 100 for sub3 ");
        int sub3 = p1.nextInt();

        System.out.println("enter a marks out of 100 for sub4 ");
        int sub4 = p1.nextInt();

        System.out.println("enter a marks out of 100 for sub5 ");
        int sub5 = p1.nextInt();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5 ;
        float percentage = sum*100/500;

        System.out.println("sum of total marks = " +sum);
        System.out.println("percentage of student = " +percentage );



    }
}
