import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.Calendar;
 
public class img_dwn1
{      
	public static void main(String[] args ) 
	{
    	// TODO Auto-generated method stub
		BufferedImage image =null;
		System.out.println("S at: "+LocalTime.now());
        	int err_no=0,succ_no=0;
        	for(int i=1;i<=2000;i++)
        	{	
        		try{
        		URL url =new URL("https://adm.ac.in/uploads/studentsdata/2018/photos/"+i+".jpg");
        		
        		// read the URL
        		image = ImageIO.read(url);
 
        		//for PNG
        		//ImageIO.write(image, "png",new File("C:/Libs/Resources/imgs/have_a_question.png"));
 
        		// for JPG
        		ImageIO.write(image, "jpg",new File("C:/Libs/Resources/imgs/stu2018/img_stu"+i+".jpg"));
        		succ_no++;
        		}catch(IOException e) {err_no++;}
        			//e0.printStackTrace();
        	}
        	System.out.println("Errored no: "+err_no+", Success no: "+succ_no);
			System.out.println("F at: "+LocalTime.now());
	}
}
