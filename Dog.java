public class Dog { String name , breed , color;int age;public Dog(String name , String breed , String color,int age)

    {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }public String getName(){
        return name;
    }public String getbreed(){
        return breed;
    }public String getColor(){
        return color;
    }public int getage(){
        return age;
    }

    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
                ".\nMy breed,age and color are " +
                this.getbreed()+"," + this.getage()+
                ","+ this.getColor());
    }

    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy","papillon","white",5);
        System.out.println(tuffy.toString());
    }
}
