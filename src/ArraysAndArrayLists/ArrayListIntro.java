package ArraysAndArrayLists;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
       // Arraylist is mutable , size can be changed similar to vectors in c++ , called dynamic arrays
       // syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(234);
//        list.add(34);
//        list.add(32);
//        list.add(-75);
//        list.addFirst(82);
//        list.set(0, 99);
//        list.remove(2);
        System.out.println(list); // prints directly calls toString internally
        Scanner scan = new Scanner(System.in);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }

        //get items
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
