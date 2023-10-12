import java.util.Scanner;

public class question_21 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 15: ");
        int DecimalNumber = scan.nextInt();
        if (DecimalNumber >= 0 && DecimalNumber <= 15) {
            String HexNumber = Integer.toHexString(DecimalNumber);
            System.out.println("The hexadecimal representation of " + DecimalNumber + " is: " + HexNumber);
        } 
        else 
        {
            System.out.println("You have entered an invalid input. Please enter an integer between 0 and 15.");
        }
        
        scan.close();
    }
}
