package osnovni_vecera;

import outsource_vecera.Desert;
import outsource_vecera.GlavnoJelo;

public class Vecera {
    private Predjelo predjelo;
    private GlavnoJelo glavnoJelo;
    private Desert desert;

    public Vecera(Predjelo predjelo, GlavnoJelo glavnoJelo, Desert desert){
        this.predjelo = predjelo;
        this.glavnoJelo = glavnoJelo;
        this.desert = desert;
    }

    public double finalPrice(){
        return predjelo.getCijena() + glavnoJelo.getCijena() + desert.getCijena();
    }
}
