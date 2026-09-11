public class Exo_23 {
    public static class CompteBancaire {
        private double solde = 0;

        public void getSolde() {
            System.out.println("Le solde est actuellement de " + solde + " €");
        }

        public void deposer(double montant) {
            if (montant > 0)
                this.solde += montant;
        }

        public void retirer(double montant) {
            if (montant > 0) {
                if (this.solde - montant < 0)
                    System.out.println("Solde insuffisant !");
                else
                    this.solde -= montant;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        CompteBancaire compte = new CompteBancaire();
        compte.getSolde();
        compte.deposer(1000);
        compte.getSolde();
        compte.retirer(1500);
        compte.retirer(500);
        compte.getSolde();
    }
}
