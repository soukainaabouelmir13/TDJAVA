package TD2.EX2;

import java.util.Scanner;

public class Point {
    private double abscisse;
    private double ordonnee;

    // Constructeur par défaut
    public Point() {
        this.abscisse = 0.0;
        this.ordonnee = 0.0;
    }

    // Constructeur d'initialisation
    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    // Getter et Setter pour l'abscisse
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    // Getter et Setter pour l'ordonnee
    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    // Méthode pour calculer la norme (distance à l'origine)
    public double calculerNorme() {
        return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
    }

    // Méthode principale (exemple d'utilisation)
    public static void main(String[] args) {
        // Création d'un point par défaut
        Point point1 = new Point();
        System.out.println("Point 1 - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());
        System.out.println("Norme: " + point1.calculerNorme());

        // Création d'un point avec des coordonnées spécifiques
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'abscisse du point 2: ");
        double abscisse2 = scanner.nextDouble();
        System.out.print("Entrez l'ordonnee du point 2: ");
        double ordonnee2 = scanner.nextDouble();

        Point point2 = new Point(abscisse2, ordonnee2);
        System.out.println("Point 2 - Abscisse: " + point2.getAbscisse() + ", Ordonnee: " + point2.getOrdonnee());
        System.out.println("Norme: " + point2.calculerNorme());

        scanner.close();
    }
}
