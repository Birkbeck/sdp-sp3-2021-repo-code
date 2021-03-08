package fivedipfactory;

public class NoSQLConnection implements DBConnection {
  private ConnectionString connectionString;

  public NoSQLConnection(){}

  public NoSQLConnection(ConnectionString connectionString){
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
