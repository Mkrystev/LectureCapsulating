package capsulating;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j

public class HashMapExample {


    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mihail", 25);
        map.put("Alex", 25);

        System.out.println(map.size());

        if (map.containsKey("Mihail")) {
            Integer a = map.get("Mihail");
            log.info("Mihail has value: {}", a);
            log.warn("Mihail has value: {}", a);
            //System.out.println("Mihail has value: " + a);

        }

        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            System.out.println("key: " + map1.getKey() + "..... value: " + map1.getValue());
        }
    }

}
