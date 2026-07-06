import java.util.Scanner;

public class LeapYearAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if (year >= 1582) { // Fixed &gt;= to >=
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // Fixed &amp;&amp; to &&
                System.out.println(year + " is a Leap year.");
            } else {
                System.out.println(year + " is not a Leap year.");
            }
        } else {
            System.out.println("Year should be 1582 or later (Gregorian calendar).");
        }

        input.close(); // Closing the scanner to prevent resource leak
    }
}
