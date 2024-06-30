public class java_32_method_overloading {
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good"+a+"morning");
    }
    static void foo(int a, int b){
        System.out.println("good"+a+"morning");
        System.out.println("good"+b+"morning");
    }
    static void change(int a){
        a=100;
    }
    static void change2(int [] arr){
        arr[0]=100;
    }

    static void tellJoke(){
        System.out.println("New word\n"+"Plagarism");
    }

    public static void main(String[] args) {
//        tellJoke();

//        case 1: changing the integer
//        int x=99;
//        change(x);
//        System.out.println(x);

//        case 2: changing the array
//        int [] marks = {12,34,45,56,78};
//        change2(marks);
//        System.out.println(marks[0]);


//        method overloading
        foo();
        foo(2);
        foo(2,3);

    }
}
