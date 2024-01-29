 class constructors {

    int height;
    float radius;




    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

     public float getRadius() {
         return radius;
     }

     public void setRadius(float radius) {
         this.radius = radius;
     }

     public double getArea(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
     }

     public double getVolume(){
        return Math.PI*radius*radius*height;
     }
}

public class cylinder{

    public static void main(String[] args) {

        constructors c1 = new constructors();

        c1.setHeight(7);
        c1.setRadius(2);

        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
        System.out.println(c1.getArea());
        System.out.println(c1.getVolume());
    }

}
