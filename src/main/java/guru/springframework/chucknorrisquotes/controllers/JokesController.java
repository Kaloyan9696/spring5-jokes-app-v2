package guru.springframework.chucknorrisquotes.controllers;

import guru.springframework.chucknorrisquotes.services.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    private final ChuckNorrisQuotes chuckNorrisQuotes;


    public JokesController(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @RequestMapping("/")
    public String getChuckNorrisQuotes(Model model){
        model.addAttribute("quote", chuckNorrisQuotes.getRandomQuote());
       return "index";
    }
}
