package TD2.EX3;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    // Constructeur par défaut
    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.prix = 0.0;
        this.annee = 0;
    }

    // Constructeur avec le titre
    public Livre(String titre) {
        this.titre = titre;
        this.auteur = "";
        this.prix = 0.0;
        this.annee = 0;
    }

    // Constructeur avec le titre et l'auteur
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = 0.0;
        this.annee = 0;
    }

    // Constructeur avec le titre, l'auteur et le prix
    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = 0;
    }

    // Constructeur avec le titre, l'auteur, le prix et l'année
    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    // Constructeur de copie
    public Livre(Livre livre) {
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.prix = livre.prix;
        this.annee = livre.annee;
    }

    // Accesseurs et mutateurs
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthode toString pour afficher la représentation de la classe Livre
    @Override
    public String toString() {
        return "Livre{ " +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                " }";
    }

    // Classe Main pour tester la classe Livre
    public static void main(String[] args) {
        Livre livre1 = new Livre("Titre1", "Auteur1", 29.99, 2022);
        System.out.println("Livre 1: " + livre1.toString());

        Livre livre2 = new Livre(livre1);
        System.out.println("Livre 2 (copie de Livre 1): " + livre2.toString());

        livre2.setPrix(39.99);
        System.out.println("Livre 2 après modification du prix: " + livre2.toString());
    }
}

