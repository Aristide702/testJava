public class Exo_18 {
    public static boolean estPair(int n) {
        boolean reponse;
        if(n%2==0)
reponse=true;
        else
            reponse=false;
        return reponse;
    }

    public static long factorielle(int n) {
        long total=n;
        for (int i=1; i<n; i++) {
total*=i;
        }
        return total;
    }

    public static int maximum(int a, int b) {
if(a<b)
    return b;
else
    return a;
    }

    public static double maximum(double a, double b) {
if(a<b)
    return b;
else
    return a;
    }
    public static void main(String[] args) throws Exception {
System.out.println(estPair(0));
System.out.println(estPair(24));
System.out.println(estPair(7));
System.out.println(factorielle(5));
System.out.println(factorielle(7));
System.out.println(factorielle(10));
    }
}
