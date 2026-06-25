import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the name of the traveler: ");
        String name = input.nextLine();

        System.out.print("Enter the city you're traveling from: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the city you're traveling via: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the city you're traveling to: ");
        String toCity = input.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours minutes): ");
        int hoursFromToVia = input.nextInt();
        int minutesFromToVia = input.nextInt();

        // Convert total time from fromCity to viaCity into minutes
        int timeFromToVia = (hoursFromToVia * 60) + minutesFromToVia;

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours minutes): ");
        int hoursViaToFinalCity = input.nextInt();
        int minutesViaToFinalCity = input.nextInt();

        // Convert total time from viaCity to toCity into minutes
        int timeViaToFinalCity = (hoursViaToFinalCity * 60) + minutesViaToFinalCity;

        // Compute total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        int totalHours = totalTime / 60;
        int totalMinutes = totalTime % 60;

        // Displaying the results
        System.out.println("\nTraveler: " + name);
        System.out.println("Traveling from: " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("Total distance traveled: " + totalDistance + " miles");
        System.out.println("Total time taken: " + totalHours + " hours and " + totalMinutes + " minutes");

        input.close(); // Closing scanner to prevent memory leaks
    }
}
