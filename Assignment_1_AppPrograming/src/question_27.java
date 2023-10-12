import java.util.Scanner;

public class question_27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of students: ");
        int NumOfStudents = scan.nextInt();

        String HighestScorer = "";
        int HighestScore = Integer.MIN_VALUE;
        String SecondHighestScorer = "";
        int SecondHighestScore = Integer.MIN_VALUE;

        for (int i = 1; i <= NumOfStudents; i++) 
        {
            System.out.println("Please enter student #" + i + " Name: ");
            String Name = scan.next();
            System.out.println("Please enter student #" + i + " Score: ");
            int Score = scan.nextInt();

            if (Score > HighestScore) 
            {
                SecondHighestScore = HighestScore;
                SecondHighestScorer = HighestScorer;
                HighestScore = Score;
                HighestScorer = Name;
            } 
            else if (Score > SecondHighestScore) 
            {
                SecondHighestScore = Score;
                SecondHighestScorer = Name;
            }
        }
        
        System.out.println("The highest scoring student is " + HighestScorer + "  who got a score of " + HighestScore);
        System.out.println("The second highest scoring student is " + SecondHighestScorer + " who got a score of " + SecondHighestScore);

        scan.close();
	}

}
