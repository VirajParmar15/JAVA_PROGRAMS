import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffRead {
    public static void main(String[] args) {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("enter your name: ");
        try
        {
            String nm = br.readLine();
            System.out.println("Hello"+nm+"!");
        }
        catch (Exception e){
            System.out.println("An Error occured");
        }
    }

}
