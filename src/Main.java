import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Film.readFilmData();

        // create a Movie object
        // The Lion King
        //March 3, 1995	48,500,000	32,000,000[1]	11,900,000 [2]	3,680,000[3]	$852,000,000[4][2][3]
        // 48500000, 32000000, 11900000, 3680000
        LocalDate video1LocalDate = LocalDate.of(1995,3,3);
        new Video(1, "The Lion King", 852000000L, video1LocalDate, 48500000, 32000000, 11900000, 3680000);

        // print all Objects in that ArrayList
        System.out.println("ALL MOVIES: ");
        for (Movie eachMovie : Movie.getAllMovies()) {
            System.out.println(eachMovie);
        }

        System.out.println("ONLY FILMS: ");
        for (Film eachFilm : Film.getAllFilms()) {
            System.out.println(eachFilm);
        }

        System.out.println("ONLY VIDEOS: ");
        for (Video eachVideo : Video.getAllVideos()) {
            System.out.println(eachVideo);
        }

    }
}