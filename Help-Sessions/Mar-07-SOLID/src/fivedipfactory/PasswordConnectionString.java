package fivedipfactory;

public class PasswordConnectionString implements ConnectionString {
  @Override
  public String toString(){
    return "+ " + getClass().getName();
  }
}
