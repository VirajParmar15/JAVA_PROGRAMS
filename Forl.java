public class Forl {

    public static void main(String[] args) {

        //int n = 4 ;

        //for (int i=4;i>0;i--){
        //    for(int j=0;j<i;j++){
        //        System.out.print("*");
        //    }
        //    System.out.print("\n");
        // }

        int i, j;
        for (i=1; i<5; i++) {
            for (j=0; j<i; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
