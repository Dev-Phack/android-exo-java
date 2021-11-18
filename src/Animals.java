public class Animals extends Etre{
    
    // private String com;
    public Animals(String nom){
        this.nom = nom;
        this.race = "Animaux";
    }


    public void communiquer(String howCom){
        // this.com = com;
        System.out.println(howCom);
    }

    public void seNourrir(String howEat){
        System.out.println("Se nourrit de: " + howEat);
    }

}
