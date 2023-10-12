import java.util.Scanner;

public class question_9 {
	public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the value of a: ");
        double A = scan.nextDouble();
        
        System.out.println("Please enter the value of b: ");
        double B = scan.nextDouble();
        
        System.out.println("Please enter the value of c: ");
        double C = scan.nextDouble();
        
        double Discriminant = B * B - 4 * A * C;
        
        if (Discriminant > 0) 
        {
            double R1 = (-B + Math.sqrt(Discriminant)) / (2 * A);
            double R2 = (-B - Math.sqrt(Discriminant)) / (2 * A);
            System.out.println("The equation has two real roots: R1 = " + R1 + " and R2 = " + R2);
        } 
        else if (Discriminant == 0) 
        {
            double R1 = -B / (2 * A);
            System.out.println("The equation has one real root: R1 = " + R1);
        } 
        else 
        {
            System.out.println("The equation has no real roots.");
        }
        
        scan.close();
    }
}
