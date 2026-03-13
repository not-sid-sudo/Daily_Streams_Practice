import java.util.*;
import java.util.stream.*;

public class PartitionByType{
	public static void main(String[] args){
		List<Integer> list=Arrays.asList(1,2,23,4,56,7,8,9);
		list	.stream()
			.collect(Collectors.partitioningBy(e->e%2==0))
			.entrySet()
			.forEach(
				e->System.out.println(
					(e.getKey()?"even":"odd") + ": " + e.getValue()
			)
		);
	}
}