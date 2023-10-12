import java.util.Scanner;


public class question_28 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter the number of lines from 1 to 15: ");
	int Lines = scan.nextInt();
	if (Lines >= 1 && Lines <= 15) 
	{
		for (int i = 1; i <= Lines; i++) 
		   {
		    for (int j = i; j >= 2; j--) 
		     {
		        System.out.print(j + " ");
		    	}
		                
		        for (int j = 1; j <= i; j++) 
		         {
		           System.out.print(j + " ");
		         }

		            System.out.println();
		            }
		        } 
		        else 
		        {
		            System.out.println("You have entered an invalid input. Please enter an integer from 1 to 15.");
		        }

		        scan.close();
	}
}
