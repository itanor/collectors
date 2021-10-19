package collectors.app;

public class Employee {

  private String name;
  private Integer age;
  private Double salary;

  public Employee(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public Double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
    return "Employee Name: " + name;
  }
}
