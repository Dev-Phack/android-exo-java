public class Personne extends Etre implements HighCapacity{

    private String prenom;
    private String sexe;
    
    public Personne(String nom, String sexe, String prenom){
        this.sexe = sexe;
        this.prenom = prenom;
        this.nom = nom;
        this.race = "Humain";
    }

    public void presentation(){
        System.out.println(prenom + " de sexe " + sexe);
    }

// Redéfinission des méthodes abstraites de la classe abstraite Etre

    public void communiquer(String howCom){
        System.out.println(howCom);
    }

    public void seNourrir(String howEat){
        System.out.println("Se nourrit de: " + howEat);
    }

// Redéfinission des méthodes de l'interface HighCapacity
    
    public void penser(){
        System.out.println("Pense..");
    }

    public void raisonner(){
        System.out.println("Raisonne..");
    }

}
