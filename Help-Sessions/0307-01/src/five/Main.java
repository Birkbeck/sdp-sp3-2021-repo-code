package five;

public class Main {
  public static void main(String[] args) {
    // constructor injection of the dependency
    ConnectionString connectionString = new PasswordConnectionString();
    DBConnection mySQLConnection = new MySQLConnection(connectionString);
    System.out.println(mySQLConnection);

    // mutator injection of the dependency
    ConnectionString tokenCS = new TokenConnectionString();
    DBConnection noSQLConnection = new NoSQLConnection();
    noSQLConnection.setConnectionString(tokenCS);
    System.out.println(noSQLConnection);

    var cs = new TokenConnectionString();
    var db  = new MySQLConnection();
    db.setConnectionString(cs);
    System.out.println(db);
  }
}
