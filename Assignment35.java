interface Interface1 
{
    void method1();
}

interface Interface2
 {
    void method2();
}

class A 
{
	int i;
}


class B extends A implements Interface1, Interface2
 {
    @Override
    public void method1() 
    {
        System.out.println("Method1 called");
    }

    @Override
    public void method2() 
    {
        System.out.println("Method2 called");
    }

    int i; 
    B(int a, int b)
	{
        	super.i = a; 
        	i = b; 
	}
    void show() 
	{
        	System.out.println("i in superclass: " + super.i);
        	System.out.println("i in subclass: " + i);
	}
}

public class Assignment35
 {
    public static void main(String[] args) 
    {
        B example = new B(1, 2);
        example.method1();
        example.method2();
	example.show();
    }
}
