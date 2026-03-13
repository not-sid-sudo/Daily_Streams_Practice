import java.util.*;
import java.util.stream.*;

public class SortStringReverse{
	public static void main(String[] args){
		List<String> list=Arrays.asList("asf","aer","zer","iuy");
		System.out.println("OG list:" );
		list.forEach(System.out::println);
		Collections.sort(list,(String a,String b)->{
			return b.compareTo(a);
		});
		System.out.println("Reversed list:" );
		list.forEach(System.out::println);
	}
}