package HackerRankQuestions.NumberLineJumps;
import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        while(true){
            if((x1<x2 && v1<v2) || v1==v2 || (x1>x2 && v1>v2))
                return "No";
            x1+=v1;
            x2+=v2;
            if(x1==x2)
                break;
        }
        return "Yes";
    }

}

public class NumberLineJumps {
    public static void main(String[] args) throws IOException {
        int x1 = 0;
        int v1 =3;
        int x2 = 4;
        int v2 =2;
        String result = Result.kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
