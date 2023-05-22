import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Please make changes in this code file here
public class Client {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new ConcurrentHashMap<>();
        funWithMaps(map);

    }

    static String tester = "";
    static void funWithMaps(Map<String, Integer> map){
        map.put("abc", 140);
        map.put("def", 142);

        tester = map.getClass().getSimpleName();

        System.out.println(map.get("abc"));
        System.out.println(map.size());
    }
}