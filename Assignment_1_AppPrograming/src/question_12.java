import java.util.Scanner;

public class question_12 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three-digit integer: ");
        int Num = scan.nextInt();
        if (Num >= 100 && Num <= 999) 
        {
            int OriginalNumber = Num;
            int ReverseNumber = 0;
            while (Num != 0) {
                int Digit = Num % 10;
                ReverseNumber = ReverseNumber * 10 + Digit;
                Num = Num / 10;
        }
            
            if (OriginalNumber == ReverseNumber) 
            {
                System.out.println(OriginalNumber + " is a palindrome.");
            } 
            else 
            {
                System.out.println(OriginalNumber + " is not a palindrome.");
            }
        } 
        else 
        {
            System.out.println("You have entered an invalid input. Please enter a three-digit integer.");
        }
        
        scan.close();
    }
}
