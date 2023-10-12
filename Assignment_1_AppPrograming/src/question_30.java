import java.util.Scanner;

public class question_30 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the loan amount: $");
        double Amount = scan.nextDouble();

        System.out.println("Please enter loan period in years: ");
        int Years = scan.nextInt();
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

        for (double InterestRate = 5.0; InterestRate <= 8.0; InterestRate += 0.125) 
        {
            double MonthlyRate = InterestRate / 100 / 12;
            double MonthlyPayment = Amount * MonthlyRate / (1 - 1 / Math.pow(1 + MonthlyRate, Years * 12));
            double Total = MonthlyPayment * Years * 12;
            System.out.printf("%.3f%%\t\t$%.2f\t\t$%.2f\n", InterestRate, MonthlyPayment, Total);
        }
        scan.close();
    }
}
