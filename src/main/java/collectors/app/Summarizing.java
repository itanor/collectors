package collectors.app;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.summarizingInt;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Summarizing {

  public static void main(String... args) {
    List<Employee> list = asList(
        new Employee("John", 23, 4000.00), 
        new Employee("Mary", 28, 5100.00),
        new Employee("Bob", 32, 5000.00), 
        new Employee("Eric", 32, 5500.00));

    IntSummaryStatistics result = list.stream()
        .collect(summarizingInt(Employee::getAge));

    out.println(result);
    result.accept(35);
    out.println(result);
  }
}
