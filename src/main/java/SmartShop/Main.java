package SmartShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Main {

    @Autowired
    private MovieFactory movieFactory = MovieFactory.getInstance();

    public static void  main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String home(){
        return movieFactory.showAllMovie();
    }

    @RequestMapping(value = "/rent/{id}", method = RequestMethod.GET)
    public String rentMovie(@PathVariable int id){
        return movieFactory.rentMovie(id);
    }

    @RequestMapping(value = "/return/{id}", method = RequestMethod.GET)
    public String returnMovie(@PathVariable int id){
        return movieFactory.returnMovie(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addMovie(@RequestBody MovieBean movie){
        MovieBean newmovie = new MovieBean();
        newmovie.setMovieName(movie.getMovieName());
        newmovie.setAmountInStock(movie.getAmountInStock());
        newmovie.setDayToRent(movie.getDayToRent());
        System.out.println("hello"+newmovie.getMovieName());
        movieFactory.newMovie(newmovie);
        return "Add Movie Complete";
    }
}
