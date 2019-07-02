class A
{
    public void see()
    {
        System.out.println("Class A sees");
    }
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
        obj1.see();
    }
}
