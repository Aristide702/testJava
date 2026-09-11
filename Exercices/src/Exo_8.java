public class Exo_8 {
    public static void main(String[] args) throws Exception {
int[] notes={8,11,15,18};
for(int note : notes) {
    if(note>=16)
        System.out.println("Excellent !");
    else if(note>=12)
        System.out.println("Bien !");
    else if (note>=10)
        System.out.println("Passable");
    else
        System.out.println("Insuffisant...");
}
    }
}
