public class App {
    public static void main(String[] args) throws Exception {
        int[] notes = { 12, 8, 17, 5, 14, 20 };
        float moyNotes = calculerMoyenne(notes);
        int maxNotes = trouverMax(notes);
        int admisNotes = compterAdmis(notes);
        System.out.println("Cet élève a une moyenne de" + moyNotes + "incluant" + admisNotes
                + "note.s au-dessus de la moyenne et la meilleure note est " + maxNotes);
    }

    static float calculerMoyenne(int[] nombres) {
        float moyenne = 0;
        for (int nombre : nombres) {
            moyenne += nombre;
        }
        moyenne = moyenne / nombres.length;
        return moyenne;
    }

    static int trouverMax(int[] nombres) {
        int max = 0;
        for (int nombre : nombres) {
            if (nombre > max)
                max = nombre;
        }
        return max;
    }

    static int compterAdmis(int[] nombres) {
        int admis = 0;
        for (int nombre : nombres) {
            if (nombre >= 10)
                admis++;
        }
        return admis;
    }

}
