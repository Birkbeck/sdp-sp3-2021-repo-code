package five;

public interface DBConnection {
  void setConnectionString(ConnectionString cs);

  @Override
  String toString();
}
