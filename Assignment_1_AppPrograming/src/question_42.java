import java.util.Scanner;

public class question_42 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a credit card number as a long integer: ");
        long creditCardNumber = scan.nextLong();

        if (isValid(creditCardNumber)) 
        {
            System.out.println("The credit card number is valid.");
        } 
        else 
        {
            System.out.println("The credit card number is invalid.");
        }
    }

    public static boolean isValid(long number) 
    {
        int TotalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (TotalSum % 10 == 0);
    }

    public static int sumOfDoubleEvenPlace(long number) 
    {
        int sum = 0;
        String num = number + "";
        for (int i = num.length() - 2; i >= 0; i -= 2) 
        {
            int doubleDigit = getDigit(Character.getNumericValue(num.charAt(i)) * 2);
            sum += doubleDigit;
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + number / 10;
        }
    }

    public static int sumOfOddPlace(long number) 
    {
        int Sum = 0;
        String Num = number + "";
        for (int i = Num.length() - 1; i >= 0; i -= 2) 
        {
            Sum = Sum + Character.getNumericValue(Num.charAt(i));
        }

        return Sum;
    }

    public static boolean prefixMatched(long Number, int d) 
    {
        return getPrefix(Number, d) == d;
    }

    public static int getSize(long d) 
    {
        return (int) (Math.log10(d) + 1);
    }

    public static long getPrefix(long Number, int k) 
    {
        String Num = Number + "";
        if (Num.length() > k) 
        {
            return Long.parseLong(Num.substring(0, k));
        }
        return Number;
    }
}
