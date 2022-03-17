package guru.springframework.chucknorrisquotes.services;

import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesImpl implements ChuckNorrisQuotes{

    @Override
    public String getRandomQuote() {
        return "Chuck Norris Quote";
    }
}
