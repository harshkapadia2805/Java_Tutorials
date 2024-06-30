public class java_35_ps {
    static void multi(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }
    }

    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }
    }

    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for(int j=4;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){
        if(n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {

        //problem1
        //multi(7);

        //problem2
        //pattern1(4);

        //problem3
        //int c = sumRec(4);
        //System.out.println(c);

        //problem4
        //pattern2(4);

        //problem5
        int result = fib(7);
        System.out.println(result);
    }
}
