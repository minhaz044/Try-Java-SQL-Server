import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class DateTime {
	void tryDateTime() {
		LocalTime time=  LocalTime.now();
		System.out.println(time);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(format.format(time));
		System.out.println("-------------------------------------------------------------------------------");
		
		Date date=new Date();
		SimpleDateFormat dft=new SimpleDateFormat("hh:mm:ss");
	    String newDate=dft.format(date).toString();
	    System.out.println("Current Time: " + newDate);
		System.out.println("-------------------------------------------------------------------------------");
		
		
		SimpleDateFormat tft=new SimpleDateFormat("YYYY:MM:DD");
	    String newTime=tft.format(date).toString();
	    System.out.println("Current Date: " + newTime);
		System.out.println("-------------------------------------------------------------------------------");
			Date gg= new Date(2018,12,02);
	    System.out.println(date.after(gg));
	}

}
