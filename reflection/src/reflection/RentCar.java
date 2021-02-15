package reflection;

/*
 * An example class to use for reflection
 */
public class RentCar {
  public int price;    // just so that it is different to the others
  private int rate;
  private String type;

  public RentCar() { this(0); }

  public RentCar(int length) {
    if (length < 455) {
      type = "small";
      rate = 35;
    } else if ((length >= 455) && (length < 495)) {
      type = "mid-sized";
      rate = 45;
    } else if (length >= 495) {
      type = "large";
      rate = 55;
    }
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void computeRentalCost(int numDays) {
    price = numDays * rate;
    System.out.println("The cost of your rental car is " + price + " euros");
  }
}