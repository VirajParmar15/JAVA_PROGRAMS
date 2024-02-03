import java.util.Scanner;

public class Website {

    public static void main(String[] args) {

        Scanner w1 = new Scanner(System.in);
        String website = w1.next();

        if(website.endsWith(".org")){
            System.out.println("this is an organizational wabsite");
        } else if (website.endsWith(".com")) {
            System.out.println("this is commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("this is an indian website");
        }
    }
}
