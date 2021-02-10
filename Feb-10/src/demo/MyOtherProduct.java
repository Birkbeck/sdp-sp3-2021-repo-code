package demo;

import java.util.Objects;

public class MyOtherProduct implements Product {
  private String description;
  private float price;

  public MyOtherProduct(String description, float price) {
    this.description = description;
    this.price = price;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public float getPrice() {
    return price;
  }

  @Override
  public void setPrice(float price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product)) return false;
    Product myProduct = (Product) o;
    return Float.compare(myProduct.getPrice(), getPrice()) == 0 && getDescription().equals(myProduct.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getDescription(), getPrice());
  }

  @Override
  public String toString() {
    return "MyOtherProduct{" +
      "description='" + description + '\'' +
      ", price=" + price +
      '}';
  }
}
