public class array2 {
    public static void main(String[] args) {

        float[] marks = {5.0f,7.7f,8.0f,8.5f,5.5f};
        float num = 5.0f;
        boolean IsInArray = false;
        for(float elements:marks){
            if(num==elements){
                IsInArray = true;
                break;
            }
        }
        if(IsInArray){
            System.out.println("the value is present in the array");
        }
        else{
            System.out.println("the value is not present in the array");
        }
    }
}
