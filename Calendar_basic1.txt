package calen1;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calen1 
{


    public static void main(String[] args) {
        int hr,min,sec;
        GregorianCalendar dat=new GregorianCalendar();
        hr=dat.get(Calendar.HOUR);
        min=dat.get(Calendar.MINUTE);
        sec=dat.get(Calendar.SECOND);
        System.out.println("Time now:"+hr+" "+min+" "+sec);
    }
}
