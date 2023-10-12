
public class question_2 {
	 public static void main(String[] args) 
	    {
	        double A = 3.4;
	        double B = 50.2;
	        double C = 2.1;
	        double D = 0.55;
	        double E = 44.5;
	        double F = 5.9;
	        double Determinant = A * D - B * C;
	        if (Determinant != 0) 
	        {
	            double X = (E * D - B * F) / Determinant;
	            double Y = (A * F - E * C) / Determinant;
	            
	            System.out.println("The solution for X is " + X);
	            System.out.println("The solution for Y is " + Y);
	        }
	    }
}
