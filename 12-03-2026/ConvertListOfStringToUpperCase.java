import java.util.*;

public class ConvertListOfStringToUpperCase{
	public static void main(String[] args){
		List<String> input=Arrays.asList("lower","Case","sTRing","heRe","PLEASE");
		System.out.println("UpperCase Strings:");
		input.stream().map(s->s.toUpperCase()).forEach(System.out::println);
	}
}