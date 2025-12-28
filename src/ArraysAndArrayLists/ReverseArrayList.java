package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(5);
        System.out.println(list);
        reverseList(list); // or we use built-in method Collections.reverse(list)
        System.out.println(list); // Collections.reverse(list)
        Collections.sort(list); // by default ascending order
        System.out.println(list);
        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        list2.add("Virat");
        list2.add("Katiyar");
        list2.add("PowerFul Man");
        list2.add("Vital"); // lexicographically - means if first char is same then compare to second like that
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

    }
    static void reverseList(List<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            Integer temp = Integer.valueOf(list.get(i)); // revision
            list.set(i, list.get(j));
            list.set(j, temp);
            i ++;
            j --;
        }
    }
}
