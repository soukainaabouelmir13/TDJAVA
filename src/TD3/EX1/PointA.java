package TD3.EX1;

class PointA extends Point {
    public PointA(int x, int y) {
        super(x, y);
    }

    public void affiche() {
        System.out.println("Coordonnées du point : (" + getX() + ", " + getY() + ")");
    }
}

