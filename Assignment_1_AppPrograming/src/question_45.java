import java.util.Scanner;

public class question_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        int result = gcd(numbers);
        System.out.println("The GCD of the five numbers is: " + result);
    }

    public static int gcd(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }

        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }

        return gcd;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
