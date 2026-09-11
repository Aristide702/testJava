public class Exo_9 {
    public static void main(String[] args) throws Exception {
        int jour = 3;
        String nomJour = switch (jour) {
            case 1 -> "Lundi";
            case 2 -> "Mardi";
            case 3 -> "Mercredi";
            case 4 -> "Jeudi";
            case 5 -> "Vendredi";
            case 6 -> "Samedi";
            case 7 -> "Dimanche";
            default -> "Jour invalide";
        };
        System.out.println(nomJour);
    }
}
