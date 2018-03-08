import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercise16 {


    /*
    Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true if
no two keys map to the same value. For example, {Marty=206–9024, Hawking=123–4567, Smith=949–0504,Newton=123–4567} should return false, but {Marty=206–9024, Hawking=555–1234, Smith=949–0504,
Newton=123–4567} should return true. The empty map is considered 1-to-1 and returns true.
     */

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<String, String>();

        boolean sandt;

        map.put("Marty", "206-9024");
        map.put("Hawking","123-4567");
        map.put("Smith","949-0504");
        map.put("Newton","123-4567");

        System.out.println("Mappet uden metoden: " + map);

        sandt = is1to1(map);
        System.out.println("Med metoden: " + sandt);

        map.clear();

        map.put("Newton","123-4567");

        System.out.println(map);

        System.out.println("Mappet uden metoden: " + map);

        sandt = is1to1(map);
        System.out.println("Med metoden: " + sandt);
    }


    private static boolean is1to1 (Map<String, String> map)
    {
        // Laver et nyt set
        Set<String> set = new HashSet<>();

        // For hver gang navn i mappets keyset, gør følgende: Value er mappets navn. tilføj value til settet
        for (String navn :
                map.keySet()) {
            String value = map.get(navn);
            set.add(value);
        }

        // returner mappets størrelse som er lig med settets størrelse
        return map.size() == set.size();
    }
}
