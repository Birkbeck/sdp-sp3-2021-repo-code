package decorator.products;

public class DVD extends Product {
  private String mtitle;

  public DVD(String title, float price) {
    super(price);
    mtitle = title;
  }
}
