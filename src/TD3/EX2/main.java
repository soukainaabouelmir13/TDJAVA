package TD3.EX2;

public class main {
    public static void main(String[] args) {
        PointNom pointNom = new PointNom(2, 3, 'A');

        pointNom.affCoordNom();

        pointNom.setPointNom(5, 7, 'B');
        pointNom.affCoordNom();

        pointNom.setNom('C');
        pointNom.affCoordNom();
    }
}

