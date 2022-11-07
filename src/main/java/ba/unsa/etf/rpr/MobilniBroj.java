package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;

    public MobilniBroj(int mobilnaMreza, String broj) {
        super(broj);
        this.mobilnaMreza = mobilnaMreza;
    }
    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" + super.getBroj();
    }
    public int getMobilnaMreza() {
        return mobilnaMreza;
    }
    @Override
    public int hashCode() {
        return mobilnaMreza + super.getBroj().hashCode();
    }
}
