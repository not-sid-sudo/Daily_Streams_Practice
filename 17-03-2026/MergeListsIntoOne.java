//Merge Two Lists into a Single List.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeListsIntoOne {
    public static void main(String[] args){
        List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,4,5));
        List<Integer> list2=Arrays.asList(5,4,9,8,7,7,10);
//        list2.forEach(list1::add);
        System.out.println(Stream.concat(list2.stream(), list1.stream()).toList());
    }
}
