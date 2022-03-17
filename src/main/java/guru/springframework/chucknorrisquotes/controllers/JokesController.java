package guru.springframework.chucknorrisquotes.controllers;

import guru.springframework.chucknorrisquotes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    private final JokesService jokesService;


    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getChuckNorrisQuotes(Model model){
        model.addAttribute("quote", jokesService.getRandomQuote());
       return "index";
    }
}
