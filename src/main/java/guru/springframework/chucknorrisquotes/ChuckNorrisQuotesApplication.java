package guru.springframework.chucknorrisquotes;

import guru.springframework.chucknorrisquotes.controllers.JokesController;
import guru.springframework.chucknorrisquotes.models.ChucksQuotes;
import guru.springframework.chucknorrisquotes.services.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorrisQuotesApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(ChuckNorrisQuotesApplication.class, args);



    }

}
