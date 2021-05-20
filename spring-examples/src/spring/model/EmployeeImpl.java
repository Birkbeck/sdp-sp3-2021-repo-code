package spring.model;

import java.time.LocalDate;

public class EmployeeImpl implements Employee {
  private int id;
  private String name;

  private LocalDate assessmentDate;

  @Override
  public int getId() {
    return id;
  }

  @Override
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public LocalDate getAssessmentDate() {
    return assessmentDate;
  }

  @Override
  public void setAssessmentDate(LocalDate assessmentDate) {
    this.assessmentDate = assessmentDate;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", assessmentDate="
            + assessmentDate + "]";
  }
}
