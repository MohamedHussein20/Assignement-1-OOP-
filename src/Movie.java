public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }
        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }
        return pgMovies;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Lord Of The Rings", "ABC Productions", "PG13");
        System.out.println("Title: " + movie.title + ", Studio: " + movie.studio + ", Rating: " + movie.rating);
    }
}