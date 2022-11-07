package ba.unsa.etf.rpr;

import java.lang.invoke.StringConcatFactory;
import java.util.Objects;

public abstract class TelefonskiBroj {
    private String broj;

    public String getBroj() {
        return broj;
    }

    public TelefonskiBroj(String broj) {
        this.broj = broj;
    }

    public abstract String ispisi();
    public abstract int hashCode();
    public boolean equals(Object o){
        TelefonskiBroj provjeri = (TelefonskiBroj)o;
        return broj.equals(provjeri.getBroj());
    }
}
