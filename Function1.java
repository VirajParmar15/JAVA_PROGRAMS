public class Function1 {

    int sum = 0;
    public  int addtwoInt(int a,int b){

        sum = a + b;

        return sum;
    }

}

class GFG {

    public static void main(String[] args) {

        Function1 add = new Function1();

        int s = add.addtwoInt(1,2);

        System.out.println("sum of two integer:"+s);
    }
}
