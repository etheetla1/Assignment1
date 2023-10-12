import java.util.Scanner;

public class question_11 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter today's day (0 for Sunday, 1 for Monday, ...,): ");
        int Today = scan.nextInt();
        System.out.println("Please enter the number of days elapsed since today: ");
        int ElapsedDays = scan.nextInt();
        int FutureDay = (Today + ElapsedDays) % 7;
        
        System.out.println("Today is ");
        switch(Today) 
        {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Invalid input"); break;
        }
        
        System.out.println("So the future day will be ");
        switch(FutureDay)
        {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
        }

        scan.close();
    }
}
