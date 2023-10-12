import java.util.Scanner;

public class question_18 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of sides of the regular polygon: ");
        int NumOfSides = scan.nextInt();
        System.out.println("Please enter the length of each side of the regular polygon: ");
        double SideLength = scan.nextDouble();
        double Area = (NumOfSides * SideLength * SideLength) / (4 * Math.tan(Math.PI / NumOfSides));
        System.out.println("The area of the regular polygon is: " + Area);
        scan.close();
    }
}
