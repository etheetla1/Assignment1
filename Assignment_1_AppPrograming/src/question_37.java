import java.util.Scanner;

public class question_37 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double Num1 = scan.nextDouble();
        System.out.println("Please enter the second number: ");
        double Num2 = scan.nextDouble();
        System.out.println("Please enter the third number: ");
        double Num3 = scan.nextDouble();

        DisplaySortedNumbers(Num1, Num2, Num3);
    }

    public static void DisplaySortedNumbers(double Num1, double Num2, double Num3) {
        double Temp;
        if (Num1 > Num2) {
            Temp = Num1;
            Num1 = Num2;
            Num2 = Temp;
        }
        if (Num2 > Num3) {
            Temp = Num2;
            Num2 = Num3;
            Num3 = Temp;
        }
        if (Num1 > Num2) {
            Temp = Num1;
            Num1 = Num2;
            Num2 = Temp;
        }

        System.out.println("Numbers in increasing order: " + Num1 + " " + Num2 + " " + Num3);
    }
}
