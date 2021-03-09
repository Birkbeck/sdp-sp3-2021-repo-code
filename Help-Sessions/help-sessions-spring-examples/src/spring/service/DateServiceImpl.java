package spring.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

/*
 * @Service marks this class as Auto-detectable bean on business layer.
 * We will inject this class into main service bean.
 */

@Service("dateService")
public class DateServiceImpl implements DateService {
  @Override
  public LocalDate getNextAssessmentDate() {
    return LocalDate.of(2015, 10, 10);
  }
}
