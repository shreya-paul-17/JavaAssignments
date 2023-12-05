public class assignment_21 
{
    public static void main(String[] args) 
    {
        // Create an instance of the Person class
        Person person = new Person("Shreya", 20);

        // Call a method and pass the object as an argument
        printPersonDetails(person);
    }

    // Method that takes a Person object as an argument
    public static void printPersonDetails(Person person)
    {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// A simple Person class
class Person
 {
    private String name;
    private int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
