import java.time.LocalDate;

public class Video extends Movie {
    int allSales;
    int vhsSales;
    int dvdSales;
    int bluraySales;

    public Video(int rank, String title, long revenue, LocalDate releaseDate, int allSales, int vhsSales, int dvdSales, int bluraySales) {
        super(rank, title, revenue, releaseDate);
        this.allSales = allSales;
        this.vhsSales = vhsSales;
        this.dvdSales = dvdSales;
        this.bluraySales = bluraySales;
    }

    public int getAllSales() {
        return allSales;
    }

    public void setAllSales(int allSales) {
        this.allSales = allSales;
    }

    public int getVhsSales() {
        return vhsSales;
    }

    public void setVhsSales(int vhsSales) {
        this.vhsSales = vhsSales;
    }

    public int getDvdSales() {
        return dvdSales;
    }

    public void setDvdSales(int dvdSales) {
        this.dvdSales = dvdSales;
    }

    public int getBluraySales() {
        return bluraySales;
    }

    public void setBluraySales(int bluraySales) {
        this.bluraySales = bluraySales;
    }

    public String toString() {
        String name = "Video Rank #" + getRank();
        name += " is \"" + getTitle();
        name += "\" earned " + getRevenue();
        name += " , released on: " + getReleaseDate();
        return name;
    }
}
