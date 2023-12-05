class Animal
{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}
public class assignment_31
{
    public static void main(String args[])
    {
        Animal A;
        Animal a1=new Animal();
        Animal a2=new Animal();
        A=a1;
        a1.makeSound();
        A=a2;
        a2.makeSound();
    }
}