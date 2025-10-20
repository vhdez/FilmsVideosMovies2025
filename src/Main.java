import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create a Film object
        // 1	1	Avatar	$2,923,710,708	2009	[# 1][# 2]
        LocalDate film1LocalDate = LocalDate.of(2009,1,1);
        Film film1 = new Film(1, "Avatar",2923710708L, film1LocalDate,1);

        // create a Movie object
        // The Lion King
        //March 3, 1995	48,500,000	32,000,000[1]	11,900,000 [2]	3,680,000[3]	$852,000,000[4][2][3]
        // 48500000, 32000000, 11900000, 3680000
        LocalDate video1LocalDate = LocalDate.of(2009,1,1);
        Video video1 = new Video(1, "The Lion King", 852000000L, video1LocalDate, 48500000, 32000000, 11900000, 3680000);

        // add them to an ArrayList
        ArrayList<Film> allFilms = new ArrayList<Film>();
        allFilms.add(film1);

        ArrayList<Video> allVideos = new ArrayList<Video>();
        allVideos.add(video1);

        // print all Objects in that ArrayList
        for (Film eachFilm : allFilms) {
            System.out.println(eachFilm);
        }

        for (Video eachVideo : allVideos) {
            System.out.println(eachVideo);
        }

    }
}