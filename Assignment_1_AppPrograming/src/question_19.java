import java.util.Scanner;

public class question_19 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an ASCII code (an integer between 0 and 127): ");
        int Code = scan.nextInt();
        if (Code >= 0 && Code <= 127) 
        {
            char Character = (char) Code;
            System.out.println("The character for ASCII code " + Code + " is " + Character);
        } 
        else 
        {
            System.out.println("You have entered an invalid input. Please enter an ASCII code between 0 and 127.");
        }
        scan.close();
    }
}
