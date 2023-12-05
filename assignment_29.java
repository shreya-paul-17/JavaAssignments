class Car
{
    String name;
    Car(String name)
    {
        this.name=name;
    }
    void park()
    {
        System.out.println(name+" is parked at the side of the road");
    }
}
class Tesla extends Car
{
    Tesla(String name)
    {
        super(name);
    }
    void drive()
    {
        System.out.println("I am driving "+name);
    }
}
public class assignment_29
{
    public static void main(String args[])
    {
        Tesla car=new Tesla("Tesla model 007");
        car.park();
        car.drive();
    }
}