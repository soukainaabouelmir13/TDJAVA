package TD2.EX4;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    // Constructeur par défaut
    public Temps() {
        this.heures = 0;
        this.minutes = 0;
        this.secondes = 0;
    }

    // Constructeur avec les heures
    public Temps(int heures) {
        setHeures(heures);
        this.minutes = 0;
        this.secondes = 0;
    }

    // Constructeur avec les heures et les minutes
    public Temps(int heures, int minutes) {
        setHeures(heures);
        setMinutes(minutes);
        this.secondes = 0;
    }

    // Constructeur avec les heures, les minutes et les secondes
    public Temps(int heures, int minutes, int secondes) {
        setHeures(heures);
        setMinutes(minutes);
        setSecondes(secondes);
    }

    // Constructeur de copie
    public Temps(Temps temps) {
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }

    // Accesseurs et mutateurs pour les heures, les minutes et les secondes
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures >= 0 && heures <= 23) {
            this.heures = heures;
        } else {
            throw new IllegalArgumentException("Les heures doivent être entre 0 et 23");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Les minutes doivent être entre 0 et 59");
        }
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes >= 0 && secondes <= 59) {
            this.secondes = secondes;
        } else {
            throw new IllegalArgumentException("Les secondes doivent être entre 0 et 59");
        }
    }

    // Méthodes pour ajouter des heures, des minutes et des secondes
    public void ajouterHeures(int heures) {
        int nouvelleHeure = (this.heures + heures) % 24;
        setHeures(nouvelleHeure);
    }

    public void ajouterMinutes(int minutes) {
        int totalMinutes = this.heures * 60 + this.minutes + minutes;
        setHeures(totalMinutes / 60);
        setMinutes(totalMinutes % 60);
    }

    public void ajouterSecondes(int secondes) {
        int totalSecondes = this.heures * 3600 + this.minutes * 60 + this.secondes + secondes;
        setHeures(totalSecondes / 3600);
        setMinutes((totalSecondes % 3600) / 60);
        setSecondes(totalSecondes % 60);
    }

    // Méthode toString pour afficher la représentation de la classe Temps
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }

    // Classe Main pour tester la classe Temps
    public static void main(String[] args) {
        Temps temps1 = new Temps(8, 30, 45);
        System.out.println("Temps 1: " + temps1.toString());

        Temps temps2 = new Temps(temps1);
        System.out.println("Temps 2 (copie de Temps 1): " + temps2.toString());

        temps2.ajouterHeures(2);
        temps2.ajouterMinutes(15);
        temps2.ajouterSecondes(30);
        System.out.println("Temps 2 après ajout de 2 heures, 15 minutes et 30 secondes: " + temps2.toString());
    }
}

