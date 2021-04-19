import java.util.Arrays;
import java.util.stream.*;
import java.util.List;
public class Shreyash {

	public static void main(String[] args) {
IntStream
	.range(1, 11)
	.skip(4)
	.forEach(x->System.out.println(x));
	System.out.println();
	System.out.println(
			IntStream 
			.range(1, 10)
			.sum());
	Stream.of("Santanu","Amit","Shreyash")
	.sorted()
	.findFirst()
	.ifPresent(System.out::println);
	System.out.println();
	String [] names= {"Santanu","Amit","Santosh","Rakesh","Lalit","Shreyash"};
	Arrays.stream(names)
	.filter(x->x.startsWith("S"))
	.sorted()
	.forEach(System.out::println);
	Arrays.stream(new int[] {5,4,3,2})
	.map(x->x*x)
	.average()
	.ifPresent(System.out::println);
	List<String> people=Arrays.asList("Santanu","Amit","Santosh","Rakesh","Akash","Shreyash");
	people
	.stream()
	.map(String::toLowerCase)
	.filter(x->x.startsWith("a"))
	.forEach(System.out::println);
	}
}
