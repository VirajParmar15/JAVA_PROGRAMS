public class arrayofobject {
    public static void main(String[] args) {

        Product[] obj = new Product[5];

        obj[0] = new Product(23907, "Dell" );
        obj[1] = new Product(91204, "Hp" );
        obj[2] = new Product(29823, "LG" );
        obj[3] = new Product(11908, "MI" );
        obj[4] = new Product(43590, "KINGSTON" );

        System.out.println("Product Object 1:" );
        obj[0].display();
        System.out.println("Product Object 2:" );
        obj[1].display();
        System.out.println("Product Object 3:" );
        obj[2].display();
        System.out.println("Product Object 4:" );
        obj[3].display();
        System.out.println("Product Object 5:" );
        obj[4].display();
    }
}
class Product1
{
    int pro_id;
    String pro_name;

    Product1(int pid,String n) {
        pro_id = pid;
        pro_name = n;
    }
    public void display()
    {
        System.out.println("Product id="+pro_id+" "+"Product name"+pro_name);
    }
}
