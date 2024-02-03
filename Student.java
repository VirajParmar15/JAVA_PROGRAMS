import java.util.Scanner;

public class Student{

    String student_name;
    int roll_no , marks;

    Student(){

        student_name="viarj";
        roll_no = 59;
        marks = 90;
    }

    Student(String student_name,int roll_no,int marks){

        this.student_name=student_name;
        this.roll_no=roll_no;
        this.marks=marks;
    }

    public static void main(String S[]) {

        Scanner sc = new Scanner(System.in);

        Student s2 = new Student();
        s2.printDetails();

        System.out.println("enter student name:");
        String name = sc.next();
        System.out.println("Enter Roll Number :");
        int rno = sc.nextInt();
        System.out.println("Enter Total Marks Obtained (out of 100):");
        int mks = sc.nextInt();

        Student student1 = new Student(name, rno, mks);
        student1.printDetails();
    }

    void printDetails()
    {
        System.out.println("\n\nName :"+ student_name);
        System.out.println("Roll Number :"+ roll_no);
        System.out.println("Total Marks :"+ marks);
    }
}




