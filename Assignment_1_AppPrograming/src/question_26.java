
public class question_26 {
	public static void main(String[] args) 
    {
        double Tuition = 10000; 
        double AnnualRate = 0.05; 

        for (int Year = 1; Year <= 10; Year++) 
        {
            Tuition = Tuition + Tuition * AnnualRate; 
        }

        double Total = 0;
        for (int Year = 1; Year <= 4; Year++) 
        {
            Total = Total + Tuition;
            Tuition = Tuition + Tuition * AnnualRate; 
        }
        System.out.printf("The tuition in ten years: $%.2f\n", Tuition);
        System.out.printf("The total cost of four years' worth of tuition after the tenth year is $%.2f\n", Total);
    }
}
