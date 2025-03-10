package osnovni_vecera;

public class Predjelo {
    private String naziv;
    private double cijena;
    public Predjelo(String naziv, double cijena){
        this.naziv = naziv;
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Predjelo{" +
                "naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    String zadovoljstvoPredjelo(){
        return "Super";
    }

    public double getCijena() {
        return cijena;
    }
}
