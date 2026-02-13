package src.RearrangePalindrome;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isPalindrome(s));
    }

    public static String isPalindrome(String s){
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(list.contains(c)){
                list.remove(c);
            }else{
                list.add(c);
            }
        }
        if(list.size()>1)
                return "Not palindrome";
        return "Palindrome";
    }
}
