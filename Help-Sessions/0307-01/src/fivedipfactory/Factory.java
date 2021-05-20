package fivedipfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Factory {
  private static final String LOCATION = "res/config.props";
  private Factory(){}

  public static DBConnection of(){

    try (var fis = new FileInputStream(LOCATION)){
      Properties props =new Properties();
      props.load(fis);
      Class cs = Class.forName(props.getProperty("connectionString"));
      Class db = Class.forName(props.getProperty("databaseConnection"));
      var csInstance = (ConnectionString) cs.getConstructor().newInstance();
      var dbInstance = (DBConnection) db.getConstructor().newInstance();

      dbInstance.setConnectionString(csInstance);

      return dbInstance;

    } catch (IOException | ClassNotFoundException  | NoSuchMethodException |
      InvocationTargetException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }
}
