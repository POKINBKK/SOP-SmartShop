package SmartShop;

public class MovieBean implements java.io.Serializable {
    private int movieId;
    private String movieName;
    private int amountInStock;
    private int dayToRent;

    public MovieBean(){

    }

    public MovieBean(int movieid, String moviename, int amountinstock, int daytorent){
        this.movieId = movieid;
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
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public boolean decreaseStock(){
        if(this.amountInStock == 0){
            return false;
        } else {
            this.amountInStock--;
            return true;
        }
    }

    public void IncreaseStock(){
        this.amountInStock++;
    }
}
