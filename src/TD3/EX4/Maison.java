package TD3.EX4;

class Maison extends Batiment {
    private int nbChambres;

    public Maison() {
        super();
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    // Accesseurs et mutateurs pour le nombre de chambres
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }
    public String toString() {
        return "Maison { " + super.toString() + ", NbChambres = " + nbChambres + " }";
    }
}

