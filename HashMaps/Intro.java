package HashMaps;

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("satyam", 97);
        map.put("payal", 97);
        map.put("shivam", 97);
        map.put("satyam", 9);
        System.out.println(map);
        System.out.println(map.remove("satyam",45));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("satyam"));
        for (String key : map.keySet()) {
            System.out.println(key+": "+map.get(key));
            
        }
 
    }
}
