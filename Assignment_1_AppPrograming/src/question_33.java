import java.util.Scanner;

public class question_33 {
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
        double[] Numbers = new double[10];
        double Sum = 0;
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
           
            Numbers[i] = scan.nextDouble();
            Sum = Sum + Numbers[i];
        }

        double Mean = Sum / 10;
        double SumOfSquaredDifferences = 0;
        for (double Num : Numbers) 
        {
            SumOfSquaredDifferences = SumOfSquaredDifferences + Math.pow(Num - Mean, 2);
        }

        double StandardDeviation = Math.sqrt(SumOfSquaredDifferences / 10);
        System.out.println("Mean: " + Mean);
        System.out.println("Standard Deviation: " + StandardDeviation);

        scan.close();
    }
}
