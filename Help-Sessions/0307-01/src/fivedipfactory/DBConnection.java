package fivedipfactory;

public interface DBConnection {
  void setConnectionString(ConnectionString cs);

  @Override
  String toString();
}
