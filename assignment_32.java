abstract class Shape
{
    abstract double area();
}
class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape
{
    double length;
    double width;
    Rectangle (double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    double area()
    {
        return length*width;
    }
}
public class assignment_32
{
    public static void main(String args[])
    {
        Circle circle=new Circle(5.0);
        Rectangle rectangle= new Rectangle(4.0,6.0);
        System.out.println("Area of rectangle:"+ rectangle.area());
    }
}