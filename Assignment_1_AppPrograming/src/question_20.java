import java.util.Scanner;

public class question_20 {
	public static void main(String[] args) 
    {
        String Set1 =
            " 1  3  5  7\n" +
            " 9 11 13 15\n" +
            "17 19 21 23\n" +
            "25 27 29 31";

        String Set2 =
            " 2  3  6  7\n" +
            "10 11 14 15\n" +
            "18 19 22 23\n" +
            "26 27 30 31";

        String Set3 =
            " 4  5  6  7\n" +
            "12 13 14 15\n" +
            "20 21 22 23\n" +
            "28 29 30 31";

        String Set4 =
            " 8  9 10 11\n" +
            "12 13 14 15\n" +
            "24 25 26 27\n" +
            "28 29 30 31";

        String Set5 =
            "16 17 18 19\n" +
            "20 21 22 23\n" +
            "24 25 26 27\n" +
            "28 29 30 31";

        int Day = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(Set1);
        System.out.println("\nEnter Y for Yes and N for No: ");
        char Answer = scan.next().charAt(0);

        if (Answer == 'Y' || Answer == 'y') {
            Day = Day + 1;
        }

        System.out.println("\nIs your birthday in Set2?\n");
        System.out.println(Set2);
        System.out.println("\nEnter Y for Yes and N for No: ");
        Answer = scan.next().charAt(0);

        if (Answer == 'Y' || Answer == 'y') {
            Day = Day + 2;
        }

        System.out.println("\nIs your birthday in Set3?\n");
        System.out.println(Set3);
        System.out.println("\nEnter Y for Yes and N for No: ");
        Answer = scan.next().charAt(0);

        if (Answer == 'Y' || Answer == 'y') {
            Day = Day + 4;
        }

        System.out.println("\nIs your birthday in Set4?\n");
        System.out.println(Set4);
        System.out.println("\nEnter Y for Yes and N for No: ");
        Answer = scan.next().charAt(0);

        if (Answer == 'Y' || Answer == 'y') {
            Day = Day + 8;
        }

        System.out.println("\nIs your birthday in Set5?\n");
        System.out.println(Set5);
        System.out.println("\nPlease enter Y for Yes and N for No: ");
        Answer = scan.next().charAt(0);

        if (Answer == 'Y' || Answer == 'y') 
        {
            Day = Day + 16;
        }
        
        System.out.println("\nYour birthday is " + Day + "!");
    }
}
