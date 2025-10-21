import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Film extends Movie {
    private int peak;
    private static ArrayList<Film> allFilms = new ArrayList<Film>();

    public Film(int rank, String title, long revenue, LocalDate releaseDate, int peak) {
        super(rank, title, revenue, releaseDate);
        this.peak = peak;
        allFilms.add(this);
    }

    public static ArrayList<Film> getAllFilms() {
        return allFilms;
    }

    public static void setAllFilms(ArrayList<Film> allFilms) {
        Film.allFilms = allFilms;
    }

    public int getPeak() {
        return peak;
    }

    public void setPeak(int peak) {
        this.peak = peak;
    }

    public String toString() {
        String superString = super.toString();
        String newString = "Film " + superString + " , peaking at: " + getPeak();
        return newString;
    }

    public static void readFilmData() throws Exception {
        File myData = new File("FilmsData");
        Scanner myReader = new Scanner(myData);
        String firstLine = myReader.nextLine();
        while (myReader.hasNextLine()) {
            String dataLine = myReader.nextLine();
            System.out.println(dataLine);

            Scanner lineScanner = new Scanner(dataLine);
            lineScanner.useDelimiter("\t");
            // 1	1	Avatar	$2,923,710,708	2009	[# 1][# 2]

            int rank = lineScanner.nextInt();
            int peak = lineScanner.nextInt();
            String title = lineScanner.next();

            String revenueChunk = lineScanner.next();
            revenueChunk = revenueChunk.replace("$","");
            revenueChunk = revenueChunk.replace(",","");
            revenueChunk = revenueChunk.replace("T","");

            long revenue = Long.parseLong(revenueChunk);

            int year = lineScanner.nextInt();
            LocalDate film1LocalDate = LocalDate.of(year, 1, 1);
            new Film(rank, title, revenue, film1LocalDate, peak);
        }

        // create a Film object

        for (int i = 0; i < 0; i = i + 1) {
            int rank = 1;
            String title = "Avatar";
            long revenue = 2923710708L;
            int year = 2009;
            LocalDate film1LocalDate = LocalDate.of(year, 1, 1);
            int peak = 1;

            new Film(rank, title, revenue, film1LocalDate, peak);
        }


    }
}
