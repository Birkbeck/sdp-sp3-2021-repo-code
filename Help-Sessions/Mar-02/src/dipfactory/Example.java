package dipfactory;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example {
  public static void main(String... args){
    //DBConnection db = new MySQLConnection(new OddConnectionString());
    //var ls = List.of(1,2,3,4); // devolve to "of" method which returns an ArrayList/LinkedList etc.

    // separation of specification (what I want it to do) from the from the implementation (how to do it).
    // List<Integer> lsint = new ArrayList<>();
    // lsint.add(1); lsint.add(2); //...
    
    // Same as above but using a factory method to give us independence from a specific implementation
    DBConnection db = DBFactory.getInstance();
  }
}

class DBFactory {
  private static DBConnection dbc;
  private static ConnectionString cs;

  static {
    Properties props = new Properties();
    try (var fis = new FileInputStream("dipfactory/config.props")){
      props.load(fis);
      Class databaseConnection = Class.forName(props.getProperty("databaseConnection"));
      dbc = (DBConnection) databaseConnection.newInstance();
      Class connectionString = Class.forName(props.getProperty("connectionString"));
      cs = (ConnectionString) connectionString.newInstance();
      dbc.setConnectionString(cs);  
    } 
    catch (IOException | ClassNotFoundException | InstantiationException| IllegalAccessException ex){
      System.err.println(ex);
    }
  }

  private DBFactory(){}

  static DBConnection getInstance(){
    //...
    // DBConnection db = new MySQLConnection();
    // ConnectionString cs = new OddConnectionString();
    // db.setConnectionString(cs);
    // //DBConnection db = new MySQLConnection(new OddConnectionString());
    return dbc;
  }
}

interface DBConnection {
  public boolean connect(String s);
  public String getConnection();
  public void setConnectionString(ConnectionString str);
  public boolean query(String s);
}

interface ConnectionString {
  public void loginID(String s);
}

class MySQLConnection implements DBConnection {
  private ConnectionString str; // = new OddConnectionString();

  public MySQLConnection(){
    System.out.println("Using " + getClass());
  }
  public MySQLConnection(ConnectionString s){  
    str = s;
    System.out.println("Using " + getClass());
  }
  public boolean connect(String s) { return true;}
  public String getConnection() { return "";}
  public void setConnectionString(ConnectionString str){
    this.str = str;
  } 
  public boolean query(String s) { return true;}
}

class NoSQLConnection implements DBConnection {
  private ConnectionString str;

  public NoSQLConnection(){
    System.out.println("Using " + getClass());
  }
  public NoSQLConnection(ConnectionString s){  str = s;}
  public boolean connect(String s) { return true;}
  public String getConnection() { return "";}
  public boolean query(String s) { return true;}
  public void setConnectionString(ConnectionString str){
    this.str = str;
  } 
}

class OddConnectionString implements ConnectionString {
  public OddConnectionString(){
    System.out.println("Using " + getClass());
  }
  public void loginID(String s){}
}

class AnotherOddConnectionString implements ConnectionString {
  public AnotherOddConnectionString(){
    System.out.println("Using " + getClass());
  }
  public void loginID(String s){}
}
