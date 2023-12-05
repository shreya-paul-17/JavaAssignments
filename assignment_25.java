public class assignment_25
{
    
        public String publicField= "This is a public field";
        private String privateField="This is a private field";
        protected String protectedField= "This is a protected field";
        String defaultField= "This is a default field";
        private assignment_25()
        {
            System.out.println("Inside the private constructor");
        }
        private void privateMethod()
        {
            System.out.println("This is a private method");
        }
        protected void protectedMethod()
        {
            System.out.println("This is a protected method");
        }
        public void publicMethod()
        {
            System.out.println("This is a public method");
        }
        void defaultMethod()
        {
            System.out.println("This is a default method");
        }
        public static void main (String args[])
        {
            assignment_25 obj=new assignment_25();
            System.out.println(obj.privateField);
            obj.privateMethod();
        }
    }
    
