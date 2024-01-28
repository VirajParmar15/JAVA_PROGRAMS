class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am an overloaded constructor with value of x as: "+x);

    }
}
class Derived1 extends base1{
    Derived1(){
        System.out.println("i am a derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("i am a overloaded constructor of Derived with value of y as: "+y);
    }
}
class childofderived extends Derived1{
    childofderived(){
        System.out.println("i am child of derived constructor");
    }
    childofderived(int x,int y,int z){
        super(x,y);
        System.out.println("i am an overloaded constructor of derived with value of z as: "+z);
    }
}
public class ConstructorsInInheritance {
    public static void main(String[] args) {
       // base1 b = new base1(5);
        //Derived1 d = new Derived1(5,6);
        childofderived c = new childofderived(1,2,3);
    }
}
