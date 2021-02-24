package defaults;

@FunctionalInterface
public interface Thing {
  default int methodOne() {
    return 1;
  }

  int methodTwo(); // Single Abstract Method

  default int methodThree() {
    return 3;
  }
}

class ThingImpl implements Thing {
  @Override
  public int methodTwo() {
    return 0;
  }
}