import java.util.Scanner;

class InsufficientBalance extends Exception{
    public InsufficientBalance(String m){
        super(m);
    }

}
class account{
    float bal;
    account(float bal){
        this.bal=bal;

    }
    void withdraw(float a){
        try{
            if((bal-a)<0)
                throw new InsufficientBalance("Error");
            else
                bal=bal-a;
            System.out.println("Balance is="+bal);
        }
        catch(InsufficientBalance e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String args[])
    {
        account a=new account(5000);
        Scanner sc=new Scanner(System.in);
        System.out.print("enter amount tobe withdrawen: ");
        float amt=sc.nextFloat();
        a.withdraw(amt);



    }
}
