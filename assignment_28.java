class Human
{
    String name;
    Human(String name)
    {
        this.name=name;
    }
    void play()
    {
        System.out.println(name+" is reading");
    }
}
class Girl extends Human
{
    Girl(String name)
    {
        super(name);
    }
    void sing()
    {
        System.out.println(name+" is writing");
    }
}
public class assignment_28
{
    public static void main(String args[])
    {
        Girl girl =new Girl("Shreya");
        girl.play();
        girl.sing();
    }
}