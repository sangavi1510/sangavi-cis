import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;


    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }


    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }


    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparing(Movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget());


    public static Comparator<Movie> yearReleasedAndRatingComparator = Comparator
            .comparingInt(Movie::getYearReleased)
            .thenComparingDouble(Movie::getRating);


    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2000, 8.5, 50_000_000, 150_000_000));
        movies.add(new Movie(1995, 7.8, 30_000_000, 100_000_000));
        movies.add(new Movie(2010, 9.0, 80_000_000, 300_000_000));


        Collections.sort(movies, Movie.ratingAndProfitComparator);
        System.out.println("Sorted by Rating and Profit:");
        movies.forEach(System.out::println);


        Collections.sort(movies, Movie.yearReleasedAndRatingComparator);
        System.out.println("\nSorted by Year Released and Rating:");
        movies.forEach(System.out::println);
    }


    @Override
    public String toString() {
        return "Movie{" +
                "yearReleased=" + yearReleased +
                ", rating=" + rating +
                ", budget=" + budget +
                ", collectionAmount=" + collectionAmount +
                '}';
    }
}
