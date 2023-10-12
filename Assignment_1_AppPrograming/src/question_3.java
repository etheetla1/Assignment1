import java.util.Scanner;

public class question_3 {
	 public static void main(String[] args) 
	    {
	        	Scanner scan = new Scanner(System.in);
			        
			    System.out.println("Please enter the Subtotal: ");
			    double Subtotal = scan.nextDouble();
			        
			    System.out.println("Please enter the gratuity rate in percentage: ");
			    double GratuityRate = scan.nextDouble();
			        
			    double Gratuity = Subtotal * (GratuityRate / 100);
			    double Total = Subtotal + Gratuity;
			    System.out.println("Your gratuity is: $" + Gratuity + " which makes your total: $" + Total);     
			   
			    scan.close();
	 	}
}
