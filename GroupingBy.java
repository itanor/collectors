import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.Arrays.asList;
import java.util.stream.Collectors;

public class GroupingBy {

  public static void main(String... args) {
	  List<Employee> list = asList(
      new Employee("John", 23, 4000.00),
      new Employee("Mary", 28, 5000.00),
			new Employee("Bob", 32, 5000.00),
			new Employee("Eric", 32, 5500.00)
		);

    Map<Integer, List<Employee>> result = list.stream()
		  .collect(Collectors.groupingBy(Employee::getAge));

    System.out.println(result);
	}
}

