import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class question_44 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Set<Integer> distinctNumbers = new HashSet<>();

        System.out.println("Please enter ten numbers:");
        for (int i = 0; i < 10; i++) 
        {
            int number = scan.nextInt();
            distinctNumbers.add(number);
        }

        System.out.println("The number of distinct numbers is " + distinctNumbers.size());
        System.out.print("Distinct numbers: ");
        for (int number : distinctNumbers) 
        {
            System.out.print(number + " ");
        }
    }
}
