package collectors.app;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;

public class PartitioningBy {

  public static void main(String... args) {
    List<Employee> list = asList(
        new Employee("John", 23, 4000.00), 
        new Employee("Mary", 28, 5100.00),
        new Employee("Bob", 32, 5000.00), 
        new Employee("Eric", 32, 5500.00));

    Map<Boolean, List<Employee>> result = list.stream()
        .collect(partitioningBy(emp -> emp.getSalary() > 5000.00));

    out.println(result);
  }
}
