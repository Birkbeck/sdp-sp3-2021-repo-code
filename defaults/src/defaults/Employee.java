package defaults;

import java.math.BigDecimal;
import java.util.List;

public interface Employee {

  static String getEmployeeInfo(List<Employee> employeeList) {
    StringBuilder info = new StringBuilder();
    for (Employee employee : employeeList) {
      info.append(employee.getEmployeeInfo());
      info.append('\n');
    }
    return info.toString();
  }

  String getName();

  String getDept();

  BigDecimal getSalary();

  default BigDecimal getBonus() {
    return getSalary().multiply(new BigDecimal(0.10));
  }

  default String getEmployeeInfo() {
    return "Name: " + getName() +
            ", Dept: " + getDept() +
            ", Salary " + getSalary() +
            ", Bonus " + getBonus();
  }
}
