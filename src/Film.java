import java.time.LocalDate;
import java.util.ArrayList;

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
}
