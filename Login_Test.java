
        import java.util.Scanner;


class Login{
    Scanner sc;

    String ur,pass;

    public Login(Scanner sc){
        this.sc=sc;
        insertData();
    }
    public void insertData(){
        System.out.println("Enter Username:");
        ur=sc.nextLine();

        System.out.println("Enter Password:");
        pass=sc.nextLine();
        validation();
    }
    public void validation(){
        if(ur.equals("admin")){
            if(pass.equals("admin")){
                System.out.println("Successfully Login welcome user");

            }else{
                System.out.println("Wrong Password please try again ");

            }
        }else{
            System.out.println("Wrong Username please try again ");
        }
    }
}

class Login_Test{

    public static void main (String as[]){
        Scanner sc=new Scanner (System.in);
        Login l=new Login(sc);
    }
}
