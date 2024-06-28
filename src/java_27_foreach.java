public class java_27_foreach {
    public static void main(String[] args) {
        int [] marks = {10,20,30,40,50};
        System.out.println(marks.length);

//        for (int i=0;i< marks.length;i++){
//            System.out.print(" "+marks[i]);
//        }

        for(int i : marks){
            System.out.println(i);
        }
    }
}
