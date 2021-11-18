abstract public class Etre {
    
    protected String nom;
    protected String race;

public void desc(){
    System.out.println(nom + " de la race : " + race);
}

abstract public void communiquer(String howCom);

abstract public void seNourrir(String howEat);

}
