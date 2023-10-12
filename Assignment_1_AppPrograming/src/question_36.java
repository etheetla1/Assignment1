
public class question_36 {
	public static void main(String[] args) 
    {
        int Number = 456;
        int ReversedNumber = Reverse(Number);
        System.out.println("Reversed number: " + ReversedNumber);
        
        boolean isPalindromic = isPalindrome(Number);
        System.out.println("Is palindrome: " + isPalindromic);
    }
    
    public static int Reverse(int number) 
    {
        int ReversedNumber = 0;
        while (number != 0) {
            int Digit = number % 10;
            ReversedNumber = ReversedNumber * 10 + Digit;
            number = number / 10;
        }
        return ReversedNumber;
    }
    
    public static boolean isPalindrome(int Number) {
        return Number == Reverse(Number);
    }
}
