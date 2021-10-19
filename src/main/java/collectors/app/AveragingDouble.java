package collectors.app;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.averagingDouble;

import java.util.List;

public class AveragingDouble {

  public static void main(String... args) {
    List<Double> list = asList(4.0, 8.0, 7.9);

    Double result = list.stream().collect(averagingDouble(num -> num));

    System.out.println(result);
  }
}
