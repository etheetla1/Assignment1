import java.util.Scanner;

public class question_14 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first edge: ");
        double E1 = scan.nextDouble();
        
        System.out.println("Please enter the second edge: ");
        double E2 = scan.nextDouble();
        
        System.out.println("Please enter the third edge: ");
        double E3 = scan.nextDouble();

        if (E1 + E2 > E3 && E1 + E3 > E2 && E2 + E3 > E1) 
        {
            double Perimeter = E1 + E2 + E3;
            System.out.println("The perimeter of the triangle is " + Perimeter);
        } 
        else 
        {
            System.out.println(" You have entered an invalid input. The input does not form a valid triangle.");
        }

        scan.close();
    }
}
