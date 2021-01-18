package guice;

public class DatabaseTransactionLog implements TransactionLog {
  public String toString() {
    return getClass().getName();
  }
}
