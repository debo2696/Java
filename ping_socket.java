import java.net.InetAddress;
import java.io.IOException;
import java.net.Socket;
import java.net.Socket;

class JPEx
{
    public JPEx() 
    {
        String ipAdress="google.com";
        try{
        InetAddress inet=InetAddress.getByName(ipAdress);
        System.out.println("Sending Ping request to: "+ipAdress);
        if(inet.isReachable(5000))
            System.out.println(ipAdress+" is reachable.");
        else
            System.out.println(ipAdress+" not reachable.");
        }
        catch(Exception e1){
            System.out.println("Exception: "+e1.toString());
        }
    }
}
class Sckt1
{
    public Sckt1() throws IOException
    {
        Socket s1=new Socket();
        int timeout=3000000;
        s1.setSoTimeout(timeout);
        System.out.println("Timeout value: "+s1.getSoTimeout());
    } 
}

class Running
{
    public static void main(String[] args)
    {
        JPEx a1=new JPEx();
        try{Sckt1 sck1=new Sckt1();}catch(Exception e2){System.out.println("Socket Exception: "+e2.toString());}
    }
}
