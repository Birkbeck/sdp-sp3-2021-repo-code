package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.dao.EmployeeDao;
import spring.model.Employee;

/*
 * EmployeeService is our main service class.Notice that we have injected both DateService and EmployeeDao in this.
 * @Autowired on dateService property marks the DateService to be auto-wired by Spring’s dependency injection
 * with the appropriate bean in Spring context.
 * In this case, we have already declared a DateService bean using @Service, so that bean will be injected here.
 * Similarly, employeeDao will be injected by EmployeeDao annotated with @Repository.
 */

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  private DateService dateService;

  @Autowired
  private EmployeeDao employeeDao;

  @Override
  public void registerEmployee(Employee employee) {
    employee.setAssessmentDate(dateService.getNextAssessmentDate());
    employeeDao.saveInDatabase(employee);
  }
}
