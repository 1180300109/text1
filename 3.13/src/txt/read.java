package txt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class read 
{
	public static void main(String[] args) 
	{	
		int i = readfile();
		System.out.println(i);
	}
	public static int readfile()
	{
		FileReader fr;
		String stringInfo = "";
		Pattern pattern = Pattern.compile("Flight:(.*?),(.*?)\n\\{\nDepartureAirport:(.*?)\nArrivalAirport:(.*?)\nDepatureTime:(.*?)\nArrivalTime:(.*?)\nPlane:(.*?)\n\\{\nType:(.*?)\nSeats:(.*?)\nAge:(.*?)\n\\}\n\\}\n");
		int cnt = 0;
		
		String pid ;
		String startplace;
		String endplace;
		String starttime , endtime;
		
		try {
			fr = new FileReader("src/txt/FlightSchedule_1.txt");
			BufferedReader br = new BufferedReader(fr);//缓冲
			while((stringInfo = br.readLine()) != null)
			{
				if(stringInfo.length() == 0)
					continue;
				for(int i = 0; i < 12 ;i++)
				{
					stringInfo = stringInfo + "\n" + br.readLine();
				}
				stringInfo += "\n";
				cnt++;
				
				Matcher matcher = pattern.matcher(stringInfo);
				
				if(!matcher.find())
				{
					System.out.println("语法格式错误，重新读入合法文件");
				}
				else
				{
					pid = matcher.group(2);
					startplace = matcher.group(3);
					endplace = matcher.group(4);
					starttime = matcher.group(5);
					endtime = matcher.group(6);
				}
			}
			return 0;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
