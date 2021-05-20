package srp;

public class User {
  public void createPost(Database db, String message){
    try {
      db.add(message);
    }
    catch (Exception ex) {
      db.logError("An error occurred " + ex);
      writeToFile("localerrors.txt", ex);
    }
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
