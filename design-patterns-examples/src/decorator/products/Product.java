package decorator.products;

public abstract class Product {
  private float mPrice;

  public Product(float price) {
    mPrice = price;
  }

  public float getPrice() {
    return mPrice;
  }
}
