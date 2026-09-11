public class Exo_25 {
    public interface Payable {
        void payer();
    }

    public static class Facture implements Payable {
        @Override
        public void payer() {
            System.out.println("Vous payez une facture.");
        }
    }

    public static class Salaire implements Payable {
        @Override
        public void payer() {
            System.out.println("Vous payez un salaire.");
        }
    }

    public static void main(String[] args) throws Exception {
        Facture f = new Facture();
        f.payer();
        Salaire s = new Salaire();
        s.payer();
    }
}
