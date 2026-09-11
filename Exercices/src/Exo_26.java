public class Exo_26 {
    abstract static class Vehicule {
        protected int vitesse;

        abstract void demarrer();
    }

    public static class Voiture extends Vehicule {
        public void demarrer() {
            System.out.println("Le moteur de la voiture se met à vrombir !");
        }
    }

    public static class Moto extends Vehicule {
        public void demarrer() {
            System.out.println("Le moteur de la moto se met à vrombir !");
        }
    }

    public static void main(String[] args) throws Exception {
        Vehicule[] vehicules = { new Voiture(), new Moto() };
        for (Vehicule v : vehicules) {
            v.demarrer();
        }
    }
}
