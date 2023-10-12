import java.util.Random;
import java.util.Scanner;

public class question_13 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int Computer = random.nextInt(3);
        System.out.print("Enter 0 for Rock, 1 for Paper, or 2 for Scissor: ");
        int User = scan.nextInt();
        String[] Choices = {"Rock", "Paper", "Scissor"};
        System.out.println("Computer's choice was " + Choices[Computer]);
        System.out.println("Your choice was " + Choices[User]);
        if (User == Computer) {
            System.out.println("It's a draw!");
        } 
        else if ((User == 0 && Computer == 2) || (User == 1 && Computer == 0) || (User == 2 && Computer == 1)) 
        {
            System.out.println("You win!");
        } 
        else 
        {
            System.out.println("Computer wins!");
        }
        scan.close();
    }
}
