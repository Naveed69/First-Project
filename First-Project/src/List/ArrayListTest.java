package List;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListTest {
    public static void main(String ar[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(10);
        System.out.println("is 20 present in list? "+list.contains(20));
        System.out.println("size of list: "+list.size());
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("first index of 10: "+list.indexOf(10));
        System.out.println("Last index of 10: "+list.lastIndexOf(10));
        Collections.sort(list);
        System.out.println("Sorted list: "+list);
        System.out.println("Removed item is:"+list.remove(1));
        System.out.println("after removing list is : "+list);
        list.clear();
        System.out.println("Cleared all values from the list "+list);
    }
}
