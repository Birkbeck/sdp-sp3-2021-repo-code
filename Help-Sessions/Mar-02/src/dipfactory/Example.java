package dipfactory;;

public class Example {
  public static void main(String... args){
    DBConnection db = new MySQLConnection(new OddConnectionString());
  }
}

interface DBConnection {
  public boolean connect(String s);
  public String getConnection();
  public boolean query(String s);
}

interface ConnectionString {
  public void loginID(String s);
}

class MySQLConnection implements DBConnection {
  private ConnectionString str; // = new OddConnectionString();

  public MySQLConnection(ConnectionString s){  str = s;
  System.out.println("Using: " + str.getClass());}
  public boolean connect(String s) { return true;}
  public String getConnection() { return "";}
  public boolean query(String s) { return true;}
}

class NoSQLConnection implements DBConnection {
  private ConnectionString str;

  public NoSQLConnection(ConnectionString s){  str = s;}
  public boolean connect(String s) { return true;}
  public String getConnection() { return "";}
  public boolean query(String s) { return true;}
}

class OddConnectionString implements ConnectionString {
  public void loginID(String s){}
}

class AnotherOddConnectionString implements ConnectionString {
  public void loginID(String s){}
}
