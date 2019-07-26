import java.util.*;
class A implements Runnable
{
    public void run()
    {
        int i,j,k;
        for(i=1;i<=6;i++)
        {
            for(j=i-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(k=6;k>=i;k--)
            {
                System.out.print("*");
                try{Thread.sleep(100);}catch(Exception e){}
            }
            System.out.print("\n");
            try{Thread.sleep(400);}catch(Exception e){}
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        int m,n,o;
        for(m=1;m<=6;m++)
        {
            for(n=6-1;n>=m;n--)
            {
                System.out.print(" ");
            }
            for(o=m;o>=1;o--)
            {
                System.out.print("*");
                try{Thread.sleep(100);}catch(Exception e){}
            }
            System.out.print("\n");
            try{Thread.sleep(400);}catch(Exception e){}
        }
    }
}

class Mma
{
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int times,x=1;
        A o1=new A();
        B o2=new B();
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        System.out.println("Times the thread will run?");
        times=sc.nextInt();
        System.out.println("Running both THREADS for "+times+" time(s)");
        while(x<=times)
        {
            t1.run();t2.run();
            x++;
        }
        //t1.join();t2.join();
        //System.out.println(t1.isAlive()+" "+t2.isAlive());
        System.out.println("~debo2696");
    }
}
