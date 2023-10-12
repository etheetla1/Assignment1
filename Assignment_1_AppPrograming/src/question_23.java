import java.util.Scanner;

public class question_23 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a letter: ");
        String LetterInput = scan.nextLine();
        LetterInput = LetterInput.toUpperCase();
        if (LetterInput.length() == 1 && Character.isLetter(LetterInput.charAt(0))) {
            char Letter = LetterInput.charAt(0);
            int Number = Letter - 'A' + 2;
            System.out.println("The corresponding number of " + Letter + " is: " + Number);
        } 
        else 
        {
            System.out.println("You have entered an invalid input. Please enter a single letter.");
        }

        scan.close();
    }
}
