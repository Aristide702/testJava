public class Exo_21 {
    public static void main(String[] args) throws Exception {
        String[] mots = { "Java", "est", "un", "langage", "puissant" };
        StringBuilder chaine = new StringBuilder();
        for (String mot : mots) {
            chaine.append(mot);
            chaine.append(" ");
        }
        System.out.println(chaine.toString() + " !");
    }
}
