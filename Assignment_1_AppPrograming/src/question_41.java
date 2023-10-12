
public class question_41 {
	public static void main(String[] args) 
    {
        String inputString = "Hello, World!";
        char targetChar = 'l';
        int occurrences = Count(inputString, targetChar);
        System.out.println("The number of occurrences of " + targetChar + " is " + occurrences);
    }

    public static int Count(String str, char a) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == a) 
            {
                count++;
            }
        }
        return count;
    }
}
