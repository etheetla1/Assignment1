
public class question_35 {
	public static void main(String[] args) 
    {
        long Num = 12345;
        long Result = sumDigits(Num);
        System.out.println("The sum of digits is " + Result);
    }

    public static long sumDigits(long n) 
    {
        long Sum = 0;
        while (n != 0) 
        {
            Sum = Sum + n % 10; 
            n = n / 10;        }
        return Sum;
    }
}
