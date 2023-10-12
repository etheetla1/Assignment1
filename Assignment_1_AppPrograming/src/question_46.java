import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class question_46 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> studentScores = new HashMap<>();

        System.out.println("Please enter the number of students: ");
        int NumOfStudents = scan.nextInt();

        for (int i = 0; i < NumOfStudents; i++) 
        {
            System.out.println("Please enter the student name: ");
            String name = scan.next();
            System.out.print("Please enter the student score: ");
            int score = scan.nextInt();
            studentScores.put(name, score);
        }

        List<Map.Entry<String, Integer>> sortedStudents = new ArrayList<>(studentScores.entrySet());
        Collections.sort(sortedStudents, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        System.out.println("Student names in decreasing order of their scores:");
        for (Map.Entry<String, Integer> entry : sortedStudents)
        {
            System.out.println(entry.getKey());
        }
    }
}
