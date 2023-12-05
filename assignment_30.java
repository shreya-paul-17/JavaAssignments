class Animal
{
    void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}
public class assignment_30
{
    public static void main(String args[])
    {
        Animal animal=new Animal();
        Dog dog=new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}