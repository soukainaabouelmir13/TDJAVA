package TD3.EX4;

public class Main {

        public static void main(String[] args) {
            // Test de la classe Maison
            Maison maison1 = new Maison("123 Rue A", 3);
            System.out.println("Maison 1: " + maison1.toString());

            Maison maison2 = new Maison();
            maison2.setAdresse("456 Rue B");
            maison2.setNbChambres(4);
            System.out.println("Maison 2: " + maison2.toString());

            // Test de la classe Immeuble
            Immeuble immeuble1 = new Immeuble("789 Rue C", 10);
            System.out.println("Immeuble 1: " + immeuble1.toString());

            Immeuble immeuble2 = new Immeuble();
            immeuble2.setAdresse("101 Rue D");
            immeuble2.setNbAppart(20);
            System.out.println("Immeuble 2: " + immeuble2.toString());
        }
    }

