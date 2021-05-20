package fivedipfactory;



public class Main {
  public static void main(String[] args) {
      // constructor injection of the dependency
//    ConnectionString connectionString = new PasswordConnectionString();
//    DBConnection mySQLConnection = new MySQLConnection(connectionString);
//    System.out.println(mySQLConnection);

    // var list = List.of(1,2,3); // example of a factory method
    DBConnection db = Factory.of();

    System.out.println(db);
  }
}
