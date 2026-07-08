import java.util.Scanner;
class Movie {
    String title;  
    int[] ratings;
    Movie(String title, int[] ratings) {
        this.title = title;
        this.ratings = ratings;
    }
    double getAverage() {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }
}
public class MovieRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4]; // Store 4 movies
        Movie bestMovie = null;  // To track the top movie
        for (int i = 0; i < movies.length; i++) {
            System.out.print("Enter title of movie " + (i + 1) + ": ");
            String title = sc.nextLine();
            int[] ratings = new int[5]; // 5 viewers
            for (int j = 0; j < ratings.length; j++) {
                System.out.print("Enter rating from viewer " + (j + 1) + ": ");
                ratings[j] = sc.nextInt();
            }
            sc.nextLine(); 
            movies[i] = new Movie(title, ratings);
            if (bestMovie == null || movies[i].getAverage() > bestMovie.getAverage()) {
                bestMovie = movies[i];
            }
        }
        System.out.println("\nBest Movie: " + bestMovie.title);
        System.out.println("Average Rating: " + bestMovie.getAverage());
        sc.close();
    }
}
