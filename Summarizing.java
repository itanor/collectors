import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.function.Function;

import static java.util.Arrays.asList;
import java.util.stream.Collectors;

public class Summarizing {

  public static void main(String... args) {
	  List<Employee> list = asList(
      new Employee("John", 23, 4000.00),
      new Employee("Mary", 28, 5100.00),
			new Employee("Bob", 32, 5000.00),
			new Employee("Eric", 32, 5500.00)
		);

    IntSummaryStatistics result = list.stream()
		  .collect(Collectors.summarizingInt(Employee::getAge));

    System.out.println(result);
		result.accept(35);
    System.out.println(result);
	}
}

