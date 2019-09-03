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
}
