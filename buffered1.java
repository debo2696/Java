package de1;
import java.io.*;

public class De1 {

    
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a=Integer.parseInt(br.readLine());
        b=Integer.valueOf(br.readLine());
        c=a+b;
        System.out.println("Result is:"+c);
          
    }
}
