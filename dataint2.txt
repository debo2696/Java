package de1;
import java.io.*;

public class De1 {

    
    public static void main(String[] args)throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        int a,b,c;
        a=Integer.parseInt(dis.readLine());
        b=Integer.valueOf(dis.readLine());
        c=a+b;
        System.out.println("Result is:"+c);
          
    }
}
