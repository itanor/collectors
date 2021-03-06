import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toMap;

public class ToMapEvictCollision {

  public static void main(String... args) {
	  List<String> givenList = asList("a", "bb", "ccc", "dd", "bb");

    Map<String, Integer> result = givenList.stream()
		  .collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));

    System.out.println(result);
	}
}

