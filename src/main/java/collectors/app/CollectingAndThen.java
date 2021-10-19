package collectors.app;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.maxBy;

import java.util.List;

public class CollectingAndThen {

  static List<Employee> employees = asList(new Employee("Tom Jones", 45, 7000.00),
      new Employee("Ethan Hardy", 65, 8000.00), new Employee("Nancy Smith", 22, 10000.00),
      new Employee("Deborah Sprightly", 29, 9000.00));

  public static void main(String... args) {
    String maxSalaryName = employees.stream()
        .collect(collectingAndThen(
            maxBy(comparing(Employee::getSalary)),
            emp -> emp.isPresent() ? emp.get().getName() : "none")
         );

    out.println(format("Max salaried employee's name: %s", maxSalaryName));
  }
}
