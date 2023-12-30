package TD3.EX5;

public class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbP) {
        super(nbP);
    }

    public Avion(int nbP, int nbM) {
        super(nbP);
        nbMoteur = nbM;
    }
}

