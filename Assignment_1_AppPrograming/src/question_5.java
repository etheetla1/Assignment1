import java.util.Scanner;

public class question_5 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

	    System.out.println("Please enter the number of minutes: ");
	    long Minutes = scan.nextLong();
	        
	    long MinutesInYear = 365 * 24 * 60; // minutes in a year
	    long Years = Minutes / MinutesInYear;
	    long RemainingMinutes = Minutes % MinutesInYear;
	    long Days = RemainingMinutes / (24 * 60); // minutes in a day
	        
	    System.out.println(Minutes + " minutes is approximately " + Years + " years and " + Days + " days.");
	    scan.close();
    }
}
