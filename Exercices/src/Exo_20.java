public class Exo_20 {
    public static void main(String[] args) throws Exception {
        String[] mots = { "avion", "renard", "ordinateur", "langage" };
        char lettre;
        for (String mot : mots) {
            int compteur = 0;
            for (int i = 0; i < mot.length(); i++) {
                lettre = mot.charAt(i);
                if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u'
                        || lettre == 'y') {
                    compteur++;
                }
            }
            System.out.println("Le mot " + mot + " contient " + compteur + " voyelles.");
        }

    }
}
