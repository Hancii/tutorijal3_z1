package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.stream.Collector;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;

    public Imenik() {
        imenik = new HashMap<>();
    }

    void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }
    
}
