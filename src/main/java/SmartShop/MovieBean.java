package SmartShop;

import javax.persistence.*;

@Entity
public class MovieBean {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String movieName;
    private int amountInStock;
    private int dayToRent;

    public MovieBean(){
    }

    public MovieBean(String moviename, int amountinstock, int daytorent){
        this.movieName = moviename;
        this.amountInStock = amountinstock;
        this.dayToRent = daytorent;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public int getDayToRent() {
        return dayToRent;
    }

    public void setDayToRent(int dayToRent) {
        this.dayToRent = dayToRent;
    }

    public int getMovieId() {
        return id;
    }

    public void setMovieId(int movieId) {
        this.id = movieId;
    }

}
