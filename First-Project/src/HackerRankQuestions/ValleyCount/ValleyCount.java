package HackerRankQuestions.ValleyCount;

public class ValleyCount {
    public static void main(String args[]){
//   DDUDUUUD
//          _/\_
//   \    /
//    \/\/
        System.out.println(Valley("UUDDDUDDUU"));
    }

    public static int Valley(String a){
        int result=0,count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='U'){
                count++;
                if(count==0)
                    result++;
            }else {
                count--;
            }

        }
        return result;
    }
}
