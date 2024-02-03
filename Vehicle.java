public class Vehicle {
    String vehicle_type;

    public Vehicle(String vt)
    {
        vehicle_type=vt;
    }
    public String getVehicleType() {
        return (this.vehicle_type);
    }


        public void display(){
        System.out.println("vehicle information: ");
        System.out.println("type: "+vehicle_type);
    }
}
class Car extends Vehicle{
    private String model_type, company_name;

    public Car(String m,String c){
        super("Car");

        model_type=m;
        company_name=c;
    }
    @Override
    public void display(){
        System.out.println("***********************************");
        System.out.println("Vehicle Information : ");
        System.out.println("Type : "+this.getVehicleType());
        System.out.println("Model : "+this.model_type);
        System.out.println("Company : "+this.company_name);
        System.out.println("***********************************");
    }
    public static void main(String args[])
    {
        Car c= new Car("Neno","TATA");
        c.display();
        Car c1= new Car("800","Maruti");
        c1.display();
        Vehicle v1 =new Vehicle("truck");
        v1.display();
    }
}

