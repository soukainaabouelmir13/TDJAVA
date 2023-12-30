package TD2.EX5;
public class Rectangle {
    private double longueur;
    private double largeur;

    // Constructeur par défaut
    public Rectangle() {
        this.longueur = 0.0;
        this.largeur = 0.0;
    }

    // Constructeur avec longueur et largeur
    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }

    // Constructeur de copie
    public Rectangle(Rectangle rectangle) {
        this.longueur = rectangle.longueur;
        this.largeur = rectangle.largeur;
    }

    // Accesseurs et mutateurs (avec vérification de valeurs positives)
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur >= 0) {
            this.longueur = longueur;
        } else {
            throw new IllegalArgumentException("La longueur doit être positive.");
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur >= 0) {
            this.largeur = largeur;
        } else {
            throw new IllegalArgumentException("La largeur doit être positive.");
        }
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode pour calculer l'aire
    public double aire() {
        return longueur * largeur;
    }

    // Méthode pour vérifier si le rectangle est un carré
    public boolean isCarre() {
        return longueur == largeur;
    }

    // Méthode toString pour afficher la représentation du rectangle
    @Override
    public String toString() {
        return "Rectangle { Longueur = " + longueur + ", Largeur = " + largeur + " }";
    }

    // Classe testRectangle pour tester la classe Rectangle
    public static class TestRectangle {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(5.0, 8.0);
            System.out.println("Rectangle 1: " + rectangle1.toString());
            System.out.println("Périmètre: " + rectangle1.perimetre());
            System.out.println("Aire: " + rectangle1.aire());
            System.out.println("Est un carré? " + rectangle1.isCarre());

            Rectangle rectangle2 = new Rectangle(rectangle1);
            System.out.println("Rectangle 2 (copie de Rectangle 1): " + rectangle2.toString());
        }
    }
}

