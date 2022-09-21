package modele.vehicule;

public class Voiture extends Vehicule{
    private int nombreDeChevaux;

    public Voiture(String marque,int nombreDeChevaux) {
        super(4,marque);
        this.nombreDeChevaux = nombreDeChevaux;
    }

    public int fraisKilometre(int nombreKlometre){
        return(nombreKlometre*nombreDeChevaux*34);
    }
}