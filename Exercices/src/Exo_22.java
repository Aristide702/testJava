public class Exo_22 {
    public static class Rectangle {
        private double longueur;
        private double largeur;

        public double surface() {
            return this.largeur * this.longueur;
        }

        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }
    }

    public static void main(String[] args) throws Exception {
        Rectangle terrain = new Rectangle(21, 29.7);
        System.out.println("Le rectangle a une superficie de " + terrain.surface() + " m².");
    }
}
