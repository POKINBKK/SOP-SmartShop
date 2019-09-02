package SmartShop;

public class MovieFactory {
    private int amountOfMovie = 0;
    public MovieBean newMovie(String movieName, int amountInStock, int dayToRent){
        MovieBean movie = new MovieBean(this.amountOfMovie, movieName, amountInStock, dayToRent);
        increaseAmountofMovie();
        return movie;
    }

    private void increaseAmountofMovie(){
        this.amountOfMovie++;
    }
}
