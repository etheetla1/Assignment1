
public class question_29 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
		System.out.println();
        for (int i = 1; i <= 7; i++) 
        {
            for (int j = 1; j <= (7 - i); j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 6; i++) 
        {

            for (int j = 0; j <= 5 - i; j++) 
            {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
        for (int i = 0; i <= 6; i++) 
        {

            for (int j = 6; j <= 0; j--) 
            {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }

	}

}
