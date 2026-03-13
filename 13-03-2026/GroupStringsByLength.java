import java.util.stream.*;
import java.util.*;

public class GroupStringsByLength{
	public static void main(String[] args){
		List<String> list=Arrays.asList("gay","means","happy","dont","be","gay");
		list.stream().collect(Collectors.groupingBy(e->e.length())).entrySet().forEach(e->System.out.println(e.getKey()+": "+e.getValue()));
	}
}