package de1;
import java.io.*;
import java.util.*;
public class De1 {

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a;    
        System.out.println("Enter your strings:");
        a=br.readLine();
        String []h=a.split(" ");
        ArrayList alist=new ArrayList();
        for(String words:h)
        {
            alist.add(words);
        }
        //String fw="";
        int pos=0,neg=0;
        for(int i=0;i<alist.size();i++)
        {
            if(alist.get(i).equals("good")||alist.get(i).equals("beautiful"))
                pos++;
            else
                neg++;
        }
        System.out.println("No. of POSITIVE words:"+pos);
        System.out.println("No. of NEGATIVE words:"+neg);
    }
}
