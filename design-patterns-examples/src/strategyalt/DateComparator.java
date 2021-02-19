package strategyalt;

import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator {
  @Override
  public int compare(Object o1, Object o2) {
    return ((Date) o1).compareTo((Date) o2);
  }
}