import java.util.Scanner;

public class question_49 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String[] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("Please enter a year: ");
        int Year = scan.nextInt();
        int Index = Year % 12;
        System.out.println(animals[Index]);
    }
}
