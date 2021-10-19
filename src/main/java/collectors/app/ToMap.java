package collectors.app;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;

public class ToMap {

  public static void main(String... args) {
    List<String> list = asList("a", "bb", "ccc", "dd");

    Map<String, Integer> result = list.stream()
        .collect(toMap(identity(), String::length));

    out.println(result);
  }
}
