import java.util.*;
import java.lang.*;

public class Thh1 extends Thread {

    public static void main(String[] args) {
            mth1 m1=new mth1();
            mth2 m2=new mth2();
            System.out.print("Thread1pr:"+m1.getPriority()+" Thread2pr:"+m2.getPriority()+"\n");
            m1.start();
            m2.start();
    }
    
}

public class mth1 extends Thread {
    public void run(){
        int i;
        for(i=1;i<=20;i++){
            try{
                System.out.println("Th1==>"+i);
                sleep(500);//sleep throws Exception hence need to be caught
            }
            catch(Exception e){
                System.out.println(e1.toString());
            }
        }
    }
    
}

public class mth2 extends Thread{
    public void run(){
        int j;
        for(j=1;j<20;j++){
            try{
                System.out.println("Th2==>"+j);
                sleep(200);
            }
            catch(Exception e2){
                System.out.println(e2.toString());
            }
        }
    }
    
}
