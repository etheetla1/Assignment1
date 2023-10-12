
public class question_31 {
	public static void main(String[] args) 
    {
        double i = 1;
        double j = 3;
        double sum = 0;
        
        while(i <= 97) {
        	sum = sum + (i / j);
        	i = i + 2;
        	j = j + 2;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
