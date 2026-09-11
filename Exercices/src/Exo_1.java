public class Exo_1 {
    public static void main(String[] args) throws Exception {
        String prenom = "Aristide";
        int age = 24;
        double taille = 1.77;

        if (age >= 18) {
            System.out.println("Je m'appelle " + prenom + ", j'ai " + age + " ans, je mesure " + taille + "m et je suis majeur.");
        } else {
            System.out.println("Je m'appelle " + prenom + ", j'ai " + age + " ans, je mesure " + taille + "m et je suis mineur.");
        }
    }
}
