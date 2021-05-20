package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring.configuration.AppConfig;
import spring.model.Employee;
import spring.model.EmployeeImpl;
import spring.service.EmployeeService;

public class AppMain {
  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    // OR

    //    AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

    // OR

    //    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    //    context.scan("spring");
    //    context.refresh();

    EmployeeService service = (EmployeeService) context.getBean("employeeService");

    /*
     * Register employee using service
     */
    Employee employee = new EmployeeImpl();
    employee.setName("Fred Bloggs");
    service.registerEmployee(employee);

    context.close();
  }
}
