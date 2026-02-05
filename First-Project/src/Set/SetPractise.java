package Set;

import java.util.HashSet;

public class SetPractise {
    public static void main(String a[]){
        HashSet <String> h=new HashSet<>();
        h.add("One");
        h.add("Two");
        h.add("Three");
        h.add("four");
        System.out.println("Values in my set are:"+h);
        System.out.println("Does it has One: "+h.contains("One"));
        System.out.println("The size of set is:"+h.size());
        System.out.println("remove One from it: "+h.remove("One"));
        System.out.println("Is it empty:"+ h.isEmpty());
        System.out.println("Final values in set are: ");
        for(String s:h){
            System.out.println(s);
        }
        h.clear();

        System.out.println("Final values in set are: "+h);
    }
}
