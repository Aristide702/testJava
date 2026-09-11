import java.util.ArrayList;
import java.util.List;

public class Exo_16 {
    public static void main(String[] args) throws Exception {
        List<String> courses = new ArrayList<>();
        courses.add("pain");
        courses.add("lait");
        courses.add("oeufs");

        for (String produit : courses) {
            System.out.println(produit);
        }
        courses.remove("lait");
        for (String produit : courses) {
            System.out.println(produit);
        }

    }
}
