package TD3.EX4;

class Immeuble extends Batiment {
    private int nbAppart;

    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    // Accesseurs et mutateurs pour le nombre d'appartements
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    // Méthode toString pour afficher la représentation de l'Immeuble
    @Override
    public String toString() {
        return "Immeuble { " + super.toString() + ", NbAppart = " + nbAppart + " }";
    }
}
