package TD2;

public class Point {
    private char nom;
    private double abscisse;

    // Constructeur
    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    // Méthode pour afficher les informations du point
    public void affiche() {
        System.out.println("Point " + nom + " : Abscisse = " + abscisse);
    }

    // Méthode pour effectuer une translation
    public void translate(double translation) {
        abscisse += translation;
    }

    // Méthode principale (exemple d'utilisation)
    public static void main(String[] args) {
        // Création d'un point avec le nom 'A' et l'abscisse 5.0
        Point pointA = new Point('A', 5.0);

        // Affichage des informations du point
        pointA.affiche();

        // Translation du point de 2.5 unités
        pointA.translate(2.5);

        // Affichage des nouvelles informations après la translation
        pointA.affiche();
    }
}

