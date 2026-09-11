import java.util.HashMap;
import java.util.Map;

public class Exo_17 {
    public static void main(String[] args) throws Exception {
Map<String, String> pays = new HashMap<>();
pays.put("France", "Paris");
pays.put("Espagne", "Madrid");
pays.put("Italie", "Rome");

System.out.println(pays.get("Espagne"));
System.out.println(pays.containsKey("Allemagne"));
    }
}
