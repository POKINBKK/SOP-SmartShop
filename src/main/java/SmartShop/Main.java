package SmartShop;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Main {
    private MovieFactory movieFactory = new MovieFactory();
    private MovieBean movie1 = movieFactory.newMovie("ATM เออรักเออเร่อ",5,7);
    private MovieBean movie2 = movieFactory.newMovie("ชัตเตอร์ กดติดวิญญาณ", 10,7);
    private MovieBean movie3 = movieFactory.newMovie("เพื่อนสนิท",5,7);
    private MovieBean movie4 = movieFactory.newMovie("รถไฟฟ้ามาหานะเธอ", 10,7);
    private MovieBean movie5 = movieFactory.newMovie("ไอฟาย..แต๊งกิ้วเลิฟยู้",5,7);
    private MovieBean movie6 = movieFactory.newMovie("คิดถึงวิทยา", 10,7);
    private MovieBean movie7 = movieFactory.newMovie("พรจากฟ้า",5,7);
    private MovieBean movie8 = movieFactory.newMovie("แฟนเดย์ แฟนกันแค่วันเดียว", 10,7);
    private MovieBean movie9 = movieFactory.newMovie("น้อง พี่ ที่รัก",5,7);
    private MovieBean movie10 = movieFactory.newMovie("Friendzone ระวัง..สิ้นสุดทางเพื่อน", 10,7);


    public static void  main(String[] args){
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    String home(){
        return movieFactory.getAllMovie();
    }
}
