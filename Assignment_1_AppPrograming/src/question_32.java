import java.util.Scanner;

public class question_32 {
	public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int LargestNumber = 0;
        int Counter = 0;

        System.out.println("Please enter integers and enter 0 to stop:");

        int Num;
        do {
            Num = scanner.nextInt();
            if (Num > LargestNumber) 
            {
                LargestNumber = Num;
                Counter = 1;
            } 
            else if (Num == LargestNumber) 
            {
                Counter++;
            }
        } 
        while (Num != 0);

        if (LargestNumber != 0) 
        {
            System.out.println("The largest number is: " + LargestNumber);
            System.out.println("Number of occurrences: " + Counter);
        } 
        else 
        {
            System.out.println("There are no valid numbers entered.");
        }
        scanner.close();
    }
}
