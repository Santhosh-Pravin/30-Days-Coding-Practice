import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter day and month: ");
        int day = input.nextInt();
        int month = input.nextInt();
        
        // Check if the given date falls in the Spring season
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        input.close();
    }
}
