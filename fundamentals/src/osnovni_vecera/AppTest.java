package osnovni_vecera;

import outsource_vecera.Desert;
import outsource_vecera.GlavnoJelo;

import java.lang.management.GarbageCollectorMXBean;

public class AppTest {
    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Juha", 4.5);
        GlavnoJelo glavnoJelo = new GlavnoJelo("But", 10.5);
        Desert desert = new Desert("Becka torta", 5);
        Vecera vecera = new Vecera(predjelo, glavnoJelo, desert);
        double cijena = vecera.finalPrice();
        System.out.println("Za platiti: " + cijena);
    }
}
