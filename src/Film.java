import java.time.LocalDate;

public class Film extends Movie {
    int peak;

    public Film(int rank, String title, long revenue, LocalDate releaseDate, int peak) {
        super(rank, title, revenue, releaseDate);
        this.peak = peak;
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
