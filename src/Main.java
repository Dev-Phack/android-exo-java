public class Main {
    public static void main(String[] args) throws Exception {
        Personne p = new Personne("HOUENOU", "Masculin", "Dupleix");
        p.desc();
        p.presentation();
        p.communiquer("Parole");
        p.seNourrir("Pain");
        p.penser();
        
        System.out.println("*******************************************");

        Animals a = new Animals("Chien");
        a.communiquer("Aboie");
        a.desc();
        a.seNourrir("OS");
    }
    
}

