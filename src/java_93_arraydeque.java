import java.util.ArrayDeque;

public class java_93_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(1);
        ad1.addLast(99);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
//        for (int i = 0; i <ad1.size(); i++) {
//            System.out.print(ad1.get(i));
//            System.out.print(", ");
//        }
    }
}
