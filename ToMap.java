import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class ToMap {

  public static void main(String... args) {
	  List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

    Map<String, Integer> result = givenList.stream()
		  .collect(Collectors.toMap(Function.identity(), String::length));

    System.out.println(result);
	}
}

