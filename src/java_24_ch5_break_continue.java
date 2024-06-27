public class java_24_ch5_break_continue {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("java");
            if (i==2){
                System.out.println("end");
                break;
            }
        }

        for(int i=0;i<5;i++){

            if (i==2){
                System.out.println("end");
                continue;
            }

            System.out.println(i);
            System.out.println("java");
        }

    }
}
