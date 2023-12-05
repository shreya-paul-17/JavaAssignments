class A
{  
    private int data=40;  
    // private void msg(){
    //     System.out.println("Hello java");
    // }  
    // private A(){}//private constructor  
    void msg()
    {
        System.out.println("Hello java");
    }  
}

class MiddleName
{  
    public void msg()
        {
            System.out.println("Hello");
        } 
    
     
    protected void msg1()
    {
        System.out.println("Hello java");
    }  
} 


public class Assignment25
 {
    public static void main(String args[])
    {  
        //    FirstName obj=new FirstName();  
        //    System.out.println(obj.data);//Compile Time Error  
        //    obj.msg();//Compile Time Error 
           
           MiddleName obj1=new MiddleName();
           obj1.msg(); 
           obj1.msg1(); 
    }  
 }  

