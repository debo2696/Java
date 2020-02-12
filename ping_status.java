import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalTime;
  
public class ping_chck1 {
	public static void main(String args[]) throws Exception {
		
		System.out.println("S at: "+LocalTime.now());
		for(int i=2000;i<=3000;i++)
		{
			String status1 = getStatus("https://adm.ac.in/Backend/application/"+i);
			System.out.println(i+": "+ status1);
		}
		System.out.println("F at: "+LocalTime.now());
	}
 
	public static String getStatus(String url) throws IOException {
 
		String result = "";
		try {
			URL urlObj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
			con.setRequestMethod("GET");
                        // Set connection timeout
			con.setConnectTimeout(1500);
			con.connect();
 
			int code = con.getResponseCode();
			if (code == 200) {
				result = "On";
			}
		} catch (Exception e) {
			result = "Off";
		}
		return result;
	}
 
}
