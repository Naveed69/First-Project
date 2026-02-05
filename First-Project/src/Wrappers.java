public class Wrappers {

    public static void main(String ar[]){
        Integer a=122;
//         Integer b=new Integer(12); not valid now a days
        Integer b=Integer.valueOf("122");
        System.out.println(a==b);
    }
}
