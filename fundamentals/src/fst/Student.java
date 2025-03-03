package fst;

public class Student {
    private String name;
     //ime godina studija, studij, sveuciliste
    private int godinaStudija;
    private String studij;
    private String sveuciliste;

    public Student(){
        System.out.println("Constructing without initial values!");
    }

    public Student(String name, int godinaStudija, String studij, String sveuciliste){
        this.name = name;
        this.godinaStudija = godinaStudija;
        this.studij = studij;
        this.sveuciliste = sveuciliste;
    }

    public String getName() {
        return name;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public String getStudij() {
        return studij;
    }

    public String getSveuciliste() {
        return sveuciliste;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setStudij(String studij) {
        this.studij = studij;
    }

    public void setSveuciliste(String sveuciliste) {
        this.sveuciliste = sveuciliste;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", godinaStudija=" + godinaStudija +
                ", studij='" + studij + '\'' +
                ", sveuciliste='" + sveuciliste + '\'' +
                '}';
    }
}
