//Find Intersection of two lists.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5));
        List<Integer> list2 = Arrays.asList(5, 4, 9, 8, 7, 7, 10);
        System.out.println(list1.stream().filter(i->list2.contains(i)).toList());
    }
}
