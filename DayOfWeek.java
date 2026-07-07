import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input for date
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();
        
        System.out.print("Enter day (1-31): ");
        int d = input.nextInt();
        
        System.out.print("Enter year: ");
        int y = input.nextInt();
        
        // Adjusting the month and year for Zeller’s Congruence
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        // Applying Zeller’s formula
        int k = y % 100;  // Last two digits of year
        int j = y / 100;   // Century
        int d_0 = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Mapping result to days of the week
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        // Printing result
        System.out.println("Day of the Week: " + days[d_0]);

        input.close();
    }
}
