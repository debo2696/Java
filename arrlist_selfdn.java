package javaapplication7;
import java.util.*;
import java.io.*;

public class JavaApplication7 {

    
    public static void main(String[] args)throws IOException {
        File f=new File("E:\\Android\\hllo1.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer();
        String ln;
        br=new BufferedReader(fr);
        while((ln=br.readLine())!=null){
            sb.append(ln);
            sb.append("");
        }
        fr.close();
        System.out.println(sb.toString());
        String s=sb.toString();
        String arr[]=s.split("@");
        ArrayList al=new ArrayList();
     
        for(String w:arr){
            al.add(w);
        }
        int count=0,i=0;
        for(i=0;i<al.size();i++){
            if(al.get(i).equals("debo"))
                count++;
        }
        System.out.println(count);
    }
    
}
