import java.util.*;
import java.util.stream.*;

public class SummaryStats{
	public static void main(String[] args){
		List<Integer> list=Arrays.asList(1,2,46,7,8,5322,34);
		System.out.print(list.stream().mapToInt(Integer::valueOf).summaryStatistics());
	}
}