package HackerRankQuestions.JumpingCloud;

import java.util.ArrayList;
import java.util.List;

public class JumpingCloud {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int count=0,n=0;
        while(n<c.size()-1){
            if(n<c.size()-2 && c.get(n+2)==0 ){
                n+=2;
            }else{
                n+=1;
            }
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        List<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        System.out.println(jumpingOnClouds(list));
    }
}
