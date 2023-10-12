import java.util.Scanner;

public class question_34 {
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String Str1 = scan.nextLine();
        System.out.println("Please enter the second string: ");
        String str2 = scan.nextLine();

        int MinLength = Math.min(Str1.length(), str2.length());

        StringBuilder CommonPrefix = new StringBuilder();
        for (int i = 0; i < MinLength; i++) 
        {
            if (Str1.charAt(i) == str2.charAt(i)) 
            {
                CommonPrefix.append(Str1.charAt(i));
            } 
            else 
            {
                break; 
            }
        }
        if (CommonPrefix.length() > 0) 
        {
            System.out.println("Largest Common Prefix is: " + CommonPrefix);
        } 
        else 
        {
            System.out.println("There is no common prefix found :(");
        }

        scan.close();
    }
}
