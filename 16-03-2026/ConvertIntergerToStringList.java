import java.util.*;
import java.util.stream.*;

public class ConvertIntergerToStringList{
	public static void main(String[] args){
		List<Integer>list=List.of(1,2,3,3,4);
		list.stream().map(String::valueOf).forEach(System.out::println);
	}
}