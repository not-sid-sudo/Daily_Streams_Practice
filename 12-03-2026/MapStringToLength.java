import java.util.*;
import java.util.stream.*;

public class MapStringToLength{
	public static void main(String[] args){
		List<String> list=Arrays.asList("insert","list","here","anytime","dma");
		Map<String,Integer> mp=list.stream().collect(Collectors.toMap( s->s, s->s.length()));
		mp.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}
}