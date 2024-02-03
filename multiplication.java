public class multiplication {
    public static void main(String[] args) {

        int num = 7;
        int sum = 0;
        int i;

        for( i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
            sum += num*i;
        }

        System.out.println(sum);
    }
}
