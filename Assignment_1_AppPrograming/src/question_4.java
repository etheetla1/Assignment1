import java.util.Scanner;

public class question_4 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an integer between 0 and 1000: ");
        int Num = scan.nextInt();
        if (Num >= 0 && Num <= 1000) 
        {
            int Sum = 0;
            while (Num > 0) 
            {
                Sum = Sum + (Num % 10);
                Num = Num / 10;
            }

            System.out.println("The sum of the digits is: " + Sum);
        } 
        else 
        {
          
            System.out.println("You have entered an invalid input. Please enter an integer between 0 and 1000.");
        }
        
        scan.close();
    }
}
