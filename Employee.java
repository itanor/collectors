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

	public Double getSalary() {
    return salary;
	}

  public String toString(){
    return "Employee Name: " + name;
  }
}
