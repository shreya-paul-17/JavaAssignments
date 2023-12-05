public class assignment_23
{
    public static void main(String[] args)
    {
        int number = 10;
        System.out.println("Before method call: " + number);

        // Call a method and pass the value of 'number'
        modifyNumber(number);

        // 'number' remains unchanged after the method call
        System.out.println("After method call: " + number);
    }

    // Method that modifies a copy of the value
    public static void modifyNumber(int num)
    {
        num = num * 2; // Modify the copy of 'number'
        System.out.println("Inside method: " + num);
    }
}
