package spring.dao;

import spring.model.Employee;

public interface EmployeeDao {
  void saveInDatabase(Employee employee);
}
