package prototype;

class Client {
  public static void main(String[] args) {
    Registry registry = new Registry();
    Book myBook = (Book) registry.createBasicItem("Book");
    myBook.setTitle("Title");
  }
}

class Registry {

  public Object createBasicItem(String book) {
  }
}

interface Book {

  void setTitle(String title);
}

abstract class Item { // Prototype
  private String title;
  private double price;

  public Item clone() throws CloneNotSupportedException {
    Item clonedItem = null;
    clonedItem = (Item) super.clone();
    clonedItem.price = price;
    clonedItem.title = title;
    return clonedItem;
  }
}
