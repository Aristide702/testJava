import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Livre livre1 = new Livre();
        livre1.setParameters("Les Misérables", "Victor Hugo", true);
        DVD dvd1 = new DVD();
        dvd1.setParameters("Indiana Jones");
        Media[] medias = { livre1, dvd1 };
        for (Media media : medias)
            media.decrire();
    }

    abstract static class Media {
        protected String titre;

        abstract void decrire();
    }

    public static class DVD extends Media {

        @Override
        public void decrire() {
            System.out.println("Ce DVD s'intitule " + this.titre + ".");
        }

        public void setParameters(String titre) {
            this.titre = titre;
        }

    }

    public static class Livre extends Media {

        private String auteur;
        private boolean disponible;

        // Méthodes
        public String getTitre() {
            return this.titre;
        }

        public String getAuteur() {
            return this.auteur;
        }

        public boolean getDisponible() {
            return this.disponible;
        }

        public void setParameters(String titre, String auteur, boolean disponible) {
            this.titre = titre;
            this.auteur = auteur;
            this.disponible = disponible;
        }

        @Override
        void decrire() {
            System.out.println("Ce livre a été écrit par " + this.auteur + " et s'intitule " + this.titre);
        }
    }

    public class Adherent {

        private String nom;
        private ArrayList<Livre> livresEmpruntes = new ArrayList<>();

        public void emprunter(Livre livre) {
            if (livre.disponible == true) {
                livresEmpruntes.add(livre);
                livre.disponible = false;
            } else {
                System.out.println("Le livre " + livre.titre + " écrit par " + livre.auteur
                        + " n'est pas disponible pour le moment.");
            }
        }
    }
}
