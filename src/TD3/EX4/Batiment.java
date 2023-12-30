package TD3.EX4;

class Batiment {
    private String adresse;

    public Batiment() {
        this.adresse = "";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    // Accesseurs et mutateurs pour l'adresse
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString pour afficher la représentation du Bâtiment
    @Override
    public String toString() {
        return "Bâtiment { Adresse = " + adresse + " }";
    }
}
