package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj implements Comparable<FiksniBroj>{

    public FiksniBroj(Grad grad, String broj) {
        super(broj);
        this.grad = grad;
    }

    @Override
    public String ispisi() {
        return grad.toString() + "/" + super.getBroj();
    }

    @Override
    public int hashCode() {
        return grad.hashCode() + super.getBroj().hashCode();
    }

    @Override
    public int compareTo(FiksniBroj o) {
        return this.ispisi().compareTo(o.ispisi());
    }

    public enum Grad {
        BIHAĆ("037"), ORAŠJE("031"), TUZLA("035"), ZENICA("032"),
        GORAŽDE("038"), TRAVNIK("030"), MOSTAR("036"), ŠIROKIBRIJEG("039"),
        SARAJEVO("033"), LIVNO("034"), BRČKO("049");
        private final String name;
        private Grad(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }

    private Grad grad;

    public Grad getGrad() {
        return grad;
    }
}




