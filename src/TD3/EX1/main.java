package TD3.EX1;

public class main {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        PointA pointA = new PointA(5, 7);

        // Utilisation de la classe Point
        System.out.println("Coordonnées du point : (" + point.getX() + ", " + point.getY() + ")");
        point.deplace(3, 4);
        System.out.println("Coordonnées après déplacement : (" + point.getX() + ", " + point.getY() + ")");

        // Utilisation de la classe PointA
        pointA.affiche();
        pointA.deplace(1, 1);
        pointA.affiche();
    }
}

