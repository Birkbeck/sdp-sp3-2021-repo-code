package guice;

import com.google.inject.Inject;

public class BillingService {
  private final CreditCardProcessor processor;
  private final TransactionLog transactionLog;

  @Inject
  public BillingService(CreditCardProcessor processor,
                        TransactionLog transactionLog) {
    this.processor = processor;
    this.transactionLog = transactionLog;
  }

  public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    return "CCP " + processor + "\n" + "Trans " + transactionLog;
  }
}