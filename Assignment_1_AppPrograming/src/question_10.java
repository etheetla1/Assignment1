import java.util.Random;

public class question_10 {
	public static void main(String[] args) 
    {
        Random random = new Random();
        int RandomMonth = random.nextInt(12) + 1;
        String MonthName;
        
        switch (RandomMonth) {
            case 1:
                MonthName = "January";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "July";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            case 12:
                MonthName = "December";
                break;
            default:
                MonthName = "Invalid month";
                break;
        }
        
        System.out.println("The randomly generated month is " + MonthName);
    }
}
