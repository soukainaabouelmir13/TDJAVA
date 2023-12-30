package TD3.EX6;

public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Figure [nom=" + nom + "]";
    }
}

