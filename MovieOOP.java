class Movie {
    String title;
    String genre;
    double rating;
    Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + " / 10");
    }
}
public class MovieOOP {
    public static void main(String[] args) {
        // Creating movie object
        Movie myMovie = new Movie("Blue Is the Warmest Colour", "Romance", 10);
        // Calling method to display movie details
        myMovie.displayDetails();
    }
}