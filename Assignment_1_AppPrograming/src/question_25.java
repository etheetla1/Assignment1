import java.util.Scanner;

public class question_25 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int pCount = 0;
        int nCount = 0;
        int total = 0;
        int number;
        
        do {
            System.out.print("Enter an integer (0 to quit): ");
            number = scan.nextInt();
            if (number != 0) 
            {
                if (number > 0) {
                    pCount++;
                } 
                else if (number < 0) 
                {
                    nCount++;
                }
                total = total + number;
            }
        } 
        while (number != 0);
        int totalCount = pCount + nCount;
        double average = (double) total / totalCount;

        System.out.println("Number of positive integers: " + pCount);
        System.out.println("Number of negative integers: " + nCount);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", average);

        scan.close();
    }
}
