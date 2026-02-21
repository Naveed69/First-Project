package HackerRankQuestions.PatternStairCase;

import java.util.Scanner;

public class StairCase {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        System.out.println("---------------------");
        stairCase(n);

    }

    public static void stairCase(int n){
        for(int i=1;i<=n;i++){

            StringBuilder sb=new StringBuilder();
            for(int j=n;j>0;j--){
                if(j>i)
                    sb.append("  ");
                else if(j!=1)
                    sb.append("# ");
                else sb.append("#");
            }
            System.out.println(sb);
        }
    }
}
