import java.util.Scanner;

public class question_47 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Please enter ten numbers in the double format:");
        for (int i = 0; i < 10; i++) 
        {
            numbers[i] = scan.nextDouble();
        }

        sort(numbers);

        System.out.println("Sorted numbers:");
        for (double number : numbers) {
            System.out.println(number + " ");
        }
    }

    public static void sort(double[] array) 
    {
        int n = array.length;
        boolean Swapped;
        do 
        {
            Swapped = false;
            for (int i = 1; i < n; i++) 
            {
                if (array[i - 1] > array[i]) 
                {
                    double Temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = Temp;
                    Swapped = true;
                }
            }
            n = n - 1;
        } 
        while (Swapped);
    }
}
