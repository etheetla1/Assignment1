import java.util.Scanner;

public class question_16 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the details for the first rectangle:");
        System.out.println("Please enter the center x-coordinate: ");
        double X1 = scan.nextDouble();
        System.out.print("Please enter center y-coordinate: ");
        double Y1 = scan.nextDouble();
        System.out.print("Please enter the width: ");
        double Width1 = scan.nextDouble();
        System.out.print("Please enter the height: ");
        double Height1 = scan.nextDouble();
        System.out.println("Please enter the details for the second rectangle:");
        System.out.println("Please enter the center x-coordinate: ");
        double X2 = scan.nextDouble();
        System.out.println("Please enter the center y-coordinate: ");
        double Y2 = scan.nextDouble();
        System.out.print("Please enter the width: ");
        double Width2 = scan.nextDouble();
        System.out.println("Please enter the height: ");
        double Height2 = scan.nextDouble();
        double Left1 = X1 - Width1 / 2;
        double Right1 = X1 + Width1 / 2;
        double Top1 = Y1 + Height1 / 2;
        double Bottom1 = Y1 - Height1 / 2;
        double Left2 = X2 - Width2 / 2;
        double Right2 = X2 + Width2 / 2;
        double Top2 = Y2 + Height2 / 2;
        double Bottom2 = Y2 - Height2 / 2;
        
        if (Right1 >= Left2 && Left1 <= Right2 && Top1 >= Bottom2 && Bottom1 <= Top2) 
        {
            System.out.println("The rectangles overlap.");
        } 
        else if (Left1 <= Left2 && Right1 >= Right2 && Top1 >= Top2 && Bottom1 <= Bottom2) 
        {
            System.out.println("The second rectangle is inside the first rectangle.");
        } 
        else if (Left2 <= Left1 && Right2 >= Right1 && Top2 >= Top1 && Bottom2 <= Bottom1) 
        {
            System.out.println("The first rectangle is inside the second rectangle.");
        } 
        else 
        {
            System.out.println("The rectangles do not overlap.");
        }
        
        scan.close();
    }
}
