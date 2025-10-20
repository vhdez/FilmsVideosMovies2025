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
        String name = "Film Rank #" + getRank();
        name += " is \"" + getTitle();
        name += "\" earned " + getRevenue();
        name += " , released on: " + getReleaseDate();
        name += " , peaking at: " + getPeak();
        return name;
    }
}
