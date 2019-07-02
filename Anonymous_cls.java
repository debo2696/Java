class A
{
    public void see()
    {
        System.out.println("Class A sees");
    }
}
interface B
{
    public abstract void hello();
}
interface C{
    public abstract void lam();
}
class Seeker
{
    public static void main(String[] args) {
        A obj1=new A()
        {
            public void see()
                {
                    System.out.println("I'm an anonymous class");
                }
        };
        B int1=new B()//Normally we can't create an object/instance of interface but with anonymous class we can
        {
            public void hello()
            {
                System.out.println("Overloading the interface");
            }    
        };
        
        C int2=() -> System.out.println("Overloading interface using Lambda expression");
        
        obj1.see();
        int1.hello();
        int2.lam();
    }
}
