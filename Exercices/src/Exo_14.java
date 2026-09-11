public class Exo_14 {
    public static void main(String[] args) throws Exception {
int[] notes = {12, 8, 17, 5, 14};
int total=0;
int max=0;
for(int note : notes) {
total+=note;
if(note>max) {
    max=note;
}
}
double moyenne=total/notes.length;
System.out.println("La somme totale des notes est de "+total+" avec une note maximale de "+max+" et la moyenne est de "+ moyenne);
    }
}
