class employee{
        int id;
        String name;
        int salary;
        public int getSalary(){
            return salary;
        }
        public void printdetails(){
         System.out.println("employee id is "+id);
         System.out.println("employee name is "+name);
       }
}
public class OOP1 {
    public static void main(String[] args) {
        System.out.println("this is our custom class");

        employee e1 = new employee();
        employee e2 = new employee();

        e1.id=4059;
        e1.name="viraj";
        e1.salary=5000000;

        e2.id=4002;
        e2.name="vipsa";
        e2.salary=4000000;

        e1.printdetails();
        System.out.println(e1.id);
        System.out.println(e1.name);

        e2.printdetails();
        System.out.println(e2.id);
        System.out.println(e2.name);

        int salary = e1.getSalary();
        System.out.println(salary);
    }
}
