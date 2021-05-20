package spring.dao;

import org.springframework.stereotype.Repository;
import spring.model.Employee;

/*
 * @Repository annotation marks this class as an Auto-detectable bean on persistence layer.
 * Parameter to this annotation employeeDao provides a name to this bean.
 * We will inject this class into main service bean.
 */

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
  @Override
  public void saveInDatabase(Employee employee) {
    /*
     * Logic to save in DB goes here
     */
    System.out.println("Employee " + employee.getName() + " is registered for assessment on "
            + employee.getAssessmentDate());
  }
}
