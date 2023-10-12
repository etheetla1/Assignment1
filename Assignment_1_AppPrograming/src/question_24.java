import java.util.*;
import java.util.regex.*;

	

public class question_24 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a Social Security number in the format of DDD-DD-DDDD: ");
        String SSN = scan.nextLine();
        
        String ssnPattern = "^(?!000|666|9\\d\\d)\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";

        if (SSN.matches(ssnPattern)) 
        {
            System.out.println("This is a valid Social Security Number.");
        } 
        else 
        {
            System.out.println("You have entered an invalid Social Security Number. Please enter in the format listed above.");
        }

        scan.close();
    }

    }

