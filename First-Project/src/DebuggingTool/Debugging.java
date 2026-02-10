package DebuggingTool;

public class Debugging {
    public static void main(String a[]){
        int num1=10;
        int num2=20;
        int result=sum(num1,num2);
        System.out.println(result);
        printData();
        System.out.println(reverseNumber(456));
    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void printData(){
        System.out.println("Printing Data 1");
        System.out.println("Printing Data 2");
    }

    public static int reverseNumber(int a){
        int reverse=0;
        while(a>0){
            int temp=a%10;
            reverse=reverse*10+temp;
            a=a/10;
        }
        return reverse;
    }
}
