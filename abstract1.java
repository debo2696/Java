abstract class Num
{
    public void I(int A){}
    public void D(double F){}
}
class Int extends Num
{
    public void I(int a)
    {
        System.out.printf("%d an Integer\n",a);
    }
    
}
class Doub extends Num
{
    public void D(double d)
    {
        System.out.printf("%.3f a Float\n",d);
    }
    
}
class Send
{
    public static void main(String[] args) {
        Num n1=new Int();
        n1.I(8);
        n1=new Doub();
        n1.D(3.6);
    }
}
