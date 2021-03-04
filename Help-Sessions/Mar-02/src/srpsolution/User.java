package srpsolution;

public class User {
  private ErrorLogger errorLogger = new ErrorLogger();

  public void createPost(Database db, String message) {
    try {
      db.add(message);
    } catch (Exception ex) {
      errorLogger.log(db, ex);
    }
  }

}

class ErrorLogger {

  public void log(Database db, Exception ex) {
    db.logError("An error occurred " + ex);
    writeToFile("localerrors.txt", ex);
  }

  private void writeToFile(String s, Exception ex) {
  }
}

class Database {
  public void add(String message) {
  }

  public void logError(String s) {
  }
}
