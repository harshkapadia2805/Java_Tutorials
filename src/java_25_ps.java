public class java_25_ps {
    public static void main(String[] args) {

//        question1
//        int n=4;
//        for (int i=n;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        question2
//        int sum=0;
//        int n=4;
//        int i=0;
//        while (i<n){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println(sum);


//        question3
//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n , i , n*i);
//        }

//        question4
//        int n=10;
//        for(int i=10;i>0;i--){
//            System.out.printf("%d X %d = %d\n", n , i , n*i);
//        }


//        question5
//        int n=5;
//        int fact=1;
//        for (int i=1;i<=n;i++){
//            fact *= i;
//        }
//        System.out.println(fact);


//        question6
//        int n=5;
//        int i=1;
//        int fact=1;
//        while (i<=n){
//            fact *= i;
//            i++;
//        }
//        System.out.println(fact);


//        question9
        int n=8;
        int sum=0;
        for(int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n", n , i , n*i);
            sum =sum +(n*i);
        }
        System.out.println(sum);
    }
}
