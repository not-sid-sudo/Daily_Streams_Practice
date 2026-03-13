import java.util.*;
import java.util.stream.*;

public class DistinctEvenNumbers{
	public static void main(String[]args){
		List<Integer> list=Arrays.asList(1,2,3,4,5,2,6,7,8,6,8,9,10);
		list.stream().filter(i->i%2==0).collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).forEach(e->System.out.println(e.getKey()));
	}
}