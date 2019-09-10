package SmartShop;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieFactory {
    @Autowired
    private MovieRepository movieRepository;

    public void newMovie(MovieBean movie){
        movieRepository.save(movie);
    }
    
    public String showAllMovie(){
        Gson gson = new Gson();
        String json = gson.toJson(movieRepository.findAll());
        return json;
    }

    public String rentMovie(int movieId){
        return "rent func";
    }

    public String returnMovie(int movieId){
        return "return func";
    }
}
