
public class question_17 {
	public static void main(String[] args) 
    {
        double[][] Coordinates = 
        {
            {40.7571238, -73.9850450}, // Atlanta, Georgia
            {40.7571238, -73.9850450}, // Orlando, Florida
            {40.7571238, -73.9850450}, // Savannah, Georgia
            {40.7571238, -73.9850450}  // Charlotte, North Carolina
        };
        double Area = calculateArea(Coordinates);
        System.out.println("The estimated area enclosed by the coordinates: " + Area + " sq. units");
    }
    public static double calculateArea(double[][] coordinates) {
        int X = coordinates.length;
        double Sum1 = 0, Sum2 = 0;
        for (int i = 0; i < X - 1; i++) {
            Sum1 = Sum1 + coordinates[i][0] * coordinates[i + 1][1];
            Sum2 = Sum2 + coordinates[i][1] * coordinates[i + 1][0];
        }
        
        Sum1 = Sum1 + coordinates[X - 1][0] * coordinates[0][1];
        Sum2 = Sum2 + coordinates[X - 1][1] * coordinates[0][0];
        double Area = Math.abs((Sum1 - Sum2) / 2);
        return Area;
    }
}
