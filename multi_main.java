import java.util.*;
class A
{
    public static void main(String[] args) 
    {
        int ns=15,ns1=8,psvd;
        String brands[]=new String[]{"Sony","IBM","Apple"};
        B mainB=new B();
        System.out.println("Debajyoti ");
        mainB.main(brands);
    }
}
class B
{
    static int bvar=1;   
    public static void main(String[] args) 
    {
        String drinks[]=new String[]{"No","Use"};
        int i=0;
        A mainA=new A();
        System.out.println("Das");
        mainA.main(drinks);      
    }
}
   
