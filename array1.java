public class array1 {
    public static void main(String[] args) {

        float sum = 0;
        float []marks = new float[5];

        //float[] marks;
        //marks = new float[5];
        marks[0] = 95;
        marks[1] = 85;
        marks[2] = 75;
        marks[3] = 65;
        marks[4] = 55;

        for(float element:marks){
            sum = sum + element;

        }
        System.out.println(sum/ marks.length);

    }
}
