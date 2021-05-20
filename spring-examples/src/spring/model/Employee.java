package spring.model;

import java.time.LocalDate;

public interface Employee {
  int getId();

  void setId(int id);

  String getName();

  void setName(String name);

  LocalDate getAssessmentDate();

  void setAssessmentDate(LocalDate assessmentDate);
}
