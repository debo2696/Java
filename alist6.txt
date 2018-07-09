package de1;
import java.io.*;
import java.util.*;
public class De1 {

    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a;    
        System.out.println("Enter your string:");
        a=br.readLine();
        String []h=a.split("");
        ArrayList alist=new ArrayList();
        for(String words:h)
        {
            alist.add(words);
        }
        String fw="";
        for(int i=0;i<alist.size();i++)
        {
            if(i%2==0)
            {
                fw=fw+"ION";
            }
            else
            {
                fw=fw+alist.get(i);
            }
        }
        System.out.println("After Encryption:"+fw);
    }
}
