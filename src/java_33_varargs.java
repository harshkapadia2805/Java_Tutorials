public class java_33_varargs {
    static int sum(int x, int ...arr){
//        available as int [] arr
        int result=x ;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5));
    }
}
