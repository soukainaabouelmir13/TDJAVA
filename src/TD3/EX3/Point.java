package TD3.EX3;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

