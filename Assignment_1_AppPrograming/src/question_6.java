import java.util.Scanner;
public class question_6 {
	public static void main(String[] args) 
	 {
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("Please enter the time zone offset to GMT: ");
	    int TimeZone = scan.nextInt();
	 	long TotalMilliseconds = System.currentTimeMillis();
		long TotalSeconds = TotalMilliseconds / 1000;
		long CurrentSecond = TotalSeconds % 60;
		long TotalMinutes = TotalSeconds / 60;
		long CurrentMinute = TotalMinutes % 60;
		long TotalHours =TotalMinutes / 60;
		long CurrentHour = (TotalHours + TimeZone) % 24;
		System.out.println("The current time is " + CurrentHour + ":" + CurrentMinute + ":" + CurrentSecond + " GMT");
	 }
}
