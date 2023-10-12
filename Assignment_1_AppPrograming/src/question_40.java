import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question_40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scan.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
    	
                String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

                Pattern pattern = Pattern.compile(passwordPattern);

        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
