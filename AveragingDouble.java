import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.Arrays.asList;
import java.util.stream.Collectors;

public class AveragingDouble {

  public static void main(String... args) {
	  List<Double> list = asList(4.0, 8.0, 7.9);

    Double result = list.stream()
		  .collect(Collectors.averagingDouble(num -> num));

    System.out.println(result);
	}
}

