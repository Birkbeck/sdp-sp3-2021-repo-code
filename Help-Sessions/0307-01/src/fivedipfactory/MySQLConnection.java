package fivedipfactory;

public class MySQLConnection implements DBConnection {
  private ConnectionString connectionString; // = new PasswordConnectionString();

  public MySQLConnection(){}

  public MySQLConnection(ConnectionString connectionString) {
    this.connectionString = connectionString;
  }

  @Override
  public void setConnectionString(ConnectionString cs) {
    connectionString = cs;
  }

  @Override
  public String toString(){
    return getClass().getName() + " using " + connectionString.toString();
  }
}
