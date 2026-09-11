public class Exo_19 {
    public static boolean estPalindrome(String mot) {
        String inverse = new StringBuilder(mot).reverse().toString();
        if (mot.equals(inverse)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        String[] mots = { "radar", "avion", "kayak", "chat", "hannah", "Anna" };
        for (String mot : mots)
            System.out.println(mot + " = " + estPalindrome(mot));
    }
}
