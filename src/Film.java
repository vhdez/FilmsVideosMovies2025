import java.time.LocalDate;

public class Film extends Movie {
    int peak;

    public Film(int rank, String title, long revenue, LocalDate releaseDate, int peak) {
        super(rank, title, revenue, releaseDate);
        this.peak = peak;
    }


}
