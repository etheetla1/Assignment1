import java.util.Scanner;

public class question_22 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        char Letter = scan.next().charAt(0);
        
        if (Character.isLetter(Letter)) {
            char LowercaseLetter = Character.toLowerCase(Letter);
            
            if (LowercaseLetter == 'a' || LowercaseLetter == 'e' || LowercaseLetter == 'i' || LowercaseLetter  == 'o' || LowercaseLetter == 'u') {
                System.out.println("Your letter " + Letter + " is a vowel.");
            } 
            else 
            {
                System.out.println("Your letter " + Letter + " is a consonant.");
            }
        } 
        else 
        {
            System.out.println("You have entered an invalid input. Please enter a valid letter.");
        }
        
        scan.close();
    }
}
