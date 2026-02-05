package Map;

import java.util.HashMap;

public class Mappracties {
    public static void main(String []a){
        HashMap <Integer,String> map=new HashMap<>();
        map.put(100,"Naveed");
        map.put(102,"Desai");
        map.put(101,"Roma");
        System.out.println("Value of key 100:"+map.get(100));
        System.out.println("Removed value at key 102: "+map.remove(102));
        System.out.println("key 100 is present ? :"+map.containsKey(100));
        System.out.println("Value Naveed is present ? : "+map.containsValue("Naveed"));
        System.out.println("Is map empty: "+map.isEmpty());
        System.out.println("All keys: "+map.keySet());
        System.out.println("All Values: "+map.values());
    }
}
