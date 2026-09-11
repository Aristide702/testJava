public class Exo_15 {
    public static void main(String[] args) throws Exception {
int[] nombres = {5, 8, 13, 21, 34};
int[] inverse=new int[nombres.length];
for(int i=0; i<=nombres.length-1;i++) {
    inverse[i]=nombres[nombres.length -1-i];
}
for(int nb : inverse)
System.out.println(nb);
    }
}
