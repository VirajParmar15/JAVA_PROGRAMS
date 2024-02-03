import java.io.*;
class gsfc {

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setname(String n){
        name = n;
    }
}

public class OOP2 {
    public static void main(String[] args) {

        gsfc E1 = new gsfc();
        E1.setname("viraj");
        E1.salary=5000000;
        System.out.println(E1.getSalary());
        System.out.println(E1.getName());

    }
}
