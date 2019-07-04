//This has the least no. of codes caouse first it has been reduced to Anonymous class then to Lambda expression cuz Runnable is an
//abstract class and has only run() fcn which makes it a @Functional interface.

class Major
{
    public static void main(String[] args)throws Exception
    {
        Runnable obj1=() -> 
            {
                int i=0;
                while(i<=5)
                {
                    System.out.println(i+" from class A");
                    i++;
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            };
        Runnable  obj2=() ->
            {
                int i=0;
                while(i<=5)
                {
                    System.out.println(i+" from class B");
                    i++;
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            };
        Runnable obj3=() ->
            {
                int i=0;
                while(i<=5)
                {
                    System.out.println(i+" from class C");
                    i++;
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            };
        Thread tA=new Thread(obj1);
        Thread tB=new Thread(obj2);
        Thread tC=new Thread(obj3);
        tA.setName("T1");tB.setName("T2");tC.setName("T3");
        tA.start();try{Thread.sleep(10);}catch(Exception e){}
        tB.start();try{Thread.sleep(20);}catch(Exception e){}
        tC.start();
        tA.join();tB.join();tC.join();
        System.out.println("Threads comlpeted their lifecycle");
        
    }
}
