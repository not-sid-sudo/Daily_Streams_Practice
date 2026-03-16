import java.util.*;
import java.util.stream.*;

public class FlattenList{
	public static void main(String[]args){
		List<List<Integer>> list=List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));

		list.stream().flatMap(l->l.stream()).forEach(System.out::println);
	}
}