import java.util.Scanner;
public class question_7 {
	public static void main(String[] args) 
    {
        final double PoundsToKilos = 0.45359237;
        final double InchesToMeters = 0.0254;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your weight in pounds: ");
        double WeightInPounds = scan.nextDouble();
        
        System.out.println("Please enter your height in inches: ");
        double HeightInInches = scan.nextDouble();
        
        double WeightInKilos = WeightInPounds * PoundsToKilos;
        
        double HeightInMeters = HeightInInches * InchesToMeters;
        
        double BMI = WeightInKilos / (HeightInMeters * HeightInMeters);
        
        System.out.println("Your BMI is: " + BMI);

        scan.close();
    }
}
