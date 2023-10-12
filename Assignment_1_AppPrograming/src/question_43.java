import java.util.Scanner;

public class question_43 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of students: ");
        int NumOfStudents = scan.nextInt();

        int[] Scores = new int[NumOfStudents];
        int bestScore = Integer.MIN_VALUE;
        for (int i = 0; i < NumOfStudents; i++) {
            System.out.println("Please enter the score for student " + (i + 1) + ": ");
            Scores[i] = scan.nextInt();

            if (Scores[i] > bestScore) {
                bestScore = Scores[i];
            }
        }

        for (int i = 0; i < NumOfStudents; i++) 
        {
            char Grade;
            if (Scores[i] >= bestScore - 10) 
            {
                Grade = 'A';
            } 
            else if (Scores[i] >= bestScore - 20) 
            {
                Grade = 'B';
            } 
            else if (Scores[i] >= bestScore - 30) 
            {
                Grade = 'C';
            } 
            else if (Scores[i] >= bestScore - 40) 
            {
                Grade = 'D';
            } 
            else 
            {
                Grade = 'F';
            }

            System.out.println("Student " + (i + 1) + " score is " + Scores[i] + " and grade is " + Grade);
        }
    }
}
