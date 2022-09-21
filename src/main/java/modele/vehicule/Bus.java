package modele.vehicule;

public class Bus extends Vehicule{
  private  int nombreDePassager;

    public Bus(int nombreDeRoue, String marque,int nombreDePassager) {
        super(nombreDeRoue, marque);
        this.nombreDePassager = nombreDePassager;
    }

    public int getNombreDePassager() {
        return nombreDePassager;
    }

    public void setNombreDePassager(int nombreDePassager) {
        this.nombreDePassager = nombreDePassager;
    }
    public void infoBus(){
        System.out.println("Informations du bus, Marque : "+this.getMarque()+", Nombre de roue : "+this.getNombreDeRoue()+", nombre de passagers : "+this.getNombreDePassager());
    }
}