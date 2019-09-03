package SmartShop;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MovieFactory {
    private int amountOfMovie = 0;
    List<MovieBean> movieDB = new ArrayList<MovieBean>();
    public MovieBean newMovie(String movieName, int amountInStock, int dayToRent){
        MovieBean movie = new MovieBean(this.amountOfMovie, movieName, amountInStock, dayToRent);
        increaseAmountofMovie();
        movieDB.add(movie);
        return movie;
    }

    private void increaseAmountofMovie(){
        this.amountOfMovie++;
    }
    
    public String getAllMovie(){
        Gson gson = new Gson();
        String json = gson.toJson(movieDB);
        return json;
    }

    public String rentMovie(int movieId){
        if(movieId <= amountOfMovie){
            MovieBean currentMovie = movieDB.get(movieId);
            currentMovie.decreaseStock();
            return "RentMovie Complete";
        } else {
            return "RentMovie Incomplete insert movieId Correctly";
        }
    }

    public String returnMovie(int movieId){
        if(movieId <= amountOfMovie){
            MovieBean currentMovie = movieDB.get(movieId);
            currentMovie.IncreaseStock();
            return "ReturnMovie Complete";
        } else {
            return "ReturnMovie Incomplete insert movieId Correctly";
        }
    }
}
