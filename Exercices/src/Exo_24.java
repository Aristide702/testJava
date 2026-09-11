public class Exo_24 {
    public static class Forme {
        public double calculerAire() {
            return 0;
        }
    }

    public static class Cercle extends Forme {
        double rayon;

        public Cercle(double rayon) {
            this.rayon = rayon;
        }

        @Override
        public double calculerAire() {
            return this.rayon * this.rayon * 3.141592;
        }
    }

    public static class Carré extends Forme {
        double cote;

        public Carré(double cote) {
            this.cote = cote;
        }

        @Override
        public double calculerAire() {
            return this.cote * this.cote;
        }
    }

    public static void main(String[] args) throws Exception {
        Forme[] formes = {new Cercle(3), new Carré(4)};
        for( Forme f : formes) {
        System.out.println(f.calculerAire());
        }

    }
}
