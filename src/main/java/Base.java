
import modele.vehicule.Bus;
import modele.vehicule.Vehicule;
import modele.vehicule.Voiture;

public class Base {
    public static void main(String[] args){
        Voiture peugeot = new Voiture("Peugeot",5);

        System.out.println(peugeot.getNombreDeRoue());
        System.out.println(peugeot.fraisKilometre(122000));
        peugeot.setMarque("1007");
        System.out.println(peugeot.getMarque());

        Bus stan = new Bus(6,"Mazda",80);
        System.out.println(stan.getNombreDeRoue());
        System.out.println(stan.getNombreDePassager());
       stan.infoBus();
    }
}
