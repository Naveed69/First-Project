package HackerRankQuestions.GemStones;

import java.util.*;

public class GemStones {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        list.add("naveed");
        list.add("desai");
        list.add("roma");
        System.out.println(gemstones(list));
    }

    public static int gemstones(List<String> arr) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<arr.get(0).length();i++){
            set.add(arr.get(0).charAt(i));
        }
        for(int i=1;i<arr.size();i++){
            Set<Character> c=new HashSet<>();
            for(char s:arr.get(i).toCharArray()){
                if(set.contains(s)){
                    c.add(s);
                }
            }
            set=c;
        }

        return set.size();
    }
}
