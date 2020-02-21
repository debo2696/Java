import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.AWTException;
import java.lang.Runtime;

public class Keypressrobot1 {

	public static void main(String[] args)throws AWTException, IOException {
		// TODO Auto-generated method stub
		Runtime rs=Runtime.getRuntime();
		try {
			rs.exec("notepad");
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		String s1="THIS IS DEBAJYOTI DAS FROM SOME COMPANY, \nA VERY GOOD MORNING TO THE ONE LOOKING AT THIS NOTEPAD AUTOMATION 0";
		char a[]=s1.toCharArray();
		Robot robo1=new Robot();
		try 
		{
			int i=0;
			while(a[i] != '0')
			{
				robo1.keyPress(KeyEvent.VK_SHIFT);
				robo1.keyPress(a[i]);
				robo1.keyRelease(KeyEvent.VK_SHIFT);
				robo1.delay(70);
				robo1.keyPress(a[i++]);
				robo1.delay(600);
			}
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}

}
