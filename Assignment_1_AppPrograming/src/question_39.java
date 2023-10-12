import java.util.Scanner;

public class question_39 {
	public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter matrix size: ");
        int n = scan.nextInt();
        PrintMatrix(n);
    }

    public static void PrintMatrix(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                int RandomValue = (int) (Math.random() * 2);
                System.out.print(RandomValue + " ");
            }
            System.out.println();
        }
    }
}
