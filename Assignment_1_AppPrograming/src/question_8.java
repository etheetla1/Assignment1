import java.util.Scanner;

public class question_8 {
	public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter X1 and Y1 (point 1): ");
       double X1 = scan.nextDouble();
       double Y1 = scan.nextDouble();
       
       System.out.println("Enter X2 and Y2 (point 2): ");
       double X2 = scan.nextDouble();
       double Y2 = scan.nextDouble();
       
       System.out.println("Enter X3 and Y3 (point 3): ");
       double X3 = scan.nextDouble();
       double Y3 = scan.nextDouble();
       
       double Area = Math.abs((X1 * (Y2 - Y3) + X2 * (Y3 - Y1) + X3 * (Y1 - Y2)) / 2.0);
       
       System.out.println("The area of the triangle is " + Area);
       
       scan.close();
   }
}
