import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.lang.String.format;

public class CollectingAndThen {

  static List<Employee> employees = Arrays.asList(
    new Employee("Tom Jones", 45, 7000.00),
    new Employee("Ethan Hardy", 65, 8000.00),
    new Employee("Nancy Smith", 22, 10000.00),
    new Employee("Deborah Sprightly", 29, 9000.00)
	);

  public static void main(String... args) {
	  String maxSalaryName = employees.stream()
		  .collect(
        Collectors.collectingAndThen(
          Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
					(Optional<Employee> emp) -> emp.isPresent() ? emp.get().getName() : "none"
				)
			);

    System.out.println(format("Max salaried employee's name: %s", maxSalaryName));
	}
}

