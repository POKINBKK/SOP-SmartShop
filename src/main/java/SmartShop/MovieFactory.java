package SmartShop;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieFactory {
    @Autowired
    private MovieRepository movieRepository;
    private static MovieFactory instance;

    private MovieFactory(){
    }

    public static MovieFactory getInstance(){
        if(instance==null)
            instance = new MovieFactory();
        return instance;
    }

    public void newMovie(MovieBean movie){
        movieRepository.save(movie);
    }
    
    public String showAllMovie(){
        Gson gson = new Gson();
        String json = gson.toJson(movieRepository.findAll());
        return json;
    }

    public String rentMovie(int movieId){
        MovieBean movie = movieRepository.getOne(movieId);
        int amount = movie.getAmountInStock();
        if(amount==0){ return "can't rent this movie"; }
        else{
            movie.setAmountInStock(amount-1);
            movieRepository.save(movie);
            return "rent complete";
        }
    }

    public String returnMovie(int movieId){
        MovieBean movie = movieRepository.getOne(movieId);
        int amount = movie.getAmountInStock();
        movie.setAmountInStock(amount+1);
        movieRepository.save(movie);
        return "return complete";
    }
}
